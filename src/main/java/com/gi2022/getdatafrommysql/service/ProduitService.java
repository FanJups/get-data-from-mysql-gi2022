package com.gi2022.getdatafrommysql.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gi2022.getdatafrommysql.dao.ProduitDao;
import com.gi2022.getdatafrommysql.model.Produit;

@Service("produitService")
public class ProduitService {
	
	@Autowired
	ProduitDao produitDao;
	
	@Transactional
	public List<Produit> getAllProducts() {
		return produitDao.getAllProducts();
	}

}
