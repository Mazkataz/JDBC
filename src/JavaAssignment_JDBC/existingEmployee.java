package JavaAssignment_JDBC;

import java.util.Date;

public class existingEmployee extends Employee {

	existingEmployee(int employeeNo, int menuItem) {
		// super(employeeNo, menuItem);
		super();

		this.number = employeeNo;

	}

	void clockIn(int empNumber) {

		// initialize current date
		Date date = new Date();

		// set the date equal to a string temporarily
		String curTime = date.toString();

		setTimeIn(curTime);

	}

	void clockOut(int empNumber) {

		// initialize current date
		Date date = new Date();

		// set the date equal to a string temporarily
		String curTime = date.toString();

		setTimeOut(curTime);

	}

}
