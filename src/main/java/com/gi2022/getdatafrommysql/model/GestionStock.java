package com.gi2022.getdatafrommysql.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "gestionstock")
public class GestionStock implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2722861303868826276L;


	@Id
	@GeneratedValue
	@Column
	private int idStock;
	
	
	@Column
	private int qte;
	
	@Column
	private Date dateStock;
	
	@Column
	private int operation;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idGest",referencedColumnName="idGest")
	private Gestionnaire idGest;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codePro",referencedColumnName="codePro")
	private Produit codePro;
	
	public GestionStock()
	{
		super();
	}

	public GestionStock(int qte, Date dateStock, int operation, Gestionnaire idGest, Produit codePro) {
		this.qte = qte;
		this.dateStock = dateStock;
		this.operation = operation;
		this.idGest = idGest;
		this.codePro = codePro;
	}

	/**
	 * @return the idStock
	 */
	public int getIdStock() {
		return idStock;
	}

	/**
	 * @param idStock the idStock to set
	 */
	public void setIdStock(int idStock) {
		this.idStock = idStock;
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

	/**
	 * @return the dateStock
	 */
	public Date getDateStock() {
		return dateStock;
	}

	/**
	 * @param dateStock the dateStock to set
	 */
	public void setDateStock(Date dateStock) {
		this.dateStock = dateStock;
	}

	/**
	 * @return the operation
	 */
	public int getOperation() {
		return operation;
	}

	/**
	 * @param operation the operation to set
	 */
	public void setOperation(int operation) {
		this.operation = operation;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GestionStock [idStock=" + idStock + ", qte=" + qte + ", dateStock=" + dateStock + ", operation="
				+ operation + ", idGest=" + idGest + ", codePro=" + codePro + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(codePro, dateStock, idGest, idStock, operation, qte);
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
		if (!(obj instanceof GestionStock)) {
			return false;
		}
		GestionStock other = (GestionStock) obj;
		return Objects.equals(codePro, other.codePro) && Objects.equals(dateStock, other.dateStock)
				&& Objects.equals(idGest, other.idGest) && idStock == other.idStock && operation == other.operation
				&& qte == other.qte;
	}
	
	

	
}
