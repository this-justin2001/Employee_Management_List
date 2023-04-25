package homework;
public class employeeInfo { //variable initialization
	protected String firstName;
	protected String lastName;
	protected int employeeID;
	protected double salary;
	
	public employeeInfo() { //default employee information
		firstName = "void";
		lastName = "void";
		employeeID = 0;
		salary = 0;
	}
	public employeeInfo(String newLastName, String newFirstName, int newEmployeeID, double newSalary) {
		setEmployee(newLastName, newFirstName, newEmployeeID, newSalary);
	}
	//set method for private variables
	public void setEmployee (String newLastName, String newFirstName, int newEmployeeID, double newSalary) {
		firstName = newFirstName;
		lastName = newLastName;
		salary = newSalary;
	}
	public void setID( int newEmployeeID) {
		employeeID = newEmployeeID;
	}
	public int getID() {return employeeID;}
	
	public void printEmpInfo() {
		System.out.println("Name: " + lastName + ", " + firstName);
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Salary: $" + salary);
	}
}
