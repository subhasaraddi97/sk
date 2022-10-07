package com.marketing12.services;

import java.util.List;

import com.marketing12.entites.Lead;

public interface LeadService {
	public void saveLead(Lead lead);

	public List<Lead> getLeads();

	public void deleteOneLead(long id);

	

	public Lead findOneLead(long id);

	

	

	

	

}
