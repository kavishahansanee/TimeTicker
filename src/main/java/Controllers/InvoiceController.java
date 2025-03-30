package Controllers;

import DBAccessLayer.MngInvoicesAccessLogic;
import Models.Invoice;

public class InvoiceController {
    Invoice Invoiceobj;
    Invoice objInvoice;   
    MngInvoicesAccessLogic invo;
    
    public InvoiceController(){
        invo = new MngInvoicesAccessLogic();
    }
    
    public Invoice addInvoice (String InvoiceID, String CustomerID, String WiD, double Price, int quantity, String IssueDate){
        objInvoice = new Invoice(InvoiceID, CustomerID, WiD, Price, quantity, IssueDate);
        return objInvoice;
    }
    
    public boolean insertInvoiceToDB (Invoice invoice){
        boolean result = invo.addInvoiceTODB(invoice);
        return result;
    }
    
    public Invoice updateInvoice (String InvoiceID, String CustomerID, String WiD, double Price, int quantity, String IssueDate){
        objInvoice = new Invoice(InvoiceID, CustomerID, WiD, Price, quantity, IssueDate);
        return objInvoice;
    }
    
    public boolean updateInvoiceToDB (Invoice invoice){
        boolean result = invo.updateInvoiceTODB(invoice);
        return result;
    }
    
    public Invoice deleteInvoice (String InvoiceID, String CustomerID, String WiD, double Price, int quantity, String IssueDate){
        objInvoice = new Invoice(InvoiceID, CustomerID, WiD, Price, quantity, IssueDate);
        return objInvoice;
    }
    
    public boolean deleteInvoiceToDB (Invoice invoice){
        boolean result = invo.deleteInvoiceTODB(invoice);
        return result;
    }
}
