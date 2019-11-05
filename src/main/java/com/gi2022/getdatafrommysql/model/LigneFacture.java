package com.gi2022.getdatafrommysql.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LIGNEFACTURE")

public class LigneFacture implements Serializable {
	
	
	@GeneratedValue
	@Column(columnDefinition = "int(10) unsigned NOT NULL",unique=true)
	private Integer idLFac;
	
	//COMPOSITE PRIMARY KEYS
	
	@EmbeddedId
	private LigneFactureId ligneFactureId;
	
	@Column(columnDefinition = "decimal(10,2) NOT NULL")
	private double prix;
	
	@Column(columnDefinition = "smallint(4) unsigned NOT NULL")
	private Integer qte;
	
	public LigneFacture()
	{
		super();
	}

	public LigneFacture(Integer idLFac, double prix, Integer qte) {
		
		this.idLFac = idLFac;
		this.prix = prix;
		this.qte = qte;
	}

	/**
	 * @return the idLFac
	 */
	public Integer getIdLFac() {
		return idLFac;
	}

	/**
	 * @param idLFac the idLFac to set
	 */
	public void setIdLFac(Integer idLFac) {
		this.idLFac = idLFac;
	}

	/**
	 * @return the ligneFactureId
	 */
	public LigneFactureId getLigneFactureId() {
		return ligneFactureId;
	}

	/**
	 * @param ligneFactureId the ligneFactureId to set
	 */
	public void setLigneFactureId(LigneFactureId ligneFactureId) {
		this.ligneFactureId = ligneFactureId;
	}

	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}

	/**
	 * @return the qte
	 */
	public Integer getQte() {
		return qte;
	}

	/**
	 * @param qte the qte to set
	 */
	public void setQte(Integer qte) {
		this.qte = qte;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LigneFacture [idLFac=" + idLFac + ", ligneFactureId=" + ligneFactureId + ", prix=" + prix + ", qte="
				+ qte + "]";
	}
	
	
	
	

}
