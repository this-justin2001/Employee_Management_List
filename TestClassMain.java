package homework;
import java.util.Scanner;
public class TestClassMain {
	public static void main(String[] args) {
		employeeInfo tester = new employeeInfo();
		managementInfo testerM = new managementInfo();
		int userTest;
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter your test ID.");	
		userTest = scnr.nextInt();
		
		System.out.println("Testing...");
		
		tester.setID(userTest);
		if (tester.getID() != userTest) {
			System.out.println("FAIL: set/getID does not match your input");
		} else {
			System.out.println("Success!"); // CORRECTION: confirm. that test was successful
			System.out.println("Test ID is: " + tester.getID()); //CORRECTION: Displays test ID
		}

	}

}