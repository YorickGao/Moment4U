package com.ccq.moment4u.service;

import javax.transaction.Transactional;

import com.ccq.moment4u.domain.Comment;
import com.ccq.moment4u.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;

	@Override
	@Transactional
	public void removeComment(Long id) {
		commentRepository.deleteById(id);
	}
	@Override
	public Comment getCommentById(Long id) {
		return commentRepository.findById(id).orElse(null);
	}

}
