package com.surendra.binding;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SSNEnrollmentRequest {
	private String firstName;
	private String lastName;
	private char gender;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	private String stateName;

}
