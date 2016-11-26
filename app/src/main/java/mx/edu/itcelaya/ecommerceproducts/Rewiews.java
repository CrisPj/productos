package mx.edu.itcelaya.ecommerceproducts;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;


public class Rewiews extends AppCompatActivity {
    ListView listReviews;
    List<Review> items = new ArrayList<Review>();
    String consumer_key = "ck_937c6fcaa34debb9f047afcf4d46b6c055518e44";
    String consumer_secret = "cs_bd73d50ea69576596774a0d8487ebf067e377307";
    String url = "https://192.168.43.223/wordpress/wc-api/v3/products/";
    String jsonResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewiews);
        listReviews = (ListView) findViewById(R.id.listReviews);
        MainActivity.NukeSSLCerts.nuke();
        LoadReviews();
    }

    private void LoadReviews() {
        LoadReviewsTask tarea = new LoadReviewsTask(this, consumer_key, consumer_secret);
        try {
            Bundle extras = getIntent().getExtras();
            int ud = extras.getInt("ITEM_ID");
            url = url + ud + "/reviews";
            jsonResult = tarea.execute(new String[] { url }).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        //Toast.makeText(getBaseContext(), jsonResult, Toast.LENGTH_LONG).show();
        ListReviews();
    }

    private void ListReviews() {
        try {
            //lbl1.setText(jsonResult);
            JSONObject jsonResponse = new JSONObject(jsonResult);
            JSONArray jsonMainNode = jsonResponse.optJSONArray("product_reviews");
            for (int i = 0; i < jsonMainNode.length(); i++) {
                JSONObject jsonChildNode = jsonMainNode.getJSONObject(i);
                int id_review = jsonChildNode.optInt("id");
                String autor = jsonChildNode.optString("reviewer_name");
                String email = jsonChildNode.optString("reviewer_email");
                String review = jsonChildNode.optString("review");

                items.add(new Review(id_review, autor,email, review));
            }
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), "Error" + e.toString(),
                    Toast.LENGTH_LONG).show();

        }

        listReviews.setAdapter(new ReviewsAdapter(this, items));
    }

}
