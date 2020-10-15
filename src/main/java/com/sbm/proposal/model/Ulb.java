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
@Table(name = "Ulb")
public class Ulb {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ulb_id")
	private long ulbId;
	
	@Column(name = "project_id")
	private long projectId;
	
	@Column(name = "ulb")
	private String ulb;
	
	@Column(name = "ulb_distance_above_fifty")
	private int ulbDistanceAboveFifty;
	
	
	@Column(name = "date_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateTime;
	
	@Column(name = "ulb_status")
	private String ulbStatus;
	
}
