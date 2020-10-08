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
@Table(name = "ImageAndVideo")
public class ImageAndVideo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "image_video_id")
	private long imageVideoId;
	
	@Column(name = "project_id")
	private long projectId;
	
	@Column(name = "lftd_id")
	private long lftdId;
	
	@Column(name = "file_url")
	private String file_url;
	
	@Column(name = "date_uploaded")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateUploaded;
	
	@Column(name = "image_video_status")
	private String imageVideoStatus;
	

}
