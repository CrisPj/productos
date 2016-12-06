package mx.edu.itcelaya.ecommerceproducts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.gson.Gson;


public class Products extends AppCompatActivity {
    ListView listReviews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        listReviews = (ListView) findViewById(R.id.listProducts);
        MainActivity.NukeSSLCerts.nuke();
        LoadReviews();
    }

    private void LoadReviews() {
        Bundle extras = getIntent().getExtras();
        String json = extras.getString("ITEM_ID");
        Gson gson = new Gson();
        Line_itemElement items[] = gson.fromJson(json,Line_itemElement[].class);
        ListReviews(items);
    }

    private void ListReviews(Line_itemElement[] items) {
        listReviews.setAdapter(new ProductsAdapter(this, items));
    }

}
