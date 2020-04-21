package com.karvis.model;
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
	
	public Employee(long empId, String name, long mobileNo, String emailId) {
		super();
		this.empId = empId;
		this.name = name;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
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

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", mobileNo=" + mobileNo + ", emailId=" + emailId + "]";
	}
	
	
	
}
