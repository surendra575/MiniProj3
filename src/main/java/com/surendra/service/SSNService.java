package com.surendra.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.surendra.binding.SSNEnrollmentRequest;


public interface SSNService {
	public List<String> getAllStates();
	public Long ssnEnrollment(SSNEnrollmentRequest req);
	public String checkSSN(Long ssn,String state);

}
