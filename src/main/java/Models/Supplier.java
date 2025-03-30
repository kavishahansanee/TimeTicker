
package Models;

public class Supplier {
    private String SupID;
    private String SupName;
    private String Address;
    private String Email;

    public String getSupID() {
        return SupID;
    }

    public String getSupName() {
        return SupName;
    }

    public String getAddress() {
        return Address;
    }

    public String getEmail() {
        return Email;
    }

    public Supplier(String SupID, String SupName, String Address, String Email) {
        this.SupID = SupID;
        this.SupName = SupName;
        this.Address = Address;
        this.Email = Email;
    }
    
    
}
