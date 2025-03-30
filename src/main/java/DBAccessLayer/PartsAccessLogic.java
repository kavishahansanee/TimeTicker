
package DBAccessLayer;
import DBLayer.DatabaseConnection;
import Models.Parts;


public class PartsAccessLogic {
    private  DatabaseConnection singleConn;
    
    public PartsAccessLogic(){
        singleConn = DatabaseConnection.getSingleInstance();
    }
    
    public boolean AddPartToDB(Parts part){
        try {
            String query =  "insert into Parts values("+"'"+part.getPartID()+"'"+ ","+"'"+ part.getPartName()+"'"+ ","+"'"+part.getSupplierID()+"'"+","+part.getQuantity()+","+part.getPrice()+ ");";
            boolean result = singleConn.ExecuteQuary(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean updatePartToDB(Parts part){
        try{
            
            String query = "update Parts set " + "PartName = " + "'" + part.getPartName() +"'"+ ","+ "Quantity = "+part.getQuantity()+","+ "SupplierID = "+"'"+part.getSupplierID()+"'"+ " where PartID = "+"'"+part.getPartID()+"'"+ ";";
            boolean result = singleConn.ExecuteQuary(query);
            return result;
        }catch(Exception ex){
            return false;
        }
    }
    
    public boolean deletePartToDB(Parts part){
        try{
            String query = "delete from Parts where PartID =("+"'"+part.getPartID()+"'"+");";
            System.out.println(query);
            boolean result = singleConn.ExecuteQuary(query);
            return result;
        }catch(Exception ex){
            return false;
        }
    }
}
