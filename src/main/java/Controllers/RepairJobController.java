
package Controllers;

import Models.RepairJob;
import DBAccessLayer.RepairJobAccessLogic;

public class RepairJobController {
    RepairJob objRepairJob;
    RepairJobAccessLogic JobL;

    public RepairJobController() {
        JobL = new RepairJobAccessLogic();

    }
    
    public RepairJob AddRepairJob(String WatchRepairID,String CustomerID,String JobType,String Status) {
        objRepairJob = new RepairJob(WatchRepairID, CustomerID, JobType, Status);
        return objRepairJob;
    }

    public boolean insertRepairJobTODB(RepairJob repair) {
        boolean result = JobL.AddRepairJobToDB(repair);
        return result;
    }
    
    public RepairJob UpdateRepairJob(String WatchRepairID,String CustomerID,String JobType,String Status){
        objRepairJob = new RepairJob(WatchRepairID, CustomerID, JobType, Status);
        return objRepairJob;
    }
    
    public boolean UpdateRepairJobTODB (RepairJob repair){
        boolean result = JobL.UpdateRepairJobToDB(repair);
        return result;
    }
    
    public RepairJob DeleteRepairJob(String WatchRepairID,String CustomerID,String JobType,String Status){
        objRepairJob = new RepairJob(WatchRepairID, CustomerID, JobType, Status);
        return objRepairJob;
    }
    
    public boolean DeleteSupplierTODB (RepairJob repair){
        boolean result = JobL.deleteRepairJobToDB(repair);
        return result;
    }
}
