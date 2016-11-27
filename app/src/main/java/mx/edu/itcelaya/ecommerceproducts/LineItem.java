
package mx.edu.itcelaya.ecommerceproducts;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LineItem {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("subtotal")
    @Expose
    private String subtotal;
    @SerializedName("subtotal_tax")
    @Expose
    private String subtotalTax;
    @SerializedName("total")
    @Expose
    private String total;
    @SerializedName("total_tax")
    @Expose
    private String totalTax;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("quantity")
    @Expose
    private int quantity;
    @SerializedName("tax_class")
    @Expose
    private Object taxClass;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("product_id")
    @Expose
    private int productId;
    @SerializedName("sku")
    @Expose
    private String sku;
    @SerializedName("meta")
    @Expose
    private List<Object> meta = new ArrayList<Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public LineItem() {
    }

    /**
     * 
     * @param total
     * @param id
     * @param taxClass
     * @param price
     * @param subtotalTax
     * @param name
     * @param quantity
     * @param totalTax
     * @param sku
     * @param subtotal
     * @param meta
     * @param productId
     */
    public LineItem(int id, String subtotal, String subtotalTax, String total, String totalTax, String price, int quantity, Object taxClass, String name, int productId, String sku, List<Object> meta) {
        this.id = id;
        this.subtotal = subtotal;
        this.subtotalTax = subtotalTax;
        this.total = total;
        this.totalTax = totalTax;
        this.price = price;
        this.quantity = quantity;
        this.taxClass = taxClass;
        this.name = name;
        this.productId = productId;
        this.sku = sku;
        this.meta = meta;
    }

    /**
     * 
     * @return
     *     The id
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The subtotal
     */
    public String getSubtotal() {
        return subtotal;
    }

    /**
     * 
     * @param subtotal
     *     The subtotal
     */
    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * 
     * @return
     *     The subtotalTax
     */
    public String getSubtotalTax() {
        return subtotalTax;
    }

    /**
     * 
     * @param subtotalTax
     *     The subtotal_tax
     */
    public void setSubtotalTax(String subtotalTax) {
        this.subtotalTax = subtotalTax;
    }

    /**
     * 
     * @return
     *     The total
     */
    public String getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * 
     * @return
     *     The totalTax
     */
    public String getTotalTax() {
        return totalTax;
    }

    /**
     * 
     * @param totalTax
     *     The total_tax
     */
    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

    /**
     * 
     * @return
     *     The price
     */
    public String getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * 
     * @param quantity
     *     The quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * 
     * @return
     *     The taxClass
     */
    public Object getTaxClass() {
        return taxClass;
    }

    /**
     * 
     * @param taxClass
     *     The tax_class
     */
    public void setTaxClass(Object taxClass) {
        this.taxClass = taxClass;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * 
     * @param productId
     *     The product_id
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * 
     * @return
     *     The sku
     */
    public String getSku() {
        return sku;
    }

    /**
     * 
     * @param sku
     *     The sku
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * 
     * @return
     *     The meta
     */
    public List<Object> getMeta() {
        return meta;
    }

    /**
     * 
     * @param meta
     *     The meta
     */
    public void setMeta(List<Object> meta) {
        this.meta = meta;
    }

}
