package com.sriteja.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * This is entity class, to create the company details into the database.
 * */
@Entity
@Table(name = "company")
public class CompanyDetails {

	//attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int companyId;

	private String companyName;

	private String companyAddress;

	private String mobile;

	private String email;

	private String gst;

	private String companyLocation;

	private String companyCategiry;

	private int turnOver;

	//non parameterized constructor
	public CompanyDetails() {

	}

	//parameterized constructor
	public CompanyDetails(int companyId, String companyName, String companyAddress, String mobile, String email,
			String gst, String companyLocation, String companyCategiry, int turnOver) {
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.mobile = mobile;
		this.email = email;
		this.gst = gst;
		this.companyLocation = companyLocation;
		this.companyCategiry = companyCategiry;
		this.turnOver = turnOver;
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

	//toString method
	@Override
	public String toString() {
		return "CompanyDetails [companyId=" + companyId + ", companyName=" + companyName + ", companyAddress="
				+ companyAddress + ", mobile=" + mobile + ", email=" + email + ", gst=" + gst + ", companyLocation="
				+ companyLocation + ", companyCategiry=" + companyCategiry + ", turnOver=" + turnOver + "]";
	}
	
	
}
