package com.sriteja.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sriteja.api.model.CompanyDetails;
import com.sriteja.api.service.CompanyService;
/**
 * this call is using for company details data
 * */
@RestController
@RequestMapping("/api")
public class CompanyController {

	//log4j to print the logs in the console.
	private static final Logger logger = LoggerFactory.getLogger(CompanyController.class);
	
	@Autowired
	private CompanyService companyService;
	
	
	
	
	/**
	 * insert the company details 
	 * @return response
	 * */
	@PostMapping("/company-details")
	public String addCompanyDetails(@RequestBody CompanyDetails companyDetails) {
		
		logger.info("Company Details :: "+companyDetails);
		
		String response = "Company data successfully inserted.";
		
		return response;
	}
	
	/**
	 * get the company details based on company Id
	 * @param companyId
	 * @return string
	 * */
	@GetMapping("/get-company-details/{companyId}")
	public String  getCompanyDetails(@PathVariable int companyId) {
		
		logger.info("Company Id = "+companyId);
		
		String response = "My company Id :: "+companyId;
		return response;
		
	}
	
	@GetMapping("/company-details")
	public String getCompanyDataByCompanyId(@RequestParam int companyId) {
		
		logger.info("Company Id :: "+companyId);
		String response = "Company Id :: "+companyId;
		
		return response;
	}
	
	/**
	 * this method is going to updat the company details.
	 * @param comapanyDetails
	 * @param companyId
	 * @return response message
	 * */
	@PutMapping("/update-company-details/{companyId}")
	public String updateCompanyDetailsByCompanyId(@RequestBody CompanyDetails companyDetails, @PathVariable int companyId) {
		logger.info("Company Details :: "+companyDetails);
		
		String response = "Company Data successfully updated with Company Id = "+companyDetails.getCompanyId();
		return response;
	}
	
	/**
	 * this method is using to delete the company data by company id
	 * @param companyId
	 * @return success response
	 * */
	@DeleteMapping("/delete-company-data")
	public String deleteCompanyDataByCompanyId(@RequestParam int companyId) {
		logger.info("Company Id :: "+companyId);
		
		String response = "Data successfully deleted by Company Id = "+companyId;
		return response;
	}
	
	
	@PatchMapping("/partial-update-company-data/{email}")
	public String  partialUpdateByEmail(@PathVariable String email) {
		logger.info("Company Email :: "+email);
		String response = "Company Data is successfully updated with email = "+email;
		return response;		
		
	}
	
	/**
	 * add the company details using post method
	 * @param companyDetails
	 * @return string - response
	 * */
	@PostMapping("/add-company-details")
	public String insertCompanyDetails(@RequestBody CompanyDetails companyDetails) {
		logger.info("Company Details in Controller Layer:: "+companyDetails);
		
		String response = companyService.insertCompanyDetails(companyDetails);
		
		return response;
		
	}
	
	/**
	 * get the company details based on company name
	 * @param companyName
	 * @return CompanyDetails
	 * */
	@GetMapping("/company-details/{companyName}")
	public CompanyDetails getCompanyDetailsByCompanyName(@PathVariable() String companyName) {
		logger.info("Company Name in Controller Layer :: "+companyName);
		CompanyDetails response = companyService.getCompanyDetailsByCompanyName(companyName);
		return response;
	}
	
}
