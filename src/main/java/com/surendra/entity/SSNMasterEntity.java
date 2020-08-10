package com.surendra.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name="ssn_master")
public class SSNMasterEntity {
	@Id
	//@SequenceGenerator(name="mysequence",sequenceName ="customer_id_sequence", allocationSize = 1)
	@GeneratedValue  //(strategy = GenerationType.SEQUENCE)
	@Column(name="SSN_NUMBER")
	private Long ssnNumber;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="GENDER")
	private char gender;
	
	@Column(name="DOB")
	private Date dob;
	
	@Column(name="STATE_NAME")
	private String stateName;
	
	@Column(name="CREATED_DATE",updatable  = false)
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@Column(name="UPDATED_DATE",insertable = false)
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
	

}
