package com.sbm.proposal.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbm.proposal.dto.ImageAndVideoDTO;
import com.sbm.proposal.model.ImageAndVideo;
import com.sbm.proposal.repository.ImageAndVideoRepository;
import com.sbm.proposal.service.ImageAndVideoService;

@Service
public class ImageAndVideoServiceImpl implements ImageAndVideoService{

	@Autowired ImageAndVideoRepository imageAndVideoRepository;
	@Autowired ModelMapper modelMapper;	
	
	@Override
	public void addImageAndVideo(ImageAndVideo imageAndVideo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ImageAndVideoDTO updateImageAndVideo(ImageAndVideo imageAndVideo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImageAndVideoDTO getImageAndVideoByID(long imageAndVideoId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteImageAndVideo(ImageAndVideo imageAndVideo) {
		// TODO Auto-generated method stub
		
	}

}
