package Models;

public class Watch {
    
    private String WatchID;
    private String BrandName;
    private double Price;
    private int Warranty;

    public Watch(String WatchID, String BrandName, double Price, int Warranty) {
        this.WatchID = WatchID;
        this.BrandName = BrandName;
        this.Price = Price;
        this.Warranty = Warranty;
    }

    public String getWatchID() {
        return WatchID;
    }

    public String getBrandName() {
        return BrandName;
    }

    public double getPrice() {
        return Price;
    }

    public int getWarranty() {
        return Warranty;
    }
    
    
    
}
