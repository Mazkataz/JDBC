package JavaAssignment_JDBC;

import java.util.Scanner;

public class inputCollector {

	private String firstName;
	private String lastName;
	private int employeeNo;
	private int menuItem;

	Scanner sc;

	public void getEmployeeInput() {

		System.out.println("Please Enter your Employee Number");

		sc = new Scanner(System.in);

		this.employeeNo = sc.nextInt();

		System.out.println("Now, What would you like to do?");
		System.out.println("1. ClockIn \n2.ClockOut\n3.Edit Employee Information\n4.Delete Record\n5.Exit");

		this.menuItem = sc.nextInt();

		existingEmployee existEmp = new existingEmployee(this.employeeNo, this.menuItem);
	}

	public void collectInput() {

		System.out.println("Good day! Are you a new or existing employee? Enter corresponding number:");

		int input = sc.nextInt();

		if (input == 1) {
			System.out.println("please enter your first name");
			this.firstName = sc.nextLine();

			System.out.println("please enter your last name");
			this.lastName = sc.nextLine();

			Employee emp = new Employee(firstName, lastName);

			emp.createNewEmployee();
		} else if (input == 2) {
			getEmployeeInput();
		}

	}

}
