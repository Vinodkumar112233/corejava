package javaintroduction;

public class EmployeeData {
	int empId;
	String empName;
	
	void emp() {
		System.out.println("EmployeeId: "+empId);
		
		System.out.println("EmployeeName: "+empName);
		
	}

	public static void main(String[] args) {
		EmployeeData v = new EmployeeData();
		v.empId = 1234;
		v.empName ="vinodkumar";
		v.emp();
		

	}

}
