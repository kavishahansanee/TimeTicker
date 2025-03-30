
package DBAccessLayer;
import DBLayer.DatabaseConnection;
import Models.RegisterCustomer;

public class RegCustomerAccessLogic {
    
    private DatabaseConnection singleConn;
    
    public RegCustomerAccessLogic(){
        singleConn = DatabaseConnection.getSingleInstance();
    }
    
    public boolean addCustomerTODB(RegisterCustomer customer){
        try{
            String query = "insert into customer values("+"'"+customer.getCustomerID()+"'"+ ","+"'"+ customer.getCustomername()+"'"+ ","+"'"+ customer.getAddress()+"'"+","+"'"+customer.getEmail() +"'"+ ");";
            boolean result = singleConn.ExecuteQuary(query);
            return result;
        }catch(Exception ex){
            return false;
        }
    }
    
    public boolean updateCustomerTODB(RegisterCustomer customer){
        try{ 
            String query = "update customer set " + "CustomerName = " + "'" + customer.getCustomername() +"'"+ ","+ "Address = "+"'"+ customer.getAddress() +"'" +","+ "Email = "+"'"+customer.getEmail() +"'"+ " where customerID = "+"'"+customer.getCustomerID() +"'"+ ";";
            boolean result = singleConn.ExecuteQuary(query);
            return result;
        }catch(Exception ex){
            return false;
        }
    }
    
    public boolean deleteCustomerTODB(RegisterCustomer customer){
        try{            
            String query = "delete from customer where CustomerID =("+"'"+customer.getCustomerID()+"'"+");";
            boolean result = singleConn.ExecuteQuary(query);
            return result;
        }catch(Exception ex){
            return false;
        }
    }   
}
