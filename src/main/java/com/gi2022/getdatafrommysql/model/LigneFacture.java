package com.gi2022.getdatafrommysql.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Table;

@Entity
@Table(name = "lignefacture")

public class LigneFacture implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3321968772337491717L;

	@GeneratedValue
	@Column(unique=true)
	private int idLFac;
	
	//COMPOSITE PRIMARY KEYS
	
	@EmbeddedId
	private LigneFactureId ligneFactureId;
	
	@Column
	private double prix;
	
	@Column
	private int qte;
	
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
	public int getIdLFac() {
		return idLFac;
	}

	/**
	 * @param idLFac the idLFac to set
	 */
	public void setIdLFac(int idLFac) {
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
	public int getQte() {
		return qte;
	}

	/**
	 * @param qte the qte to set
	 */
	public void setQte(int qte) {
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(idLFac, ligneFactureId, prix, qte);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof LigneFacture)) {
			return false;
		}
		LigneFacture other = (LigneFacture) obj;
		return Objects.equals(idLFac, other.idLFac) && Objects.equals(ligneFactureId, other.ligneFactureId)
				&& Double.doubleToLongBits(prix) == Double.doubleToLongBits(other.prix)
				&& Objects.equals(qte, other.qte);
	}
	
	

}
