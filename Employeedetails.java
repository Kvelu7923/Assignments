package week1.day2;

public class Employeedetails {
	public void EmployeeName() {
	String EmployeeName="Kathir";
	System.out.println("EmployeeName ="+EmployeeName);
	int EmployeeId=222;
	System.out.println("EmployeeID="+EmployeeId);
}
	public void EmployeeAddress() {
	String EmployeeAddress="Trichy";
	System.out.println("EmployeeAddress="+EmployeeAddress);
}
    public void EmployeeSalery() {
    double 	EmployeeWage =43243.54;
    System.out.println("EmployeeWage="+EmployeeWage);
    }
    public void EmployeeMobileNumber() {
    long mobileNumber=7339095673L;
    System.out.println("mobileNumber="+mobileNumber);
    }
public static void main(String[] args) {
	Employeedetails details = new Employeedetails();
	details.EmployeeName();
    details.EmployeeAddress();
    details.EmployeeSalery();
    details.EmployeeMobileNumber();
}    
}