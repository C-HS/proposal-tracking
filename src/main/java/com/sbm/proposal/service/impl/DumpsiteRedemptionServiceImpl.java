package com.sbm.proposal.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbm.proposal.dto.DumpsiteRedemptionDTO;
import com.sbm.proposal.model.DumpsiteRedemption;
import com.sbm.proposal.repository.DumpsiteRedemptionRepository;
import com.sbm.proposal.service.DumpsiteRedemptionService;

@Service
public class DumpsiteRedemptionServiceImpl implements DumpsiteRedemptionService{

	@Autowired DumpsiteRedemptionRepository dumpsiteRedemptionRepository;
	@Autowired ModelMapper modelMapper;
	
	@Override
	public void addDumpsiteRedemption(DumpsiteRedemption dumpsiteRedemption) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DumpsiteRedemptionDTO updateDumpsiteRedemption(DumpsiteRedemption dumpsiteRedemption) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DumpsiteRedemptionDTO getDumpsiteRedemptionByID(long dumpsiteRedemptionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDumpsiteRedemption(DumpsiteRedemption dumpsiteRedemption) {
		// TODO Auto-generated method stub
		
	}

}
