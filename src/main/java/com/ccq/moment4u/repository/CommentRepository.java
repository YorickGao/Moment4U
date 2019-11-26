package com.ccq.moment4u.repository;

import com.ccq.moment4u.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long>{
 
}
