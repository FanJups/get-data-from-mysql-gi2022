package com.gi2022.getdatafrommysql.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "LIGNECOMMANDE")

public class LigneCommande implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(columnDefinition = "int(10) unsigned")
	private Integer IDLCOMMANDE;
	
	@ManyToOne
    @JoinColumn(name = "IDCOMMANDE")
	private Commande commande;
	
	@ManyToOne
    @JoinColumn(name = "codePro")
	private Produit produit;
	
	@Column(columnDefinition = "int(10) unsigned NOT NULL")
	private Integer QUANTITE;
	
	@Column(columnDefinition = "varchar(30) DEFAULT ''")
	private String TAILLE;
	
	@Column(columnDefinition = "varchar(30) DEFAULT ''")
	private String COULEUR;
	
	public LigneCommande()
	{
		super();
	}

	public LigneCommande(Commande commande, Produit produit, Integer QUANTITE, String TAILLE, String COULEUR) {
		super();
		this.commande = commande;
		this.produit = produit;
		this.QUANTITE = QUANTITE;
		this.TAILLE = TAILLE;
		this.COULEUR = COULEUR;
	}

	public Integer getIDLCOMMANDE() {
		return IDLCOMMANDE;
	}

	public void setIDLCOMMANDE(Integer iDLCOMMANDE) {
		IDLCOMMANDE = iDLCOMMANDE;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Integer getQUANTITE() {
		return QUANTITE;
	}

	public void setQUANTITE(Integer qUANTITE) {
		QUANTITE = qUANTITE;
	}

	public String getTAILLE() {
		return TAILLE;
	}

	public void setTAILLE(String tAILLE) {
		TAILLE = tAILLE;
	}

	public String getCOULEUR() {
		return COULEUR;
	}

	public void setCOULEUR(String cOULEUR) {
		COULEUR = cOULEUR;
	}

	@Override
	public String toString() {
		return "LigneCommande [IDLCOMMANDE=" + IDLCOMMANDE + ", commande=" + commande + ", produit=" + produit
				+ ", QUANTITE=" + QUANTITE + ", TAILLE=" + TAILLE + ", COULEUR=" + COULEUR + "]";
	}
	
	
	
	
	

}
