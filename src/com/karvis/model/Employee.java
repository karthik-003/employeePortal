package com.karvis.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author karthik
 * v1.0
 */
public class Employee {

	long empId;
	String name;
	long mobileNo;
	String emailId;
	Date dob;
	String department;
	
	public Employee(long empId, String name, long mobileNo, String emailId,String dob) {
		super();
		this.empId = empId;
		this.name = name;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		
		try {
			this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.err.println("Date format should be dd/MM/yyyy.");
		} 
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public Date getDob() {
		return dob;
	}
	
	public String getDobAsString() {
		return new SimpleDateFormat("dd/MM/yyyy").format(this.dob);
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}

	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", mobileNo=" + mobileNo + ", emailId=" + emailId
				+ ", dob=" + this.getDobAsString() + ", department="+department+"]";
	}

	
	
	
	
}
