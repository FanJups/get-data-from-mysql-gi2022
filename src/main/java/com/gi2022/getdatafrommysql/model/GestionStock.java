package com.gi2022.getdatafrommysql.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "GESTIONSTOCK")
public class GestionStock implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(columnDefinition = "int(10) unsigned")
	private Integer idStock;
	
	
	@Column(columnDefinition = "int(10) unsigned NOT NULL")
	private Integer qte;
	
	@Column(columnDefinition = "datetime NOT NULL")
	private Date dateStock;
	
	@Column(columnDefinition = "tinyint(1) NOT NULL DEFAULT 0")
	private Integer operation;
	
	@ManyToOne
    @JoinColumn(name = "idGest")
	private Gestionnaire gestionnaire;
	
	@ManyToOne
    @JoinColumn(name = "codePro")
	private Produit produit;
	
	public GestionStock()
	{
		super();
	}

	public GestionStock(Integer qte, Date dateStock, Integer operation, Gestionnaire gestionnaire, Produit produit) {
		
		this.qte = qte;
		this.dateStock = dateStock;
		this.operation = operation;
		this.gestionnaire = gestionnaire;
		this.produit = produit;
	}

	public Integer getIdStock() {
		return idStock;
	}

	public void setIdStock(Integer idStock) {
		this.idStock = idStock;
	}

	public Integer getQte() {
		return qte;
	}

	public void setQte(Integer qte) {
		this.qte = qte;
	}

	public Date getDateStock() {
		return dateStock;
	}

	public void setDateStock(Date dateStock) {
		this.dateStock = dateStock;
	}

	public Integer getOperation() {
		return operation;
	}

	public void setOperation(Integer operation) {
		this.operation = operation;
	}

	public Gestionnaire getGestionnaire() {
		return gestionnaire;
	}

	public void setGestionnaire(Gestionnaire gestionnaire) {
		this.gestionnaire = gestionnaire;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	@Override
	public String toString() {
		return "GestionStock [idStock=" + idStock + ", qte=" + qte + ", dateStock=" + dateStock + ", operation="
				+ operation + ", gestionnaire=" + gestionnaire + ", produit=" + produit + "]";
	}
	
	
	
	

}
