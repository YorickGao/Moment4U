package com.ccq.moment4u.service;

import java.util.List;

import com.ccq.moment4u.domain.Catalog;
import com.ccq.moment4u.domain.User;
import com.ccq.moment4u.repository.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl implements CatalogService{

	@Autowired
	private CatalogRepository catalogRepository;
	
	@Override
	public Catalog saveCatalog(Catalog catalog) {

		List<Catalog> list = catalogRepository.findByUserAndName(catalog.getUser(), catalog.getName());
		if(list !=null && list.size() > 0) {
			throw new IllegalArgumentException("该分类已经存在了");
		}
		return catalogRepository.save(catalog);
	}

	@Override
	public void removeCatalog(Long id) {
		catalogRepository.deleteById(id);
	}

	@Override
	public Catalog getCatalogById(Long id) {
		return catalogRepository.findById(id).orElse(null);
	}

	@Override
	public List<Catalog> listCatalogs(User user) {
		return catalogRepository.findByUser(user);
	}

}
