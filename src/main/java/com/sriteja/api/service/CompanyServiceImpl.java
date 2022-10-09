package com.sriteja.api.service;


import java.util.Optional;

import javax.transaction.Transactional;

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

	@Override
	public CompanyDetails getCompanyDetailsBasedOnEmailAndMobile(String email, String mobile) {
		 logger.info("Email = "+email +" Mobile = "+mobile+" in Service Layer..");
		CompanyDetails response = companyRepository.findByEmailAndMobile(email,mobile); //method calling
		return response;
	}

	@Override
	public String updateComapnyDetailsBasedOnEmailAndCompanyName(CompanyDetails companyDetails, String email,
			String companyName) {
		 logger.info("companyDetails:: "+companyDetails);
		 logger.info("Email = "+email +" CompanyName = "+companyName+" in Service Layer..");
		 String response =null;
		CompanyDetails company = companyRepository.findByEmailAndCompnayName(email, companyName);
		if(Optional.ofNullable(company).isPresent()) {
			company.setGst(companyDetails.getGst());
			company.setTurnOver(companyDetails.getTurnOver());
			
			companyRepository.save(company);
			return response = "Company details updated successfully based on company emailid "+email+ "and company name "+companyName;
		}else{
			return response = "we don't have any matching data with Email id "+email+" Company Name "+companyName;
		}
	}

	@Transactional
	@Override
	public String deleteCompanyDetailsBasedOnCompanyIdAndCompanyName(int companyId, String companyName) {
		 logger.info("Company Id = "+companyId +" CompanyName = "+companyName+" in Service Layer..");
		
		 companyRepository.deleteByCompanyIdAndCompanyName(companyId, companyName);
		 
		return "Company data deleted based on company id = "+companyId+" and company name = "+companyName+".";
	}

	

}
