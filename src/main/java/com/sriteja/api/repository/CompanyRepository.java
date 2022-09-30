package com.sriteja.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sriteja.api.model.CompanyDetails;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyDetails, Integer> {

	//JPQL(Java Persistence query language)
	@Query(value = "select * from company c where c.company_name = :companyName", nativeQuery = true)
	CompanyDetails findByCompanyName(@Param("companyName") String companyName);

	@Query(value = "select * from company c where c.email=:email and c.mobile=:mobile", nativeQuery = true)
	CompanyDetails findByEmailAndMobile(@Param("email") String email, @Param("mobile") String mobile);
	
	
	
}
