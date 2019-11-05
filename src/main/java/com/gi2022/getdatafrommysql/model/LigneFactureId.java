package com.gi2022.getdatafrommysql.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class LigneFactureId  implements Serializable{
	
	@ManyToOne
	@JoinColumn(name = "codePro")
	private Produit produit;
	
	@ManyToOne
	@JoinColumn(name = "idFac")
	private Facture facture;
	
	public LigneFactureId()
	{
		
	}

	public LigneFactureId(Produit produit, Facture facture) {
		
		this.produit = produit;
		this.facture = facture;
	}

	/**
	 * @return the produit
	 */
	public Produit getProduit() {
		return produit;
	}

	/**
	 * @param produit the produit to set
	 */
	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	/**
	 * @return the facture
	 */
	public Facture getFacture() {
		return facture;
	}

	/**
	 * @param facture the facture to set
	 */
	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LigneFactureId [produit=" + produit + ", facture=" + facture + "]";
	}
	
	

	
	
	
	

}
