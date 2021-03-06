package com.sbm.proposal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbm.proposal.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{

}
