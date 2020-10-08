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
public class ComponentDTO {

	private long componentId;

	private long proposalId;

	private String componentName;

	private double projectCost;

	private double centralShare;

	private double stateShare;

	private double otherShare;

	private double unit;

	private double firstInstallment;

	private double bothInstallment;

	private String actionPlanDocumentURL;

	private String shpcDocumentURL;

	private Date dateTime;

	private String componentStatus;
}
