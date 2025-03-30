package DBAccessLayer;
import DBLayer.DatabaseConnection;
import Models.Watch;

public class WatchAccessLogic {
    private DatabaseConnection singleConn;
    
    public WatchAccessLogic(){
        singleConn = DatabaseConnection.getSingleInstance();
    }
    
    public boolean addWatchTODB(Watch watch){
        try{
            String query = "insert into watch values("+"'"+watch.getWatchID()+"'"+ ","+"'"+ watch.getBrandName()+"'"+ ","+ watch.getPrice()+","+watch.getWarranty()+ ");";
            boolean result = singleConn.ExecuteQuary(query);
            return result;
        }catch(Exception ex){
            return false;
        }
    }
    
    public boolean updateWatchTODB(Watch watch){
        try{ 
            String query = "update watch set " + "BrandName = " + "'" + watch.getBrandName() +"'"+ ","+ "Price = "+ watch.getPrice() +","+ "Warrenty = "+watch.getWarranty()+ " where WatchID = "+"'"+watch.getWatchID() +"'"+ ";";
            boolean result = singleConn.ExecuteQuary(query);
            return result;
        }catch(Exception ex){
            return false;
        }
    }
    
    public boolean deleteWatchTODB(Watch watch){
        try{            
            String query = "delete from watch where WatchID =("+"'"+watch.getWatchID()+"'"+");";
            boolean result = singleConn.ExecuteQuary(query);
            return result;
        }catch(Exception ex){
            return false;
        }
    }   

    
}
