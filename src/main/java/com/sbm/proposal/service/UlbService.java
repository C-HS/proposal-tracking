package com.sbm.proposal.service;

import com.sbm.proposal.dto.UlbDTO;
import com.sbm.proposal.model.Ulb;

public interface UlbService {

	public long addUlb(Ulb ulb);
	public UlbDTO updateUlb(Ulb ulb);
	public UlbDTO getUlbByID(String ulbId);
	public void deleteUlb(Ulb ulb);
}
