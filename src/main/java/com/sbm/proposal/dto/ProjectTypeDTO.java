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
public class ProjectTypeDTO {

	private long projectTypeId;

	private String projectTypeName;

	private Date dateTime;

	private String projectTypeStatus;
}
