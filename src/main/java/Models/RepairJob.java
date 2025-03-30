
package Models;

public class RepairJob {
    public String WatchRepairID;
    public String CustomerID;
    public String JobType;
    public String Status;

    public String getWatchRepairID() {
        return WatchRepairID;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public String getJobType() {
        return JobType;
    }

    public String getStatus() {
        return Status;
    }

    public RepairJob(String WatchRepairID, String CustomerID, String JobType, String Status) {
        this.WatchRepairID = WatchRepairID;
        this.CustomerID = CustomerID;
        this.JobType = JobType;
        this.Status = Status;
    }
}
