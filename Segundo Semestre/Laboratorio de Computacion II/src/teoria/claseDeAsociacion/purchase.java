package teoria.claseDeAsociacion;

public class purchase {
    // Data attributes
    private String date;
    // Association attributes
    public Customer cust;
    public Book book;

    // Default constructor
    public purchase(Customer cust_, Book book_) {
        cust = cust_;
        book = book_;
        cust.purchaseOfBookSet.addElement(this);
        book.purchaseOfCust = this;
        // Start user code section
        // End user code section
    } // default constructor purchase

    // Methods

    // Do not delete this line -- regeneration end marker
    // Attribute accessors
    public String getDate() {
        return date;
    }

    public void setDate(String date_) {
        date = date_;
    }

    // Association accessors
    public Customer getCust() {
        return cust;
    }

    public Book getBook() {
        return book;
    }
} // class purchase
