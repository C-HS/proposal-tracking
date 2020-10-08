package com.sbm.proposal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbm.proposal.model.Proposal;

@Repository
public interface ProposalRepository extends JpaRepository<Proposal, Long>  {

}
