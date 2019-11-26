package com.ccq.moment4u.service;

import com.ccq.moment4u.domain.Catalog;
import com.ccq.moment4u.domain.User;

import java.util.List;

public interface CatalogService {

	Catalog saveCatalog(Catalog catalog);

	void removeCatalog(Long id);

	Catalog getCatalogById(Long id);

	List<Catalog> listCatalogs(User user);
}
