package com.sriteja.api.service;

import com.sriteja.api.model.CompanyDetails;

public interface CompanyService {

	public String insertCompanyDetails(CompanyDetails companyDetails);

	public CompanyDetails getCompanyDetailsByCompanyName(String companyName);
}
