
package Controllers;

import Models.Supplier;
import DBAccessLayer.SupplierAccessLogic;

public class SupplierController {
    Supplier objSupplier;
    SupplierAccessLogic SupL;

    public SupplierController() {
        SupL = new SupplierAccessLogic();

    }

    public Supplier AddSupplier(String SupID,String SupName,String Address,String Email) {
        objSupplier = new Supplier(SupID, SupName, Address, Email);
        return objSupplier;
    }

    public boolean insertSupplierTODB(Supplier Sup) {
        boolean result = SupL.AddSupplierToDB(Sup);
        return result;
    }
    
    public Supplier UpdateSupplier (String SupID,String SupName,String Address,String Email){
        objSupplier = new Supplier(SupName, SupName, Email, Address);
        return objSupplier;
    }
    
    public boolean updateSupplierTODB (Supplier Sup){
        boolean result = SupL.updateSupplierToDB(Sup);
        return result;
    }
    
    public Supplier DeleteSupplier (String Customername, String CustomerID, String Email, String Address){
        objSupplier = new Supplier(Email, Email, Address, Email);
        return objSupplier;
    }
    
    public boolean DeleteSupplierTODB (Supplier Sup){
        boolean result = SupL.deleteSupplierToDB(Sup);
        return result;
    }
}
