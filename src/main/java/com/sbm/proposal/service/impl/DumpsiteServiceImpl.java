package com.sbm.proposal.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbm.proposal.dto.DumpsiteDTO;
import com.sbm.proposal.model.Dumpsite;
import com.sbm.proposal.repository.DumpsiteRepository;
import com.sbm.proposal.service.DumpsiteService;


@Service
public class DumpsiteServiceImpl implements DumpsiteService{
	
	@Autowired DumpsiteRepository dumpsiteRepository;
	@Autowired ModelMapper modelMapper;

	@Override
	public void addDumpsite(Dumpsite dumpsite) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DumpsiteDTO updateDumpsite(Dumpsite dumpsite) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DumpsiteDTO getDumpsiteByID(String dumpsiteId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDumpsite(Dumpsite dumpsite) {
		// TODO Auto-generated method stub
		
	}

}
