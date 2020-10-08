package com.sbm.proposal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbm.proposal.model.Ulb;

@Repository
public interface UlbRepository extends JpaRepository<Ulb, Long>{

}
