package teoria.claseDeAsociacion;

import java.util.Vector;

public class Customer {
    // Data attributes
    private String name;
    // Association attributes
    public Vector purchaseOfBookSet;

    // Default constructor
    public Customer() {
        purchaseOfBookSet = new Vector();
        // Start user code section
        // End user code section
    } // default constructor Customer

    // Methods

    // Do not delete this line -- regeneration end marker
    // Attribute accessors
    public String getName() {
        return name;
    }

    public void setName(String name_) {
        name = name_;
    }

    // Association accessors
    public Vector getPurchaseOfBookSet() {
        return purchaseOfBookSet;
    }
} // class Customer
