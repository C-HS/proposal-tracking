package com.sbm.proposal.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
@Entity
@Table(name = "Proposal")
public class Proposal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "proposal_id")
	private String proposalId;
	
	@Column(name = "date_receive")
	@Temporal(TemporalType.DATE)
	private Date dateReceive;
	
	@Column(name = "state_name")
	private String stateName;
	
	@Column(name = "total_proposal_cost")
	private double totalProposalCost;
	
	@Column(name = "total_central_share")
	private double totalCentralShare;
	
	@Column(name = "total_state_share")
	private double totalStateShare;
	
	@Column(name = "total_other_share")
	private double totalOtherShare;
	
	@Column(name = "amount_approved")
	private double amountApproved;
	
	@Column(name = "proposal_document_url")
	private String proposalDocumentURL;
	
	@Column(name = "shpc_document_url")
	private String shpcDocumentURL;
	
	@Column(name = "date_last_update")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateLastUpdate;
	
	@Column(name = "proposal_status")
	private String proposalStatus;

}
