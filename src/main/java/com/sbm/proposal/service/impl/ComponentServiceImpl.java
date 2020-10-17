package com.sbm.proposal.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbm.proposal.dto.ComponentDTO;
import com.sbm.proposal.dto.ProposalDTO;
import com.sbm.proposal.model.Component;
import com.sbm.proposal.repository.ComponentRepository;
import com.sbm.proposal.service.ComponentService;


@Service
public class ComponentServiceImpl implements ComponentService{
	
	@Autowired ComponentRepository componentRepository;
	@Autowired ModelMapper modelMapper;

	@Override
	public long addComponent(Component component) {

		try
		{
			ComponentDTO componentDTO =modelMapper.map(componentRepository.save(component), ComponentDTO.class);
			
			return componentDTO.getComponentId();
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
	public List<ComponentDTO> getAllComponentsOfAProposal(long proposalId) {

		return componentRepository
				.findByProposalId(proposalId)
				.stream()
				.map(e -> modelMapper.map(e, ComponentDTO.class))
				.collect(Collectors.toList());
	}
	
	@Override
	public List<Long> getProposalIdsByComponentName(String componentName) {

		return componentRepository
				.findByComponentName(componentName)
				.stream()
				.map(e -> modelMapper.map(e.getProposalId(), Long.class))
				.collect(Collectors.toList());
	}

	@Override
	public ComponentDTO updateComponent(Component component) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComponentDTO getComponentByID(String componentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteComponent(Component component) {
		// TODO Auto-generated method stub
		
	}

}
