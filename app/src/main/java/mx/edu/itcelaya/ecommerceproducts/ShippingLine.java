
package mx.edu.itcelaya.ecommerceproducts;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ShippingLine {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("method_id")
    @Expose
    private String methodId;
    @SerializedName("method_title")
    @Expose
    private String methodTitle;
    @SerializedName("total")
    @Expose
    private String total;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ShippingLine() {
    }

    /**
     * 
     * @param total
     * @param id
     * @param methodTitle
     * @param methodId
     */
    public ShippingLine(int id, String methodId, String methodTitle, String total) {
        this.id = id;
        this.methodId = methodId;
        this.methodTitle = methodTitle;
        this.total = total;
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
     *     The methodId
     */
    public String getMethodId() {
        return methodId;
    }

    /**
     * 
     * @param methodId
     *     The method_id
     */
    public void setMethodId(String methodId) {
        this.methodId = methodId;
    }

    /**
     * 
     * @return
     *     The methodTitle
     */
    public String getMethodTitle() {
        return methodTitle;
    }

    /**
     * 
     * @param methodTitle
     *     The method_title
     */
    public void setMethodTitle(String methodTitle) {
        this.methodTitle = methodTitle;
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

}
