package JavaAssignment_JDBC;

import java.util.Date;

public class existingEmployee extends Employee {

	existingEmployee(String e_firstName, String e_lastName) {
		super(e_firstName, e_lastName);

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

		setTimeIn(curTime);
	
	}

}
