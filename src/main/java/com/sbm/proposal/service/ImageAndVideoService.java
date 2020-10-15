package com.sbm.proposal.service;

import com.sbm.proposal.dto.ImageAndVideoDTO;
import com.sbm.proposal.model.ImageAndVideo;

public interface ImageAndVideoService {

	public long addImageAndVideo(ImageAndVideo imageAndVideo);
	public ImageAndVideoDTO updateImageAndVideo(ImageAndVideo imageAndVideo);
	public ImageAndVideoDTO getImageAndVideoByID(long imageAndVideoId);
	public void deleteImageAndVideo(ImageAndVideo imageAndVideo);
}
