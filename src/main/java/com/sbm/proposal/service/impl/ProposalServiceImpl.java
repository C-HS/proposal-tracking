package com.sbm.proposal.service.impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbm.proposal.dto.ProposalDTO;
import com.sbm.proposal.dto.ProposalStatus;
import com.sbm.proposal.model.Proposal;
import com.sbm.proposal.repository.ProposalRepository;
import com.sbm.proposal.service.ProposalService;

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
	public List<ProposalDTO> getAllProposal() {

		return proposalRepository
				.findAll()
				.stream()
				.map(e -> modelMapper.map(e, ProposalDTO.class))
				.collect(Collectors.toList());
	}
	
	@Override
	public String setProposalStatus(ProposalStatus proposalStatus) {

		try
		{
				Proposal proposal = proposalRepository.findById(proposalStatus.getProposalId()).get();
				
				if(proposal!=null && proposal.getId()>0)
				{
					proposal.setProposalStatus(proposalStatus.getProposalStatus());
					proposal.setDateLastUpdate(new Date());
					
					modelMapper.map(proposalRepository.save(proposal), ProposalDTO.class);
					
					return "proposal_updated";
		
				}
				else
				{
					return "proposal_not_found";
				}
		}
		catch(Exception e)
		{
			return "error_in_updated";
		}

	}
	
	
	@Override
	public List<ProposalDTO> search(List<Long> ids, Date startDate, Date endDate, String status) {
		
		if(ids!=null && startDate!=null && endDate!=null && status!=null)
		{
			return proposalRepository
					.findAllProposalWithIdsBetweenDatesHavingStatus(ids, startDate, endDate,status)
					.stream()
					.map(e -> modelMapper.map(e, ProposalDTO.class))
					.collect(Collectors.toList());
			
		}
		else if(ids!=null && startDate!=null && endDate!=null && status==null)
		{
			return proposalRepository
					.findAllProposalWithIdsBetweenDates(ids, startDate, endDate)
					.stream()
					.map(e -> modelMapper.map(e, ProposalDTO.class))
					.collect(Collectors.toList());
			
		}
		else if(ids!=null && startDate==null && endDate==null && status!=null)
		{
			return proposalRepository
					.findAllProposalWithIdsHavingStatus(ids,status)
					.stream()
					.map(e -> modelMapper.map(e, ProposalDTO.class))
					.collect(Collectors.toList());
		}
		else if(ids!=null && startDate==null && endDate==null && status==null)
		{
			return proposalRepository
					.findAllById(ids)
					.stream()
					.map(e -> modelMapper.map(e, ProposalDTO.class))
					.collect(Collectors.toList());
		}
		else if(ids==null && startDate==null && endDate==null && status!=null)
		{
			return proposalRepository.findAllProposalHavingStatus(status)
					.stream()
					.map(e -> modelMapper.map(e, ProposalDTO.class))
					.collect(Collectors.toList());
		}
		else if(ids==null && startDate!=null && endDate!=null && status!=null)
		{
			return proposalRepository.findAllProposalBetweenDatesHavingStatus(startDate, endDate,status)
					.stream()
					.map(e -> modelMapper.map(e, ProposalDTO.class))
					.collect(Collectors.toList());
		}
		else if(ids==null && startDate!=null && endDate!=null && status==null)
		{
			return proposalRepository.findAllProposalBetweenDates(startDate, endDate)
					.stream()
					.map(e -> modelMapper.map(e, ProposalDTO.class))
					.collect(Collectors.toList());
		}


       return null;
	}
	
	
	@Override
	public List<ProposalDTO> search1(Date startDate, Date endDate) {

		return proposalRepository.findAllProposalBetweenDates(startDate, endDate)
				.stream()
				.map(e -> modelMapper.map(e, ProposalDTO.class))
				.collect(Collectors.toList());
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
