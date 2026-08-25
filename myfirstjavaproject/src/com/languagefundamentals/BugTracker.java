package com.languagefundamentals;

public class BugTracker {
	int bugid;
	String applicationName;
	String bugtittle;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;
	
	int getbugid() {
		return bugid;
	}
	String getapplicationName() {
		return applicationName;
	}
	String getbugTittle() {
		return bugtittle;
	}
	String getseverity() {
		return severity;
		
	}
	String getpriority() {
		return priority;
		
	}
	String getstatus() {
		return status;
	}
	String getassignedDeveloper() {
		return assignedDeveloper;
	}
	void assignToDeveloper(int bugid,String developerName) {
		if (bugid == bugid) {
			assignedDeveloper = developerName;
			updateStatus("in development");
		}
		
	}
	void updateStatus(String newStatus) {
		status = newStatus;
		
	}
	void displayBugSummary() {
		System.out.println("Bug Id: "+getbugid());
		System.out.println("Application Name: "+getapplicationName());
		System.out.println("Bug Tittle : "+getbugTittle());
		System.out.println("Severity: "+getseverity());
		System.out.println("Priority: "+getpriority());
		System.out.println("status: "+getstatus());
		System.out.println("Developer Name: "+getassignedDeveloper());
		
		}
	public static void main(String[] args) {
		BugTracker v1 = new BugTracker();
		v1.bugid = 101;
		v1.applicationName = "Banking App";
		v1.bugtittle = "login button not working";
		v1.severity = "high";
		v1.priority = "P1";
		v1.status = "open";
		
		v1.assignToDeveloper(101, "vinod");
		v1.displayBugSummary();
		
		System.out.println("******************************************************************************");
		BugTracker v2 = new BugTracker();
		v2.bugid = 102;
		v2.applicationName = "Shopping App";
		v2.bugtittle = "Payment Failure";
		v2.severity = "Crtical";
		v2.priority = "P0";
		v2.status = "open";
		
		v2.assignToDeveloper(102, "hemanth");
		v2.displayBugSummary();
		
		
	}

}
