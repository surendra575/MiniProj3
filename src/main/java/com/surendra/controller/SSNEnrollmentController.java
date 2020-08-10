package com.surendra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.surendra.binding.SSNEnrollmentRequest;
import com.surendra.service.SSNServiceImpl;

@RestController
public class SSNEnrollmentController {
	@Autowired
	private SSNServiceImpl service;
	
	@PostMapping(value = "/ssnEnroll",consumes = "application/json")
	public ResponseEntity<String> enroll(@RequestBody SSNEnrollmentRequest req)
	{
		Long ssnNumber = service.ssnEnrollment(req);
		String body="Your SSN enrollment completed successfully . Your SSN number is: "+ssnNumber;
		return new ResponseEntity<String>(body,HttpStatus.CREATED);
	}
	
	

}
