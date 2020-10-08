package com.sbm.proposal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbm.proposal.model.ImageAndVideo;

@Repository
public interface ImageAndVideoRepository extends JpaRepository<ImageAndVideo, Long>{

}
