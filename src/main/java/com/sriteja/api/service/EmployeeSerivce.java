package com.sriteja.api.service;

import com.sriteja.api.bean.CompanyDetailsRequest;
import com.sriteja.api.bean.CompanyDetailsResponse;

public interface EmployeeSerivce {

	CompanyDetailsResponse getEmployeeDataByEmployeeId(CompanyDetailsRequest companyDetailsRequest);

}
