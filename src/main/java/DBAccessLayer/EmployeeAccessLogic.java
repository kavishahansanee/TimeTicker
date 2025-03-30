
package DBAccessLayer;

import DBLayer.DatabaseConnection;
import Models.Employee;

public class EmployeeAccessLogic {
    private  DatabaseConnection singleConn;
    
    public EmployeeAccessLogic(){
        singleConn = DatabaseConnection.getSingleInstance();
    }
    
    public boolean AddEmployeeToDB(Employee Emp){
        try {
            String query =  "insert into employee values("+"'"+Emp.getEmpID()+"'"+ ","+"'"+ Emp.getEmpName()+"'"+ ","+"'"+ Emp.getAddress()+"'"+","+"'"+Emp.getContactNo()+"'"+","+"'"+Emp.getEmpType()+"'"+ ","+  Emp.getSalary()+  ")"+";";
            
            boolean result = singleConn.ExecuteQuary(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean updateEmployeeToDB(Employee Emp){
        try{
            
            String query = "update employee set " + "EmployeeName = " + "'" + Emp.getEmpName() +"'"+ ","+ "Address = "+"'"+ Emp.getAddress() +"'" +","+ "ContactNumber = "+"'"+Emp.getContactNo() +"'"+","+ "EmployeeType = "+"'"+Emp.getEmpType() +"'"+  ","+  Emp.getSalary()+" where EmployeeID = "+"'"+Emp.getEmpID() +"'"+ ";";
            boolean result = singleConn.ExecuteQuary(query);
            return result;
        }catch(Exception ex){
            return false;
        }
    }
    
     public boolean deleteEmployeeToDB(Employee Emp){
        try{
            String query = "delete from employee where EmployeeID =("+"'"+Emp.getEmpID()+"'"+");";
            boolean result = singleConn.ExecuteQuary(query);
            return result;
        }catch(Exception ex){
            return false;
        }
    }
    
}
