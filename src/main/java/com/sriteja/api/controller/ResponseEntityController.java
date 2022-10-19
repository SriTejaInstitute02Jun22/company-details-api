package com.sriteja.api.controller;

import java.util.Optional;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sriteja.api.model.CompanyDetails;

@RestController
public class ResponseEntityController {

	@GetMapping("/get-my-name")
	public ResponseEntity<String> getMyName() {
		String myName = "RameshBabu";
		
		
		//HttpHeader 
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("id", "1334");
		return ResponseEntity.ok().headers(httpHeaders).body(myName);
	}
	
	@PostMapping("/create-company-data")
	public ResponseEntity<CompanyDetails> insertCompanyDetails(@RequestBody CompanyDetails companyDetails) {
		
		if(Optional.ofNullable(companyDetails).isPresent()) {
			System.out.println("CompanyDetails========"+companyDetails);
			return new ResponseEntity<CompanyDetails>(companyDetails, HttpStatus.CREATED);
		}else {
			CompanyDetails companyData = new CompanyDetails();
			return new ResponseEntity<>(companyData, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	/*	if(companyDetails != null) {
			System.out.println("CompanyDetails========"+companyDetails);
			return new ResponseEntity<CompanyDetails>(companyDetails, HttpStatus.CREATED);
		}else {
			CompanyDetails companyData = new CompanyDetails();
			return new ResponseEntity<>(companyData, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		*/
	}
}
