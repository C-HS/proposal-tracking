package com.sbm.proposal.service;

import com.sbm.proposal.dto.DumpsiteRedemptionDTO;
import com.sbm.proposal.model.DumpsiteRedemption;

public interface DumpsiteRedemptionService {

	public void addDumpsiteRedemption(DumpsiteRedemption dumpsiteRedemption);
	public DumpsiteRedemptionDTO updateDumpsiteRedemption(DumpsiteRedemption dumpsiteRedemption);
	public DumpsiteRedemptionDTO getDumpsiteRedemptionByID(long dumpsiteRedemptionId);
	public void deleteDumpsiteRedemption(DumpsiteRedemption dumpsiteRedemption);
}
