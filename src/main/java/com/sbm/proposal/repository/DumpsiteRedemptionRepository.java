package com.sbm.proposal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbm.proposal.model.DumpsiteRedemption;

@Repository
public interface DumpsiteRedemptionRepository extends JpaRepository<DumpsiteRedemption, Long>{

}
