
package DBAccessLayer;

import Models.RepairJob;
import DBLayer.DatabaseConnection;
import javax.swing.JOptionPane;
import Controllers.RepairJobController;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class RepairJobAccessLogic {
    private  DatabaseConnection singleConn;
    
    public RepairJobAccessLogic(){
        singleConn = DatabaseConnection.getSingleInstance();
    }
    
    public boolean AddRepairJobToDB(RepairJob repair){
        try {
            String query =  "insert into watchrepairjob values("+"'"+repair.getWatchRepairID()+"'"+ ","+"'"+ repair.getCustomerID()+"'"+ ","+"'"+ repair.getJobType()+"'"+","+"'"+repair.getStatus()+"'"+","+"'"+"      -    "+"'"+ ");";
            System.out.println(query);
            boolean result = singleConn.ExecuteQuary(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean UpdateRepairJobToDB(RepairJob repair){
        try{
            
            String query = "update watchrepairjob set " + "CustomerID = " + "'" + repair.getCustomerID()+"'"+ ","+ "JobType = "+"'"+ repair.getJobType()+"'" +","+ "Status = "+"'"+repair.getStatus()+"'"+ " where WatchRepairID = "+"'"+repair.getWatchRepairID()+"'"+ ";";
            boolean result = singleConn.ExecuteQuary(query);
            return result;
        }catch(Exception ex){
            return false;
        }
    }
    
    public boolean deleteRepairJobToDB(RepairJob repair){
        try{
            String query = "delete from watchrepairjob where WatchRepairID =("+"'"+repair.getWatchRepairID()+"'"+");";
            boolean result = singleConn.ExecuteQuary(query);
            return result;
        }catch(Exception ex){
            return false;
        }
    } 
}
