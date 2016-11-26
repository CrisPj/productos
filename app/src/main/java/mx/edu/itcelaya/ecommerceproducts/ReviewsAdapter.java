package mx.edu.itcelaya.ecommerceproducts;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by niluxer on 5/16/16.
 */
public class ReviewsAdapter extends BaseAdapter {
    private Context context;
    private List<Review> reviews;

    public ReviewsAdapter(Context context, List<Review> reviews) {
        super();
        this.context = context;
        this.reviews = reviews;
    }

    @Override
    public int getCount() {
        return this.reviews.size();
    }

    @Override
    public Object getItem(int position) {
        return this.reviews.get(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View rowView = view;
        if (rowView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.list_reviews, null);
        }

        TextView tvAutor   = (TextView) rowView.findViewById(R.id.tvAutor);
        TextView tvEmail  = (TextView) rowView.findViewById(R.id.tvEmail);
        TextView tvDesc = (TextView) rowView.findViewById(R.id.tvDesc);

        final Review item = this.reviews.get(position);
        tvAutor.setText(item.getReviewer_name());
        tvEmail.setText(item.getReviewer_email());
        tvDesc.setText(item.getRewiew());
        rowView.setTag(item.getId());
        //String sUrl = "http://gravatar.com/avatar/1c57c8eea18ec3bbf43b81432e61132f";
        return rowView;

    }

}
