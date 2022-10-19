package com.sriteja.api.bean;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee{

	//attributes
	@JsonProperty("employee_id")
	private int employeeId;
	
	@JsonProperty("employee_name")
	private String employeeName;
	
	@JsonProperty("employee_mobile")
	private String employeeMobile;
	
	@JsonProperty("employee_email")
	private String employeeEmail;
	
	@JsonProperty("employee_salary")
	private Double employeeSalary;
	
	@JsonProperty("employee_dep")
	private String employeeDep;
	
	@JsonProperty("employee_joining_date")
	private String employeeJoiningDate;
	
	
	//default constructor
	public Employee() {
		
	}
	
	//setter and getter methods
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
	
	//toString() methods
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeMobile="
				+ employeeMobile + ", employeeEmail=" + employeeEmail + ", employeeSalary=" + employeeSalary
				+ ", employeeDep=" + employeeDep + ", employeeJoiningDate=" + employeeJoiningDate + "]";
	}
	
	
}
