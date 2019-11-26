package com.ccq.moment4u.service;

import com.ccq.moment4u.domain.Authority;
import com.ccq.moment4u.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityServiceImpl  implements AuthorityService {
	
	@Autowired
	private AuthorityRepository authorityRepository;
	
	@Override
	public Authority getAuthorityById(Long id) {
		return authorityRepository.findById(id).orElse(null);
	}

}
