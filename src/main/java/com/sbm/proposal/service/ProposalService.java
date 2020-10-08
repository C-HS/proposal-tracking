package com.sbm.proposal.service;

import com.sbm.proposal.dto.ProposalDTO;
import com.sbm.proposal.model.Proposal;

public interface ProposalService {

	public void addProposal(Proposal proposal);
	public ProposalDTO updateProposal(Proposal proposal);
	public ProposalDTO getProposalByID(String proposalId);
	public void deleteProposal(Proposal proposal);
}
