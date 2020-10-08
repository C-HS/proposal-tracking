package com.sbm.proposal.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbm.proposal.dto.UlbDTO;
import com.sbm.proposal.model.Ulb;
import com.sbm.proposal.repository.UlbRepository;
import com.sbm.proposal.service.UlbService;

@Service
public class UlbServiceImpl implements UlbService {
	
	@Autowired UlbRepository ulbRepository;
	@Autowired ModelMapper modelMapper;

	@Override
	public void addUlb(Ulb ulb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UlbDTO updateUlb(Ulb ulb) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UlbDTO getUlbByID(String ulbId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUlb(Ulb ulb) {
		// TODO Auto-generated method stub
		
	}

}
