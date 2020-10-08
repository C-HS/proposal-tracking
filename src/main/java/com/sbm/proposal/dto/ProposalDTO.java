package com.sbm.proposal.dto;

import java.util.Date;

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
public class ProposalDTO {

	private long id;
	
	private String proposalId;

	private Date dateReceive;

	private String stateName;

	private double totalProposalCost;

	private double totalCentralShare;

	private double totalStateShare;

	private double totalOtherShare;

	private double amountApproved;

	private String proposalDocumentURL;

	private String shpcDocumentURL;

	private Date dateLastUpdate;

	private String proposalStatus;
}
