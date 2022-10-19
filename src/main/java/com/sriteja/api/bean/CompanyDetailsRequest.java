package com.sriteja.api.bean;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyDetailsRequest implements Serializable{
	
	@JsonProperty("company_id")
	private int companyId;
	
	@JsonProperty("company_name")
	private String companyName;
	
	@JsonProperty("company_address")
	private String companyAddress;
	
	@JsonProperty("mobile")
	private String mobile;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("gst")
	private String gst;
	
	@JsonProperty("company_location")
	private String companyLocation;
	
	@JsonProperty("company_categiry")
	private String companyCategiry;
	
	@JsonProperty("turn_over")
	private int turnOver;
	
	@JsonProperty("employee")
	private Employee employee;

	//default Constructor
	public CompanyDetailsRequest() {

	}

	//setter and getter methods
	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGst() {
		return gst;
	}

	public void setGst(String gst) {
		this.gst = gst;
	}

	public String getCompanyLocation() {
		return companyLocation;
	}

	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}

	public String getCompanyCategiry() {
		return companyCategiry;
	}

	public void setCompanyCategiry(String companyCategiry) {
		this.companyCategiry = companyCategiry;
	}

	public int getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(int turnOver) {
		this.turnOver = turnOver;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	//toString() method
	@Override
	public String toString() {
		return "CompanyDetailsRequest [companyId=" + companyId + ", companyName=" + companyName + ", companyAddress="
				+ companyAddress + ", mobile=" + mobile + ", email=" + email + ", gst=" + gst + ", companyLocation="
				+ companyLocation + ", companyCategiry=" + companyCategiry + ", turnOver=" + turnOver + ", employee="
				+ employee + "]";
	}
	
	
	
	
}
