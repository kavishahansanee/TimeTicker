
package Controllers;

import DBAccessLayer.PartsAccessLogic;
import Models.Parts;

public class PartsController {
    Parts objParts;
    PartsAccessLogic PartL;

    public PartsController() {
        PartL = new PartsAccessLogic();

    }
    
    public Parts AddParts(String PartID,String PartName,String SupplierID,int Quantity, double Price) {
        objParts = new Parts(PartID, PartName, SupplierID, Quantity, Price) ;
        return objParts;
    }

    public boolean InsertPartTODB(Parts part) {
        boolean result = PartL.AddPartToDB(part);
        return result;
    }
    
    public Parts UpdatePart(String PartID,String PartName,String SupplierID,int Quantity, double Price) {
        objParts = new Parts(PartID, PartName, SupplierID, Quantity, Price) ;
        return objParts;
    }

    public boolean UpdatePartTODB(Parts part) {
        boolean result = PartL.updatePartToDB(part);
        return result;
    }
    
    public Parts DeletePart(String PartID,String PartName,String SupplierID,int Quantity, double Price) {
        objParts = new Parts(PartID, PartName, SupplierID, Quantity, Price) ;
        return objParts;
    }

    public boolean DeletePartTODB(Parts part) {
        boolean result = PartL.deletePartToDB(part);
        return result;
    }
}
