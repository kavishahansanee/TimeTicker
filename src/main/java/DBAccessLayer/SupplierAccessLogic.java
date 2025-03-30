
package DBAccessLayer;
import DBLayer.DatabaseConnection;
import Models.Supplier;

public class SupplierAccessLogic {
     private  DatabaseConnection singleConn;
    
    public SupplierAccessLogic(){
        singleConn = DatabaseConnection.getSingleInstance();
    }
    
    public boolean AddSupplierToDB(Supplier sup){
        try {
            String query =  "insert into supplier values("+"'"+sup.getSupID()+"'"+ ","+"'"+ sup.getSupName()+"'"+ ","+"'"+ sup.getEmail()+"'"+","+"'"+sup.getAddress()+"'"+ ");";
            boolean result = singleConn.ExecuteQuary(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean updateSupplierToDB(Supplier sup){
        try{
            
            String query = "update supplier set " + "SupplierName = " + "'" + sup.getSupName() +"'"+ ","+ "Email = "+"'"+ sup.getEmail()+"'" +","+ "Address = "+"'"+sup.getAddress()+"'"+ " where SupplierID = "+"'"+sup.getSupID() +"'"+ ";";
            boolean result = singleConn.ExecuteQuary(query);
            return result;
        }catch(Exception ex){
            return false;
        }
    }
    
    public boolean deleteSupplierToDB(Supplier sup){
        try{
            String query = "delete from supplier where SupplierID =("+"'"+sup.getSupID()+"'"+");";
            boolean result = singleConn.ExecuteQuary(query);
            return result;
        }catch(Exception ex){
            return false;
        }
    }   
}
