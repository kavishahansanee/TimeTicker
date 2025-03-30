package Models;


public class RegisterCustomer {
    private String Customername;
    private String CustomerID;
    private String Email;
    private String Address;

    
    public RegisterCustomer(String CustomerID,String Customername,String Email, String Address) {
        this.CustomerID = CustomerID;
        this.Customername = Customername;
        this.Email = Email;
        this.Address = Address;
    }
    
    public String getCustomername() {
        return Customername;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public String getEmail() {
        return Email;
    }
    
    public String getAddress(){
        return Address;
    }
    
}
