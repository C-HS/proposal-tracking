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
@Table(name = "ProjectType")
public class ProjectType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "project_type_id")
	private long projectTypeId;
	
	@Column(name = "project_type_name")
	private String projectTypeName;

	@Column(name = "date_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateTime;
	
	@Column(name = "project_type_status")
	private String projectTypeStatus;

}
