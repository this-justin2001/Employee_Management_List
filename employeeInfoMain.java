package homework;
import java.util.Scanner;
import java.util.ArrayList;

public class employeeInfoMain {

	public static void main(String[] args) throws Exception{
		Scanner scnr = new Scanner(System.in);
		ArrayList <employeeInfo> newEmployee = new ArrayList<employeeInfo>();
		employeeInfo employee = new employeeInfo();
		managementInfo manager = new managementInfo();
		int verif;
		
		employee.setEmployee("Silva","Brandon",132,23421.23);
		newEmployee.add(employee);
		
		manager.setEmployee("Mendoza", "Rene", 321, 43201.98);
		manager.setManagementInfo("Produce");

		System.out.println("Would you like to include management information? Press 1 for YES and 0 for NO");
		verif = scnr.nextInt();
		if (verif == 1) {
			System.out.println("Employee");//CORRECTION: Defines object as employee or manager 
			employee.printEmpInfo();
			System.out.println("--------------------"); //CORRECTION: Separates objects, helps with readability
			System.out.println("Managment");//CORRECTION: Defines object as employee or manager
			manager.printEmpInfo();
		} else if(verif == 0) {
			System.out.println("Employee");//CORRECTION: Defines object as employee or manager
			employee.printEmpInfo();
		}

	}

}

