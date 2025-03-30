package DBAccessLayer;

import Views.ManageInvoicesView;
import DBLayer.DatabaseConnection;
import Models.Invoice;

public class MngInvoicesAccessLogic {
    
    private DatabaseConnection singleConn;
    public boolean result;
    
    
    
    public MngInvoicesAccessLogic(){
        singleConn = DatabaseConnection.getSingleInstance();
    }
    
    public boolean addInvoiceTODB(Invoice Invoice){
        try{    
            
            if ((ManageInvoicesView.valueCHK).equals("Watch Sale")){
                String query = "insert into WatchSalesInvoices values("+"'"+Invoice.getInvoiceID()+"'"+ ","+"'"+ Invoice.getWiD()+"'"+ ","+"'"+ Invoice.getCustomerID()+"'"+","+ Invoice.getPrice()  + "," + Invoice.getQuantity() + ", '" + Invoice.getIssueDate()+ "'"+");";               
                System.out.println(query);
                result = singleConn.ExecuteQuary(query);                            
            }else if ((ManageInvoicesView.valueCHK).equals("Watch Repair")){
                String query = "insert into WatchRepairInvoices values("+"'"+Invoice.getInvoiceID()+"'"+ ","+"'"+ Invoice.getWiD()+"'"+ ","+"'"+ Invoice.getCustomerID()+"'"+","+"'"+Invoice.getPrice() + "'" + "," + Invoice.getQuantity() +", '" + Invoice.getIssueDate()+ "'"+ ");";
                result = singleConn.ExecuteQuary(query);                
            }
            return result;            
        }catch(Exception ex){
            return false;
        }
    }
    
    public boolean updateInvoiceTODB(Invoice Invoice){
        try{    
            
            if ((ManageInvoicesView.valueCHK).equals("Watch Sale")){
                String query = "update WatchSalesInvoices set " + "WatchID = " + "'" + Invoice.getWiD()+"'"+ ","+ "CustomerID = "+"'"+ Invoice.getCustomerID() +"'" +","+ "Price = "+ Invoice.getPrice() + ","+"Quantity = "+Invoice.getQuantity() +" where InvoiceID = "+"'"+Invoice.getInvoiceID() +"'"+ ";";               
                result = singleConn.ExecuteQuary(query);                            
            }else if ((ManageInvoicesView.valueCHK).equals("Watch Repair")){
                String query = "update WatchRepairInvoices set " + "WatchRepairID = " + "'" + Invoice.getWiD() +"'"+ ","+ "CustomerID = "+"'"+ Invoice.getCustomerID() +"'" +","+ "Price  = "+"'"+Invoice.getPrice() +"'"+ " where ReInvoiceID  = "+"'"+Invoice.getInvoiceID() +"'"+ ";";
                result = singleConn.ExecuteQuary(query);                
            }
            return result;            
        }catch(Exception ex){
            return false;
        }
    }
    
    public boolean deleteInvoiceTODB(Invoice Invoice){
        try{    
            
            if ((ManageInvoicesView.valueCHK).equals("Watch Sale")){
                String query = "delete from WatchSalesInvoices where InvoiceID = "+"'"+Invoice.getInvoiceID() +"'"+ ";";
                result = singleConn.ExecuteQuary(query);                            
            }else if ((ManageInvoicesView.valueCHK).equals("Watch Repair")){
                String query = "delete from WatchRepairInvoices where InvoiceID = "+"'"+Invoice.getInvoiceID() +"'"+ ";";
                result = singleConn.ExecuteQuary(query);                
            }
            return result;            
        }catch(Exception ex){
            return false;
        }
    }
}
