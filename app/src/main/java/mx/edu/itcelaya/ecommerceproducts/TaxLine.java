
package mx.edu.itcelaya.ecommerceproducts;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TaxLine {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("rate_id")
    @Expose
    private String rateId;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("total")
    @Expose
    private String total;
    @SerializedName("compound")
    @Expose
    private boolean compound;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TaxLine() {
    }

    /**
     * 
     * @param total
     * @param id
     * @param title
     * @param compound
     * @param rateId
     * @param code
     */
    public TaxLine(int id, String rateId, String code, String title, String total, boolean compound) {
        this.id = id;
        this.rateId = rateId;
        this.code = code;
        this.title = title;
        this.total = total;
        this.compound = compound;
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
     *     The rateId
     */
    public String getRateId() {
        return rateId;
    }

    /**
     * 
     * @param rateId
     *     The rate_id
     */
    public void setRateId(String rateId) {
        this.rateId = rateId;
    }

    /**
     * 
     * @return
     *     The code
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
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
     *     The compound
     */
    public boolean isCompound() {
        return compound;
    }

    /**
     * 
     * @param compound
     *     The compound
     */
    public void setCompound(boolean compound) {
        this.compound = compound;
    }

}
