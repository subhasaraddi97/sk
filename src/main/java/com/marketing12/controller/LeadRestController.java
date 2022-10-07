package com.marketing12.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketing12.entites.Lead;
import com.marketing12.services.LeadService;

@RestController
@RequestMapping("/api/lead")
public class LeadRestController {
	
	@Autowired
	private LeadService leadservice;
	
	@GetMapping
	public List<Lead> getAllLeads(){
		List<Lead> leads = leadservice.getLeads();
		return leads;
		
	}
	@PostMapping
	public void saveOneLead(@RequestBody Lead lead) {
		leadservice.saveLead(lead);
		
	}
	@PutMapping
	public void updateOneLead(@RequestBody Lead lead) {
		leadservice.saveLead(lead);
		
	}
	@DeleteMapping("/delete/{id}")
	public void deleteOneLead(@PathVariable("id") long id) {
		leadservice.deleteOneLead(id);
	}
	@RequestMapping("/get/{id}")
	public Lead getOneLead(@PathVariable("id") long id) {
		Lead lead = leadservice.findOneLead(id);
		return lead;
	}		

     
}
