package com.sbm.proposal.service;

import com.sbm.proposal.dto.ProjectTypeDTO;
import com.sbm.proposal.model.ProjectType;

public interface ProjectTypeService {

	public void addProjectType(ProjectType projectType);
	public ProjectTypeDTO updateProjectType(ProjectType projectType);
	public ProjectTypeDTO getProjectTypeByID(String projectTypeId);
	public void deleteProjectType(ProjectType projectType);
}
