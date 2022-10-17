package com.sriteja.api.bean;

public class EmployeeDetails {

	private int employeeId;
	private String employeeName;
	private String employeeMobile;
	private String employeeEmail;
	private Double employeeSalary;
	private String employeeDep;
	private String employeeJoiningDate;
	
	
	public EmployeeDetails() {
		
	}

	public EmployeeDetails(int employeeId, String employeeName, String employeeMobile, String employeeEmail,
			Double employeeSalary, String employeeDep, String employeeJoiningDate) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeMobile = employeeMobile;
		this.employeeEmail = employeeEmail;
		this.employeeSalary = employeeSalary;
		this.employeeDep = employeeDep;
		this.employeeJoiningDate = employeeJoiningDate;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeMobile() {
		return employeeMobile;
	}

	public void setEmployeeMobile(String employeeMobile) {
		this.employeeMobile = employeeMobile;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public Double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeDep() {
		return employeeDep;
	}

	public void setEmployeeDep(String employeeDep) {
		this.employeeDep = employeeDep;
	}

	public String getEmployeeJoiningDate() {
		return employeeJoiningDate;
	}

	public void setEmployeeJoiningDate(String employeeJoiningDate) {
		this.employeeJoiningDate = employeeJoiningDate;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeMobile="
				+ employeeMobile + ", employeeEmail=" + employeeEmail + ", employeeSalary=" + employeeSalary
				+ ", employeeDep=" + employeeDep + ", employeeJoiningDate=" + employeeJoiningDate + "]";
	}

	
}
