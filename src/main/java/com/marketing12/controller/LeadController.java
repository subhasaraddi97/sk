package com.marketing12.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marketing12.entites.Lead;
import com.marketing12.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadservice;
	@RequestMapping(value="/viewCreateLeadPage", method=RequestMethod.GET)
	public String viewCreateLeadPage() {
		return "create_lead";
		
	}
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("lead")Lead lead ,ModelMap model) {
		leadservice.saveLead(lead);
		model.addAttribute("msg", "leadsaved"  );
	
		return "create_lead";
	}
	@RequestMapping("/listall")
	public String getAllLeads(ModelMap model) {
		List<Lead>leads=leadservice.getLeads();
		model.addAttribute("leads", leads);
		return "Lead_search";
		
	
	
	}

}
