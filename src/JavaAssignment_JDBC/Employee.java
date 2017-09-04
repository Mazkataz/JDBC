package JavaAssignment_JDBC;

import java.io.*;
import java.util.*;
import java.sql.*;

public class Employee {

	private String firstName;
	private String lastName;
	private String timeIn;
	private String timeOut;
	int number;
	Connection conn = null;
	Statement stmt = null;

	Employee(String e_firstName, String e_lastName) {

		this.firstName = e_firstName;
		this.lastName = e_lastName;

	}

	Employee() {

	}

	public void createNewEmployee() {

		String eName = this.getFirstName() + this.getLastName();
		int eNum = 0;

		System.out.println(eName + ", your employee number is" + eNum + " Use this number to clock in and out.");

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTimeIn() {
		return timeIn;
	}

	public void setTimeIn(String timeIn) {
		this.timeIn = timeIn;
	}

	public String getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
