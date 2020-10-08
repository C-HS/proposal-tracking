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
@Table(name = "DumpsiteRedemption")
public class DumpsiteRedemption {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "dumpsite_redemption_id")
	private long dumpsiteRedemptionId;
	
	@Column(name = "project_id")
	private long projectId;
	
	@Column(name = "dumpsite")
	private String dumpsite;
	
	@Column(name = "quantity")
	private long quantity;
	
	@Column(name = "area")
	private String area;
	
	@Column(name = "year_of_start")
	private String yearOfStart;
	
	@Column(name = "height")
	private String height;
	
	@Column(name = "date_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateTime;
	
	@Column(name = "dumpsite_redemption_status")
	private String dumpsiteRedemptionStatus;

}
