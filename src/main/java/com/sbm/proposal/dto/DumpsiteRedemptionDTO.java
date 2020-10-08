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
public class DumpsiteRedemptionDTO {

	private long dumpsiteRedemptionId;

	private long projectId;

	private String dumpsite;

	private long quantity;

	private String area;

	private String yearOfStart;

	private String height;

	private Date dateTime;

	private String dumpsiteRedemptionStatus;
}
