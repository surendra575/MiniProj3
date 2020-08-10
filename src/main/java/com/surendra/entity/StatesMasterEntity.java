package com.surendra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "usa_states_master")
public class StatesMasterEntity {
	
	@Id
	@Column(name="STATE_ID")
	private int id;
	
	@Column(name="STATE_NAME")
	private String stateName;

}
