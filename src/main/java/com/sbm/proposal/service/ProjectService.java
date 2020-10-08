package com.sbm.proposal.service;

import com.sbm.proposal.dto.ProjectDTO;
import com.sbm.proposal.model.Project;

public interface ProjectService {

	public void addProject(Project project);
	public ProjectDTO updateProject(Project project);
	public ProjectDTO getProjectByID(long projectId);
	public void deleteProject(Project project);
}
