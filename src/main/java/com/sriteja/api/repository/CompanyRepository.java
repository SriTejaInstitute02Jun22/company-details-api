package com.sriteja.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sriteja.api.model.CompanyDetails;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyDetails, Integer> {

}
