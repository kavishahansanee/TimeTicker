package Models;


public class Invoice {
    private String CustomerID;
    private String InvoiceID;
    private String WiD;
    private double Price;
    private int quantity;
    private String IssueDate;

    public String getCustomerID() {
        return CustomerID;
    }

    public String getInvoiceID() {
        return InvoiceID;
    }

    public String getWiD() {
        return WiD;
    }

    public double getPrice() {
        return Price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getIssueDate() {
        return IssueDate;
    }

    public Invoice( String InvoiceID, String CustomerID, String WiD, double Price, int quantity, String IssueDate) {
        this.CustomerID = CustomerID;
        this.InvoiceID = InvoiceID;
        this.WiD = WiD;
        this.Price = Price;
        this.quantity = quantity;
        this.IssueDate = IssueDate;
    }

    
    
    
    
    
    
    
}
