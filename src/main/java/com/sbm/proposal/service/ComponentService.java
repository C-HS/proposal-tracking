package com.sbm.proposal.service;

import java.util.List;

import com.sbm.proposal.dto.ComponentDTO;
import com.sbm.proposal.model.Component;

public interface ComponentService {

	public long addComponent(Component component);
	public List<ComponentDTO> getAllComponentsOfAProposal(long proposalId);
	public List<Long> getProposalIdsByComponentName(String componentName);
	public ComponentDTO updateComponent(Component component);
	public ComponentDTO getComponentByID(String componentId);
	public void deleteComponent(Component component);
}
