package com.surendra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.surendra.service.SSNServiceImpl;

@RestController
public class SSNValidator {
	
	@Autowired
	private SSNServiceImpl ser;
	
	@GetMapping(value="/checkSSN/{ssn}/{state}")
	public ResponseEntity<String> validateSSNNumber(@PathVariable("ssn") String ssn,@PathVariable String state)
	{
		String status = ser.checkSSN(Long.parseLong(ssn), state);
		return new ResponseEntity<String>(status,HttpStatus.OK);
	}

}
