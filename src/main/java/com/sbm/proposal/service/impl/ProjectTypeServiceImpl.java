package com.sbm.proposal.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbm.proposal.dto.ProjectTypeDTO;
import com.sbm.proposal.model.ProjectType;
import com.sbm.proposal.repository.ProjectTypeRepository;
import com.sbm.proposal.service.ProjectTypeService;

@Service
public class ProjectTypeServiceImpl implements ProjectTypeService {

	
	@Autowired ProjectTypeRepository projectTypeRepository;
	@Autowired ModelMapper modelMapper;
	
	@Override
	public void addProjectType(ProjectType projectType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProjectTypeDTO updateProjectType(ProjectType projectType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectTypeDTO getProjectTypeByID(String projectTypeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProjectType(ProjectType projectType) {
		// TODO Auto-generated method stub
		
	}

}
