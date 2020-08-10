package com.surendra.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.surendra.entity.StatesMasterEntity;

public interface StateMasterRepository extends JpaRepository<StatesMasterEntity, Serializable>{
	
	@Query(value = "select stateName from StatesMasterEntity")
	public List<String> findAllStates();
	
	

}
