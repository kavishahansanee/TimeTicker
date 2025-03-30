
package Controllers;

import Models.Employee;
import DBAccessLayer.EmployeeAccessLogic;
import DBAccessLayer.SupplierAccessLogic;
import Models.Supplier;

public class EmployeeController {
    Employee objEmployee;
    EmployeeAccessLogic EmpL;

    public EmployeeController() {
        EmpL = new EmployeeAccessLogic();
    }
    
     public Employee AddEmployee(String EmpID, String EmpName, String Address, String ContactNo, String EmpType, double Salary) {
        objEmployee = new Employee(EmpID, EmpName, Address, ContactNo, EmpType, Salary);
        return objEmployee;
    }

    public boolean insertEmployeeTODB(Employee Emp) {
        boolean result = EmpL.AddEmployeeToDB(Emp);
        return result;
    }
    
    public Employee UpdateEmployee(String EmpID, String EmpName, String Address, String ContactNo, String EmpType, double Salary) {
        objEmployee = new Employee(EmpID, EmpName, Address, ContactNo, EmpType, Salary);
        return objEmployee;
    }

    public boolean UpdatetEmployeeTODB(Employee Emp) {
        boolean result = EmpL.updateEmployeeToDB(Emp);
        return result;
    }
    
    public Employee DeleteEmployee(String EmpID, String EmpName, String Address, String ContactNo, String EmpType, double Salary) {
        objEmployee = new Employee(EmpID, EmpName, Address, ContactNo, EmpType, Salary);
        return objEmployee;
    }

    public boolean DeleteEmployeeTODB(Employee Emp) {
        boolean result = EmpL.deleteEmployeeToDB(Emp);
        return result;
    }
    
}
