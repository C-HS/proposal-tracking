package com.sbm.proposal.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbm.proposal.dto.ComponentDTO;
import com.sbm.proposal.model.Component;
import com.sbm.proposal.repository.ComponentRepository;
import com.sbm.proposal.service.ComponentService;


@Service
public class ComponentServiceImpl implements ComponentService{
	
	@Autowired ComponentRepository componentRepository;
	@Autowired ModelMapper modelMapper;

	@Override
	public void addComponent(Component component) {
		// TODO Auto-generated method stub
		
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
