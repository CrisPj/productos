
package mx.edu.itcelaya.ecommerceproducts;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ordenes {

    @SerializedName("orders")
    @Expose
    private List<Order> orders = new ArrayList<Order>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Ordenes() {
    }

    /**
     * 
     * @param orders
     */
    public Ordenes(List<Order> orders) {
        this.orders = orders;
    }

    /**
     * 
     * @return
     *     The orders
     */
    public List<Order> getOrders() {
        return orders;
    }

    /**
     * 
     * @param orders
     *     The orders
     */
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

}
