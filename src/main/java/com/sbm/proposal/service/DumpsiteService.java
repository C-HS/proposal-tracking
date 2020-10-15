package com.sbm.proposal.service;

import com.sbm.proposal.dto.DumpsiteDTO;
import com.sbm.proposal.model.Dumpsite;

public interface DumpsiteService {

	public long addDumpsite(Dumpsite dumpsite);
	public DumpsiteDTO updateDumpsite(Dumpsite dumpsite);
	public DumpsiteDTO getDumpsiteByID(String dumpsiteId);
	public void deleteDumpsite(Dumpsite dumpsite);
}
