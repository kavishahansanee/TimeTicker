package Controllers;
import Models.Watch;
import DBAccessLayer.WatchAccessLogic;

public class WatchController {
    Watch WatchUIobj;
    Watch objWatch;   
    WatchAccessLogic wach;
    
    public WatchController(){
        wach = new WatchAccessLogic();
        
    }
    
    public Watch addWatch (String WatchID,String BrandName,double Price,int Warranty){
        objWatch = new Watch(WatchID,BrandName,Price,Warranty);
        return objWatch;
    }
    public boolean insertWatchToDB(Watch watch){
        boolean result = wach.addWatchTODB(watch);
        return result;
    }
    
    public Watch updateWatch(String WatchID,String BrandName,double Price,int Warranty){
        objWatch =new Watch(WatchID,BrandName,Price,Warranty);
        return objWatch;
    }
    
    public boolean updateWatchToDB (Watch watch){
        boolean result = wach.updateWatchTODB(watch);
        return result;
    }
    
    public Watch deleteWatch (String WatchID,String BrandName,double Price,int Warranty){
        objWatch = new Watch(WatchID,BrandName,Price,Warranty);
        return objWatch;
    }
    
    public boolean deleteWatchToDB(Watch watch){
        boolean result = wach.deleteWatchTODB(watch);
        return result;
    }
    
    
    
}
