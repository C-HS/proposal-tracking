package com.sbm.proposal.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbm.proposal.dto.ProjectDTO;
import com.sbm.proposal.model.Project;
import com.sbm.proposal.repository.ProjectRepository;
import com.sbm.proposal.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired ProjectRepository projectRepository;
	@Autowired ModelMapper modelMapper;

	@Override
	public void addProject(Project project) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProjectDTO updateProject(Project project) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectDTO getProjectByID(long projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProject(Project project) {
		// TODO Auto-generated method stub
		
	}

}
