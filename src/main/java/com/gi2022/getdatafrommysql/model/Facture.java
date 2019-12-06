package com.gi2022.getdatafrommysql.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "facture")
public class Facture implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5419780608176084948L;


	@Id
	@GeneratedValue
	@Column
	private int idFac;
	
	
	@Column
	private Date dateFac;
	
	
	@Column
	private double remise;
	
	@Column
	private double montant;
	
	
	@Column
	private String tel;
	
	@Column
	private int typeFac;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCaissiere",referencedColumnName = "idGest")
	private Gestionnaire idGest;
	
	
	public Facture()
	{
		super();
	}

	public Facture(Date dateFac, double remise, double montant, String tel, int typeFac, Gestionnaire idGest) {
		this.dateFac = dateFac;
		this.remise = remise;
		this.montant = montant;
		this.tel = tel;
		this.typeFac = typeFac;
		this.idGest = idGest;
	}

	/**
	 * @return the idFac
	 */
	public int getIdFac() {
		return idFac;
	}

	/**
	 * @param idFac the idFac to set
	 */
	public void setIdFac(int idFac) {
		this.idFac = idFac;
	}

	/**
	 * @return the dateFac
	 */
	public Date getDateFac() {
		return dateFac;
	}

	/**
	 * @param dateFac the dateFac to set
	 */
	public void setDateFac(Date dateFac) {
		this.dateFac = dateFac;
	}

	/**
	 * @return the remise
	 */
	public double getRemise() {
		return remise;
	}

	/**
	 * @param remise the remise to set
	 */
	public void setRemise(double remise) {
		this.remise = remise;
	}

	/**
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * @return the typeFac
	 */
	public int getTypeFac() {
		return typeFac;
	}

	/**
	 * @param typeFac the typeFac to set
	 */
	public void setTypeFac(int typeFac) {
		this.typeFac = typeFac;
	}

	/**
	 * @return the idGest
	 */
	public Gestionnaire getIdGest() {
		return idGest;
	}

	/**
	 * @param idGest the idGest to set
	 */
	public void setIdGest(Gestionnaire idGest) {
		this.idGest = idGest;
	}
	
	

	

	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Facture [idFac=" + idFac + ", dateFac=" + dateFac + ", remise=" + remise + ", montant=" + montant
				+ ", tel=" + tel + ", typeFac=" + typeFac + ", idGest=" + idGest + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(dateFac, idFac, idGest, montant, remise, tel, typeFac);
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
		if (!(obj instanceof Facture)) {
			return false;
		}
		Facture other = (Facture) obj;
		return Objects.equals(dateFac, other.dateFac) && idFac == other.idFac && Objects.equals(idGest, other.idGest)
				&& Double.doubleToLongBits(montant) == Double.doubleToLongBits(other.montant)
				&& Double.doubleToLongBits(remise) == Double.doubleToLongBits(other.remise)
				&& Objects.equals(tel, other.tel) && typeFac == other.typeFac;
	}
	
	

}