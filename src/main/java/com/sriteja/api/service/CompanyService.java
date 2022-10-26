package com.sriteja.api.service;

import com.sriteja.api.bean.CompanyDetailsRequest;
import com.sriteja.api.bean.CompanyDetailsResponse;
import com.sriteja.api.model.CompanyDetails;

public interface CompanyService {

	public String insertCompanyDetails(CompanyDetails companyDetails);

	public CompanyDetails getCompanyDetailsByCompanyName(String companyName);

	public CompanyDetails getCompanyDetailsBasedOnEmailAndMobile(String email, String mobile);

	public String updateComapnyDetailsBasedOnEmailAndCompanyName(CompanyDetails companyDetails, String email,
			String companyName);

	public String deleteCompanyDetailsBasedOnCompanyIdAndCompanyName(int companyId, String companyName);

}
