package mx.edu.itcelaya.ecommerceproducts;

/**
 * Created by cristian on 25/11/16.
 */

public class Review {
    private int id;
    private String reviewer_name;
    private String reviewer_email;
    private String rewiew;

    Review(int id, String autor,String email, String review)
    {
        this.id = id;
        this.reviewer_name = autor;
        this.reviewer_email = email;
        this.rewiew = review;
    }
    public int getId() {
        return id;
    }

    public String getReviewer_email() {
        return reviewer_email;
    }

    public String getReviewer_name() {
        return reviewer_name;
    }

    public String getRewiew() {
        return rewiew;
    }
}
