package com.ccq.moment4u.repository;

import com.ccq.moment4u.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long>{
 
}
