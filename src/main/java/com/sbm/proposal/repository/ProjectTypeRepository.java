package com.sbm.proposal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbm.proposal.model.ProjectType;

@Repository
public interface ProjectTypeRepository extends JpaRepository<ProjectType, Long> {

}
