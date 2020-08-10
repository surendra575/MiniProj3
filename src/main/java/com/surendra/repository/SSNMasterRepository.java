package com.surendra.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surendra.entity.SSNMasterEntity;

public interface SSNMasterRepository extends JpaRepository<SSNMasterEntity, Serializable> {
	
	public SSNMasterEntity findBySsnNumberAndStateName(Long ssnNumber,String stateName);

}
