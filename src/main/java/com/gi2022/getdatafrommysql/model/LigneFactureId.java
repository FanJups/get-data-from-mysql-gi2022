package com.gi2022.getdatafrommysql.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable

public class LigneFactureId  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5434940458137093751L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codePro",referencedColumnName="codePro")
	private Produit codePro;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idFac",referencedColumnName="idFac")
	private Facture idFac;
	
	public LigneFactureId()
	{
		
	}

	public LigneFactureId(Produit codePro, Facture idFac) {
		this.codePro = codePro;
		this.idFac = idFac;
	}

	/**
	 * @return the codePro
	 */
	public Produit getCodePro() {
		return codePro;
	}

	/**
	 * @param codePro the codePro to set
	 */
	public void setCodePro(Produit codePro) {
		this.codePro = codePro;
	}

	/**
	 * @return the idFac
	 */
	public Facture getIdFac() {
		return idFac;
	}

	/**
	 * @param idFac the idFac to set
	 */
	public void setIdFac(Facture idFac) {
		this.idFac = idFac;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LigneFactureId [codePro=" + codePro + ", idFac=" + idFac + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(codePro, idFac);
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
		if (!(obj instanceof LigneFactureId)) {
			return false;
		}
		LigneFactureId other = (LigneFactureId) obj;
		return Objects.equals(codePro, other.codePro) && Objects.equals(idFac, other.idFac);
	}
	
	
	
	

	
	
	
}
