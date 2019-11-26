package com.ccq.moment4u.service;

import com.ccq.moment4u.domain.Comment;

public interface CommentService {

	Comment getCommentById(Long id);

	void removeComment(Long id);
}
