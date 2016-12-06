package mx.edu.itcelaya.ecommerceproducts;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Build;
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
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/**
 * Created by niluxer on 5/16/16.
 */
public class OrdersAdapter extends BaseAdapter {
    private Context context;
    private Ordenes ordenes;

    public OrdersAdapter(Context context, Ordenes ordenes) {
        super();
        this.context = context;
        this.ordenes = ordenes;
    }

    @Override
    public int getCount() {
        return this.ordenes.getOrders().length;
    }

    @Override
    public Object getItem(int position) {
        return this.ordenes.getOrders()[position];
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
            rowView = inflater.inflate(R.layout.list_orders, null);
        }

        TextView tvName   = (TextView) rowView.findViewById(R.id.tvOrderN);
        TextView tvCreated   = (TextView) rowView.findViewById(R.id.tvCreated);
        TextView tvTotalP   = (TextView) rowView.findViewById(R.id.tvTotalP);
        TextView tvTotalC   = (TextView) rowView.findViewById(R.id.tvTotalC);
        TextView tvMetodo   = (TextView) rowView.findViewById(R.id.tvMetodoP);
        TextView tvCliente   = (TextView) rowView.findViewById(R.id.tvCliente);
        TextView tvEmail   = (TextView) rowView.findViewById(R.id.tvEmail);
        final OrderElement item = this.ordenes.getOrders()[position];
        tvName.setText(""+item.getOrder_number());
        tvCreated.setText(item.getCreated_at());
        tvTotalP.setText(""+item.getTotal_line_items_quantity());
        tvTotalC.setText(""+item.getTotal());
        tvEmail.setText(""+item.getCustomer().getEmail());
        tvCliente.setText(item.getCustomer().getUsername()+""+item.getCustomer().getFirst_name() + " " + item.getCustomer().getLast_name());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            if (Objects.equals(item.getStatus(), "completed"))
            {
                tvMetodo.setText(""+item.getPayment_details().getMethod_title());
            }
            else
            {
                tvMetodo.setText("Aun No pagado");
            }
        }
        rowView.setTag(item.getId());
        //String sUrl = "http://gravatar.com/avatar/1c57c8eea18ec3bbf43b81432e61132f";

        return rowView;

    }


    private InputStream OpenHttpConnection(String urlString)
            throws IOException
    {
        InputStream in = null;
        int response = -1;
        URL url = new URL(urlString);
        URLConnection conn = url.openConnection();
        if (!(conn instanceof HttpURLConnection))
            throw new IOException("Not an HTTP connection");
        try{
            HttpURLConnection httpConn = (HttpURLConnection) conn;
            httpConn.setRequestMethod("GET");

            httpConn.connect();
            response = httpConn.getResponseCode();
            if (response == HttpURLConnection.HTTP_OK) {
                in = httpConn.getInputStream();
            }
        }
        catch (Exception ex) {
            throw new IOException("Error connecting" + response + ex.getMessage());
        }
        return in;
    }

}
