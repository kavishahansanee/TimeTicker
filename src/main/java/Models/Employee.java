
package Models;

public class Employee {
    private String EmpID;
    private String EmpName;
    private String Address;
    private String ContactNo;
    private String EmpType;
    private double Salary;

    public String getEmpID() {
        return EmpID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public String getAddress() {
        return Address;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public String getEmpType() {
        return EmpType;
    }

    public double getSalary() {
        return Salary;
    }

    public Employee(String EmpID, String EmpName, String Address, String ContactNo, String EmpType, double Salary) {
        this.EmpID = EmpID;
        this.EmpName = EmpName;
        this.Address = Address;
        this.ContactNo = ContactNo;
        this.EmpType = EmpType;
        this.Salary = Salary;
    }

   
}
