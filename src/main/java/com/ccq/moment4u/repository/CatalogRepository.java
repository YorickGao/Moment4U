package com.ccq.moment4u.repository;

import java.util.List;

import com.ccq.moment4u.domain.Catalog;
import com.ccq.moment4u.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogRepository extends JpaRepository<Catalog, Long>{

	List<Catalog> findByUser(User user);

	List<Catalog> findByUserAndName(User user, String name);
}
