package mx.edu.itcelaya.ecommerceproducts;

/**
 * Created by niluxer on 5/16/16.
 */
public class Orders {
    private int id;
    private int order_id;
    private String created_at;
    private String status;


    public Orders(Integer id, Integer order_id, String created_at, String status)
    {
        this.id = id;
        this.order_id = order_id;
        this.created_at = created_at;
        this.status = status;
    }


    public int getId() {
        return id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getStatus() {
        return status;
    }
}
