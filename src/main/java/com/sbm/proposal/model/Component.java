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
@Table(name = "Component")
public class Component {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "component_id")
	private long componentId;
	
	@Column(name = "proposal_id")
	private long proposalId;
	
	@Column(name = "component_name")
	private String componentName;

	@Column(name = "project_cost")
	private double projectCost;
	
	@Column(name = "central_share")
	private double centralShare;
	
	@Column(name = "state_share")
	private double stateShare;
	
	@Column(name = "other_share")
	private double otherShare;
	
	@Column(name = "unit")
	private double unit;
	
	@Column(name = "first_installment")
	private double firstInstallment;
	
	@Column(name = "both_installment")
	private double bothInstallment;
	
	@Column(name = "action_plan_document_url")
	private String actionPlanDocumentURL;
	
	@Column(name = "shpc_document_url")
	private String shpcDocumentURL;
	
	@Column(name = "date_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateTime;
	
	@Column(name = "component_status")
	private String componentStatus;
	

}
