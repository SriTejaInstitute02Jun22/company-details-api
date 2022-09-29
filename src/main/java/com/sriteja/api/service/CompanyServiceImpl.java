package com.sriteja.api.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sriteja.api.model.CompanyDetails;
import com.sriteja.api.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService {

	private static final Logger logger = LoggerFactory.getLogger(CompanyServiceImpl.class);

	@Autowired
	private CompanyRepository companyRepository;

	@Override
	public String insertCompanyDetails(CompanyDetails companyDetails) {
		logger.info("Company Details in Service Layer :: " + companyDetails);
		companyRepository.save(companyDetails);

		return "Company data successfully inserted.";
	}

	@Override
	public CompanyDetails getCompanyDetailsByCompanyName(String companyName) {
		logger.info("Company Name in Service Layer :: "+companyName);
		CompanyDetails response = companyRepository.findByCompanyName(companyName);
		return response;
	}

}
