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
	public long addProposal(Proposal proposal) {

		try
		{
			ProposalDTO proposalDTO =modelMapper.map(proposalRepository.save(proposal), ProposalDTO.class);
			
			return proposalDTO.getId();
		}
		catch(org.springframework.dao.DataIntegrityViolationException e)
		{
			return -1;			
		}
		catch(Exception e)
		{
			return -2;	
		}
		
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
