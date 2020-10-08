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
public class ImageAndVideoDTO {
	
	private long imageVideoId;

	private long projectId;

	private long lftdId;

	private String file_url;

	private Date dateUploaded;

	private String imageVideoStatus;

}
