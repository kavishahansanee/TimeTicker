package Models;

public class Parts {

    public String PartID;
    public String PartName;
    public String  SupplierID;            
    public int Quantity;
    public double Price;

    public String getPartID() {
        return PartID;
    }

    public String getPartName() {
        return PartName;
    }

    public String getSupplierID() {
        return SupplierID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public double getPrice() {
        return Price;
    }

    public Parts(String PartID, String PartName, String SupplierID, int Quantity, double Price) {
        this.PartID = PartID;
        this.PartName = PartName;
        this.SupplierID = SupplierID;
        this.Quantity = Quantity;
        this.Price = Price;
    }

    
}
