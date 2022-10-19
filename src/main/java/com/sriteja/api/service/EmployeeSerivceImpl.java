package com.sriteja.api.service;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sriteja.api.bean.CompanyDetailsRequest;
import com.sriteja.api.bean.CompanyDetailsResponse;
import com.sriteja.api.bean.Employee;
import com.sriteja.api.bean.EmployeeDetails;

@Service
public class EmployeeSerivceImpl implements EmployeeSerivce {

	// logger
	private static final Logger logger = LoggerFactory.getLogger(EmployeeSerivceImpl.class);

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public CompanyDetailsResponse getEmployeeDataByEmployeeId(CompanyDetailsRequest companyDetailsRequest) {
		logger.info("CompanyDetailsRequest..........."+companyDetailsRequest+" in Service Layer");
		
		int employeeId = companyDetailsRequest.getEmployee().getEmployeeId();
		logger.info("Employee Id :: "+employeeId);
		
		
		//calling the employee-details-api application
		String url = "http://localhost:2222/api/get-employee-details-based-on-employeeid/"+employeeId;
		
		//HttpHeaders object, it can contain only header values 
		 HttpHeaders headers = new HttpHeaders();
	     headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	     
	     //HttpEnitty object , it can contain header values and request body.
	     HttpEntity<String> entity = new HttpEntity<String>(headers);
	      
	     //calling to employee-details-api
	     EmployeeDetails empResponse = restTemplate.exchange(url, HttpMethod.GET, entity, EmployeeDetails.class).getBody();
		logger.info("employee-details-api..............Employee..........."+empResponse);
		
		if(empResponse!=null) {
			//Employee Object
			Employee employee = new Employee();
			employee.setEmployeeId(empResponse.getEmployeeId());
			employee.setEmployeeName(empResponse.getEmployeeName());
			employee.setEmployeeMobile(empResponse.getEmployeeMobile());
			employee.setEmployeeEmail(empResponse.getEmployeeEmail());
			employee.setEmployeeSalary(empResponse.getEmployeeSalary());
			employee.setEmployeeDep(empResponse.getEmployeeDep());
			employee.setEmployeeJoiningDate(empResponse.getEmployeeJoiningDate());
			
			//create the CompanyDetailsResponse object
			CompanyDetailsResponse companyDetailsResponse = new CompanyDetailsResponse();
			companyDetailsResponse.setCompanyId(companyDetailsRequest.getCompanyId());
			companyDetailsResponse.setCompanyName(companyDetailsRequest.getCompanyName());
			companyDetailsResponse.setCompanyAddress(companyDetailsRequest.getCompanyAddress());
			companyDetailsResponse.setMobile(companyDetailsRequest.getMobile());
			companyDetailsResponse.setEmail(companyDetailsRequest.getEmail());
			companyDetailsResponse.setGst(companyDetailsRequest.getGst());
			companyDetailsResponse.setCompanyLocation(companyDetailsRequest.getCompanyLocation());
			companyDetailsResponse.setCompanyCategiry(companyDetailsRequest.getCompanyCategiry());
			companyDetailsResponse.setTurnOver(companyDetailsRequest.getTurnOver());
			//set the employee object 
			companyDetailsResponse.setEmployee(employee);
			
			return companyDetailsResponse;
		}else {
			//create the CompanyDetailsResponse object
			CompanyDetailsResponse companyDetailsResponse = new CompanyDetailsResponse();
			companyDetailsResponse.setCompanyId(companyDetailsRequest.getCompanyId());
			companyDetailsResponse.setCompanyName(companyDetailsRequest.getCompanyName());
			companyDetailsResponse.setCompanyAddress(companyDetailsRequest.getCompanyAddress());
			companyDetailsResponse.setMobile(companyDetailsRequest.getMobile());
			companyDetailsResponse.setEmail(companyDetailsRequest.getEmail());
			companyDetailsResponse.setGst(companyDetailsRequest.getGst());
			companyDetailsResponse.setCompanyLocation(companyDetailsRequest.getCompanyLocation());
			companyDetailsResponse.setCompanyCategiry(companyDetailsRequest.getCompanyCategiry());
			companyDetailsResponse.setTurnOver(companyDetailsRequest.getTurnOver());
			//set the employee object 
			companyDetailsResponse.setEmployee(null);
			return companyDetailsResponse;
		}
		
		
	}

}
