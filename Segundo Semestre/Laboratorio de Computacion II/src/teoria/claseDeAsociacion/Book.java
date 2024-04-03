package teoria.claseDeAsociacion;

public class Book {
    // Data attributes
    private String title;
    // Association attributes
    public purchase purchaseOfCust;

    // Default constructor
    public Book() {
        // Start user code section
        // End user code section
    } // default constructor Book

    // Methods

    // Do not delete this line -- regeneration end marker
    // Attribute accessors
    public String getTitle() {
        return title;
    }

    public void setTitle(String title_) {
        title = title_;
    }

    // Association accessors
    public purchase getPurchaseOfCust() {
        return purchaseOfCust;
    }
} // class Book
