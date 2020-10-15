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
public class UlbDTO {
	
	private long ulbId;

	private long projectId;

	private String ulb;

	private int ulbDistanceAboveFifty;
	
	private Date dateTime;

	private String ulbStatus;

}
