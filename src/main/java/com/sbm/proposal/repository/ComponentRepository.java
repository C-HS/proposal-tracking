package com.sbm.proposal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbm.proposal.model.Component;

@Repository
public interface ComponentRepository extends JpaRepository<Component, Long> {

	public List<Component> findByProposalId(long proposalId);
	public List<Component> findByComponentName(String componentName);
}
