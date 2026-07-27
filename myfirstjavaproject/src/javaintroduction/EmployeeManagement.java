package javaintroduction;

public class EmployeeManagement {
	int empId;
	String empName;
	int salary;
	String department;

	static String companyName;
	static int companyId;

	public static void main(String[] args) {
		companyName = "Google";
		companyId = 20;
		System.out.println("----------------------------------------------------------");
		System.out.println("companyname:" + companyName);
		System.out.println("companyid:" + companyId);

		EmployeeManagement vk = new EmployeeManagement();
		vk.empId = 1;
		vk.empName = "vinod";
		vk.salary = 2000;
		vk.department = "java developer";
		
		System.out.println("employeeid:"+vk.empId);
		System.out.println("empname:"+vk.empName);
		System.out.println("salary:"+vk.salary);
		System.out.println("department:"+vk.department);
		System.out.println("----------------------------------------------------------");
		
		
		System.out.println("companyname:" + companyName);
		System.out.println("companyid:" + companyId);

		EmployeeManagement hk = new EmployeeManagement();
		hk.empId = 2;
		hk.empName = "hemanth";
		hk.salary = 200000;
		hk.department = "java developer";
		
		System.out.println("employeeid:"+hk.empId);
		System.out.println("empname:"+hk.empName);
		System.out.println("salary:"+hk.salary);
		System.out.println("department:"+hk.department);
		System.out.println("----------------------------------------------------------");
		
		

	}

}
