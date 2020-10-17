package com.sbm.proposal.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sbm.proposal.model.Proposal;

@Repository
public interface ProposalRepository extends JpaRepository<Proposal, Long>  {

    @Query("select p from Proposal p where p.id IN (:ids)")
    List<Proposal> findAllProposalWithIds(@Param("ids")List<Long> ids);
	
    @Query("select p from Proposal p where p.dateReceive >= :startDate and p.dateReceive <= :endDate")
    List<Proposal> findAllProposalBetweenDates(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
    
    @Query("select p from Proposal p where p.proposalStatus=:status")
    List<Proposal> findAllProposalHavingStatus(@Param("status") String status);
    
    
    @Query("select p from Proposal p where p.dateReceive >= :startDate and p.dateReceive <= :endDate and p.proposalStatus=:status")
    List<Proposal> findAllProposalBetweenDatesHavingStatus(@Param("startDate") Date startDate, @Param("endDate") Date endDate,@Param("status") String status);

    
    @Query("select p from Proposal p where p.id IN (:ids) and p.proposalStatus=:status")
    List<Proposal> findAllProposalWithIdsHavingStatus(@Param("ids")List<Long> ids,@Param("status") String status);
    
    @Query("select p from Proposal p where p.id IN (:ids) and p.dateReceive >= :startDate and p.dateReceive <= :endDate")
    List<Proposal> findAllProposalWithIdsBetweenDates(@Param("ids")List<Long> ids,@Param("startDate") Date startDate, @Param("endDate") Date endDate);

    @Query("select p from Proposal p where p.id IN (:ids) and p.dateReceive >= :startDate and p.dateReceive <= :endDate and p.proposalStatus=:status")
    List<Proposal> findAllProposalWithIdsBetweenDatesHavingStatus(@Param("ids")List<Long> ids,@Param("startDate") Date startDate, @Param("endDate") Date endDate,@Param("status") String status);

    
}
