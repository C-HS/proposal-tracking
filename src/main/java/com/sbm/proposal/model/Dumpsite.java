package com.sbm.proposal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name = "Dumpsite")
public class Dumpsite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "dumpsite_id")
	private long dumpsiteId;
	
	@Column(name = "project_id")
	private long projectId;
	
	@Column(name = "dumpsite")
	private String dumpsite;
	
	@Column(name = "quantity")
	private long quantity;
	
	@Column(name = "area")
	private String area;
	
	@Column(name = "year_of_start")
	private String year_of_start;
	
	@Column(name = "height")
	private String height;
	
	@Column(name = "dumpsite_status")
	private String dumpsiteStatus;

}
