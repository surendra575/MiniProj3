package com.surendra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surendra.binding.SSNEnrollmentRequest;
import com.surendra.entity.SSNMasterEntity;
import com.surendra.repository.SSNMasterRepository;
import com.surendra.repository.StateMasterRepository;
@Service
public class SSNServiceImpl implements SSNService {
	@Autowired
	private SSNMasterRepository masterRepo;
	@Autowired
	private StateMasterRepository stateRepo;

	@Override
	public List<String> getAllStates() {
		List<String> states = stateRepo.findAllStates();
		return states;
	}

	@Override
	public Long ssnEnrollment(SSNEnrollmentRequest req) {
		SSNMasterEntity en=new SSNMasterEntity();
		//BeanUtils.copyProperties(req, en);
		//en.setSsnNumber(12l);
		en.setFirstName(req.getFirstName());
		en.setLastName(req.getLastName());
		en.setDob(req.getDob());
		en.setGender(req.getGender());
		en.setStateName(req.getStateName());
		
		System.out.println("Request details: "+req.getFirstName()+" "+req.getLastName()+" "+req.getGender()+" "+req.getStateName());
		System.out.println("Entity details"+en.getSsnNumber()+" "+en.getFirstName()+" "+en.getLastName()+" "+en.getGender()+" "+en.getStateName());
		
		System.out.println(masterRepo.save(en));
		SSNMasterEntity saveEntity = masterRepo.save(en);
		if(saveEntity!=null)
		{
			return en.getSsnNumber();
		}
		else {
		return null;}
	}

	@Override
	public String checkSSN(Long ssn, String state) {
		SSNMasterEntity en = masterRepo.findBySsnNumberAndStateName(ssn, state);
		if(en!=null)
		{
			return "VALID";
		}
		return "IN-VALID";
	}

}
