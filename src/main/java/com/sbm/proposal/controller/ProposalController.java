package com.sbm.proposal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sbm.proposal.dto.Components;
import com.sbm.proposal.dto.Root;
import com.sbm.proposal.service.ProposalService;

@Controller
public class ProposalController {

	@Autowired ProposalService proposalService;
	
	@PostMapping("/api/proposal/create")
	public ResponseEntity<String> registerRFIDTag(@RequestBody Root root) {
		
		
		System.out.println("Components "+root.getComponents().size());
		
		for(Components c : root.getComponents())
		{
			System.out.println("Projects "+c.getProjects().size());
			
			for(com.sbm.proposal.dto.Projects p : c.getProjects())
			{
				System.out.println("Dumpsite "+p.getDumpsites());
				
				System.out.println("waterbody "+p.getWaterbody());
				
				System.out.println("plant_info "+p.getPlant_info());
			}
			
		}
		
		
		return ResponseEntity.status(200).body("created"); 
	
	}
}
