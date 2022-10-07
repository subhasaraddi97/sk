package com.marketing12.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.marketing12.entites.Lead;
import com.marketing12.repository.Leadrepository;
@Service
public class LeadServiceImpl implements LeadService {

	
	@Autowired
	private Leadrepository leadRepo;
	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);
		
	}
	@Override
	public List<Lead> getLeads() {
	List<Lead> leads = leadRepo.findAll();
		return leads;
	}
	@Override
	public void deleteOneLead(long id) {
		
		
	}
	
	@Override
	public Lead findOneLead(long id) {
	
		return null;
	}
	
	}


