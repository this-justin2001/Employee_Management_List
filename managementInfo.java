package homework;
public class managementInfo extends employeeInfo{
	private String department;
	
	public managementInfo() { //initializes department to void
		department = "void";
	}
	public void setManagementInfo(String departmentName) {
		department = departmentName;
	}
	public String getManagementInfo() {
		return department;
	}
	public void printEmpInfo() {
		System.out.println("Name: " + lastName + ", " + firstName);
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Department Name: " + department);
		System.out.println("Salary: $" + salary);
	}
	
}
