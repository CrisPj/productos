package mx.edu.itcelaya.ecommerceproducts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.gson.Gson;

import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.concurrent.ExecutionException;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class MainActivity extends AppCompatActivity {

    ListView listOrders;
    Ordenes ordenes;
    String consumer_key = "ck_937c6fcaa34debb9f047afcf4d46b6c055518e44";
    String consumer_secret = "cs_bd73d50ea69576596774a0d8487ebf067e377307";

    String url = "";
    String jsonResult;
    private Spinner dropdown;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listOrders = (ListView) findViewById(R.id.listOrdenes);
        NukeSSLCerts.nuke();
                dropdown = (Spinner) findViewById(R.id.spinner);
        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                url = "https://192.168.0.15/wordpress/wc-api/v3/orders?status="+String.valueOf(dropdown.getSelectedItem())+"&filter[expand]=products";
                loadOrders();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        listOrders.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Line_itemElement[] products = ordenes.getOrders()[position].getLine_items();
                if (products.length > 0)
                {
                    Intent intent = new Intent(MainActivity.this, Products.class);
                    Gson gson = new Gson();
                    String prods = gson.toJson(products);
//                    Object newp[] = new Object[products.length];
//                    newp[0]
//                    products[0].getProduct_data().getId();
//                    products[0].getProduct_data().getTitle();
//                    products[0].getProduct_data().getPrice();
//                    products[0].getProduct_data().getIn_stock();
//                    products[0].getProduct_data().getStock_quantity();
//                    products[0].getProduct_data().getImages()[0].getSrc();
                    intent.putExtra("ITEM_ID",prods);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getBaseContext(),"No hay productos",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    private void loadOrders() {
        LoadOrdersTask tarea = new LoadOrdersTask(this, consumer_key, consumer_secret);
        try {
            jsonResult = tarea.execute(new String[] { url }).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        //Toast.makeText(getBaseContext(), jsonResult, Toast.LENGTH_LONG).show();
        ListProductos();

    }


    public void ListProductos() {
            Gson gson = new Gson();
        ordenes = gson.fromJson(jsonResult, Ordenes.class);
        listOrders.setAdapter(new OrdersAdapter(this, ordenes));
    }

    public static class NukeSSLCerts {
        protected static final String TAG = "NukeSSLCerts";

        public static void nuke() {
            try {
                TrustManager[] trustAllCerts = new TrustManager[] {
                        new X509TrustManager() {
                            public X509Certificate[] getAcceptedIssuers() {
                                X509Certificate[] myTrustedAnchors = new X509Certificate[0];
                                return myTrustedAnchors;
                            }

                            @Override
                            public void checkClientTrusted(X509Certificate[] certs, String authType) {}

                            @Override
                            public void checkServerTrusted(X509Certificate[] certs, String authType) {}
                        }
                };

                SSLContext sc = SSLContext.getInstance("SSL");
                sc.init(null, trustAllCerts, new SecureRandom());
                HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
                HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
                    @Override
                    public boolean verify(String arg0, SSLSession arg1) {
                        return true;
                    }
                });
            } catch (Exception e) {
            }
        }
    }

}
