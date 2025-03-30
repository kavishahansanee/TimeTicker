package Controllers;

import DBAccessLayer.RegCustomerAccessLogic;
import Models.RegisterCustomer;

public class RegisterCustomerController {
    RegisterCustomer RegisterCustomerobj;
    RegisterCustomer objCustomer;   
    RegCustomerAccessLogic cust;
    
    public RegisterCustomerController(){
        cust = new RegCustomerAccessLogic();
    }
    
    public RegisterCustomer addCustomer (String Customername, String CustomerID, String Email, String Address){
        objCustomer = new RegisterCustomer(CustomerID, Customername, Email, Address);
        return objCustomer;
    }
    
    public boolean insertCustomerToDB (RegisterCustomer custom){
        boolean result = cust.addCustomerTODB(custom);
        return result;
    }
    
    public RegisterCustomer updateCustomer (String Customername, String CustomerID, String Email, String Address){
        objCustomer = new RegisterCustomer(CustomerID, Customername, Email, Address);
        return objCustomer;
    }
    
    public boolean updateCustomerToDB (RegisterCustomer custom){
        boolean result = cust.updateCustomerTODB(custom);
        return result;
    }
    
    public RegisterCustomer deleteCustomer (String Customername, String CustomerID, String Email, String Address){
        objCustomer = new RegisterCustomer(CustomerID, Customername, Email, Address);
        return objCustomer;
    }
    
    public boolean deleteCustomerToDB (RegisterCustomer custom){
        boolean result = cust.deleteCustomerTODB(custom);
        return result;
    }
}
