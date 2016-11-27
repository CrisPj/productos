
package mx.edu.itcelaya.ecommerceproducts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PaymentDetails {

    @SerializedName("method_id")
    @Expose
    private String methodId;
    @SerializedName("method_title")
    @Expose
    private String methodTitle;
    @SerializedName("paid")
    @Expose
    private boolean paid;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PaymentDetails() {
    }

    /**
     * 
     * @param paid
     * @param methodTitle
     * @param methodId
     */
    public PaymentDetails(String methodId, String methodTitle, boolean paid) {
        this.methodId = methodId;
        this.methodTitle = methodTitle;
        this.paid = paid;
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
     *     The paid
     */
    public boolean isPaid() {
        return paid;
    }

    /**
     * 
     * @param paid
     *     The paid
     */
    public void setPaid(boolean paid) {
        this.paid = paid;
    }

}
