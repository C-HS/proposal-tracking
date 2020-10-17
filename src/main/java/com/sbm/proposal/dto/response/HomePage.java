package com.sbm.proposal.dto.response;

import java.util.List;

import com.sbm.proposal.dto.ProposalDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HomePage {

	private long totalProposals;
	private double totalAmountRaisedByProposals;
	private double amountApproved;
	private List<ProposalDTO> proposalList;
}
