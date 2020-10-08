package com.sbm.proposal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbm.proposal.dto.ProposalDTO;
import com.sbm.proposal.model.Proposal;
import com.sbm.proposal.repository.ProposalRepository;
import com.sbm.proposal.service.ProposalService;

import org.modelmapper.ModelMapper;

@Service
public class ProposalServiceImpl implements ProposalService{

	@Autowired ProposalRepository proposalRepository;
	@Autowired ModelMapper modelMapper;
	
	@Override
	public void addProposal(Proposal proposal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProposalDTO updateProposal(Proposal proposal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProposalDTO getProposalByID(String proposalId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProposal(Proposal proposal) {
		// TODO Auto-generated method stub
		
	}

}
