package com.gi2022.getdatafrommysql.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;

import java.util.List;

import com.gi2022.getdatafrommysql.model.Produit;


@Repository
public class ProduitDaoImpl implements ProduitDao {
	
	@Autowired
	private SessionFactory sessionFactory;
 
	public void setSessionFactory(SessionFactory sf) { 
		this.sessionFactory = sf;
	}
	
	@Override
	public List<Produit> getAllProducts() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Produit>  productList = session.createQuery("from Produit").list();
		return productList;
	}

}
