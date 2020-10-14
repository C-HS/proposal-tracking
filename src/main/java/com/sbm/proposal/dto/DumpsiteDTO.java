package com.sbm.proposal.dto;

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
public class DumpsiteDTO {
	
	private long dumpsiteId;
	
	private long projectId;

	private String dumpsite;

	private long quantity;

	private String area;

	private String year_of_start;

	private String height;
	
	private String dumpsiteStatus;

}
