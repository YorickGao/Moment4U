package com.ccq.moment4u.service;

import com.ccq.moment4u.domain.Vote;

public interface VoteService {

	Vote getVoteById(Long id);

	void removeVote(Long id);
}
