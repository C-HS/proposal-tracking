package com.sbm.proposal.service;

import com.sbm.proposal.dto.ComponentDTO;
import com.sbm.proposal.model.Component;

public interface ComponentService {

	public long addComponent(Component component);
	public ComponentDTO updateComponent(Component component);
	public ComponentDTO getComponentByID(String componentId);
	public void deleteComponent(Component component);
}
