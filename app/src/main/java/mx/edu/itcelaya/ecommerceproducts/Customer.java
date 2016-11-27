
package mx.edu.itcelaya.ecommerceproducts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Customer {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("last_order_id")
    @Expose
    private String lastOrderId;
    @SerializedName("last_order_date")
    @Expose
    private String lastOrderDate;
    @SerializedName("orders_count")
    @Expose
    private int ordersCount;
    @SerializedName("total_spent")
    @Expose
    private String totalSpent;
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("billing_address")
    @Expose
    private BillingAddress_ billingAddress;
    @SerializedName("shipping_address")
    @Expose
    private ShippingAddress_ shippingAddress;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Customer() {
    }

    /**
     * 
     * @param id
     * @param lastName
     * @param totalSpent
     * @param username
     * @param email
     * @param createdAt
     * @param avatarUrl
     * @param lastOrderId
     * @param billingAddress
     * @param lastOrderDate
     * @param firstName
     * @param shippingAddress
     * @param ordersCount
     */
    public Customer(int id, String createdAt, String email, String firstName, String lastName, String username, String lastOrderId, String lastOrderDate, int ordersCount, String totalSpent, String avatarUrl, BillingAddress_ billingAddress, ShippingAddress_ shippingAddress) {
        this.id = id;
        this.createdAt = createdAt;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.lastOrderId = lastOrderId;
        this.lastOrderDate = lastOrderDate;
        this.ordersCount = ordersCount;
        this.totalSpent = totalSpent;
        this.avatarUrl = avatarUrl;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
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
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName
     *     The first_name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return
     *     The lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName
     *     The last_name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return
     *     The username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 
     * @param username
     *     The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 
     * @return
     *     The lastOrderId
     */
    public String getLastOrderId() {
        return lastOrderId;
    }

    /**
     * 
     * @param lastOrderId
     *     The last_order_id
     */
    public void setLastOrderId(String lastOrderId) {
        this.lastOrderId = lastOrderId;
    }

    /**
     * 
     * @return
     *     The lastOrderDate
     */
    public String getLastOrderDate() {
        return lastOrderDate;
    }

    /**
     * 
     * @param lastOrderDate
     *     The last_order_date
     */
    public void setLastOrderDate(String lastOrderDate) {
        this.lastOrderDate = lastOrderDate;
    }

    /**
     * 
     * @return
     *     The ordersCount
     */
    public int getOrdersCount() {
        return ordersCount;
    }

    /**
     * 
     * @param ordersCount
     *     The orders_count
     */
    public void setOrdersCount(int ordersCount) {
        this.ordersCount = ordersCount;
    }

    /**
     * 
     * @return
     *     The totalSpent
     */
    public String getTotalSpent() {
        return totalSpent;
    }

    /**
     * 
     * @param totalSpent
     *     The total_spent
     */
    public void setTotalSpent(String totalSpent) {
        this.totalSpent = totalSpent;
    }

    /**
     * 
     * @return
     *     The avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * 
     * @param avatarUrl
     *     The avatar_url
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * 
     * @return
     *     The billingAddress
     */
    public BillingAddress_ getBillingAddress() {
        return billingAddress;
    }

    /**
     * 
     * @param billingAddress
     *     The billing_address
     */
    public void setBillingAddress(BillingAddress_ billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * 
     * @return
     *     The shippingAddress
     */
    public ShippingAddress_ getShippingAddress() {
        return shippingAddress;
    }

    /**
     * 
     * @param shippingAddress
     *     The shipping_address
     */
    public void setShippingAddress(ShippingAddress_ shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

}
