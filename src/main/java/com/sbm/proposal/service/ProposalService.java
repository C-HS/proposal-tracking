package com.sbm.proposal.service;

import java.util.Date;
import java.util.List;

import com.sbm.proposal.dto.ProposalDTO;
import com.sbm.proposal.dto.ProposalStatus;
import com.sbm.proposal.model.Proposal;

public interface ProposalService {

	public long addProposal(Proposal proposal);
	public List<ProposalDTO> getAllProposal();
	public String setProposalStatus(ProposalStatus proposalStatus);
	public List<ProposalDTO> search(List<Long> ids, Date startDate, Date endDate, String status);
	public List<ProposalDTO> search1(Date startDate, Date endDate);
	public ProposalDTO updateProposal(Proposal proposal);
	public ProposalDTO getProposalByID(String proposalId);
	public void deleteProposal(Proposal proposal);
}
