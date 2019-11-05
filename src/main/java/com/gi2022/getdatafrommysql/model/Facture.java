package com.gi2022.getdatafrommysql.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "FACTURE")
public class Facture implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(columnDefinition = " int(10) unsigned")
	private Integer idFac;
	
	
	@Column(insertable = false, updatable = false, columnDefinition="datetime NOT NULL")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFac;
	
	
	@Column(columnDefinition="decimal(4,2) NOT NULL")
	private double remise;
	
	@Column(columnDefinition="decimal(10,2) NOT NULL")
	private double montant;
	
	
	@Column(columnDefinition="varchar(15) DEFAULT NULL")
	private String tel;
	
	@Column(columnDefinition="tinyint(1) NOT NULL DEFAULT 0")
	private Integer typeFac;
	
	@ManyToOne
    @JoinColumn(name = "idGest")
	private Gestionnaire gestionnaire;
	
	public Facture()
	{
		super();
	}

	public Facture(Date dateFac, double remise, double montant, String tel, Integer typeFac, Gestionnaire gestionnaire) {
		super();
		this.dateFac = dateFac;
		this.remise = remise;
		this.montant = montant;
		this.tel = tel;
		this.typeFac = typeFac;
		this.gestionnaire = gestionnaire;
	}

	public Integer getIdFac() {
		return idFac;
	}

	public void setIdFac(Integer idFac) {
		this.idFac = idFac;
	}

	public Date getDateFac() {
		return dateFac;
	}

	public void setDateFac(Date dateFac) {
		this.dateFac = dateFac;
	}

	public double getRemise() {
		return remise;
	}

	public void setRemise(double remise) {
		this.remise = remise;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Integer getTypeFac() {
		return typeFac;
	}

	public void setTypeFac(Integer typeFac) {
		this.typeFac = typeFac;
	}

	public Gestionnaire getIdCaissiere() {
		return gestionnaire;
	}

	public void setIdCaissiere(Gestionnaire gestionnaire) {
		this.gestionnaire = gestionnaire;
	}

	@Override
	public String toString() {
		return "Facture [idFac=" + idFac + ", dateFac=" + dateFac + ", remise=" + remise + ", montant=" + montant
				+ ", tel=" + tel + ", typeFac=" + typeFac + ", gestionnaire=" + gestionnaire + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(dateFac, gestionnaire, idFac, montant, remise, tel, typeFac);
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
		return Objects.equals(dateFac, other.dateFac) && Objects.equals(gestionnaire, other.gestionnaire)
				&& Objects.equals(idFac, other.idFac)
				&& Double.doubleToLongBits(montant) == Double.doubleToLongBits(other.montant)
				&& Double.doubleToLongBits(remise) == Double.doubleToLongBits(other.remise)
				&& Objects.equals(tel, other.tel) && Objects.equals(typeFac, other.typeFac);
	}
	
	

	
	
	
	
	
	

}
