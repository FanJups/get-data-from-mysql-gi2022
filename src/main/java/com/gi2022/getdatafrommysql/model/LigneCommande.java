package com.gi2022.getdatafrommysql.model;

import java.io.Serializable;
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
@Table(name = "lignecommande")

public class LigneCommande implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8366061673066005152L;

	@Id
	@GeneratedValue
	@Column
	private int IDLCOMMANDE;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDCOMMANDE",referencedColumnName="IDCOMMANDE")
	private Commande IDCOMMANDE;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODEPRODUIT",referencedColumnName = "codePro")
	private Produit CODEPRODUIT;
	
	@Column
	private int QUANTITE;
	
	@Column
	private String TAILLE;
	
	@Column
	private String COULEUR;
	
	public LigneCommande()
	{
		super();
	}

	public LigneCommande(Commande IDCOMMANDE, Produit CODEPRODUIT, int QUANTITE, String TAILLE, String COULEUR) {
		this.IDCOMMANDE = IDCOMMANDE;
		this.CODEPRODUIT = CODEPRODUIT;
		this.QUANTITE = QUANTITE;
		this.TAILLE = TAILLE;
		this.COULEUR = COULEUR;
	}

	/**
	 * @return the iDLCOMMANDE
	 */
	public int getIDLCOMMANDE() {
		return IDLCOMMANDE;
	}

	/**
	 * @param iDLCOMMANDE the iDLCOMMANDE to set
	 */
	public void setIDLCOMMANDE(int iDLCOMMANDE) {
		IDLCOMMANDE = iDLCOMMANDE;
	}

	/**
	 * @return the iDCOMMANDE
	 */
	public Commande getIDCOMMANDE() {
		return IDCOMMANDE;
	}

	/**
	 * @param iDCOMMANDE the iDCOMMANDE to set
	 */
	public void setIDCOMMANDE(Commande iDCOMMANDE) {
		IDCOMMANDE = iDCOMMANDE;
	}

	/**
	 * @return the cODEPRODUIT
	 */
	public Produit getCODEPRODUIT() {
		return CODEPRODUIT;
	}

	/**
	 * @param cODEPRODUIT the cODEPRODUIT to set
	 */
	public void setCODEPRODUIT(Produit cODEPRODUIT) {
		CODEPRODUIT = cODEPRODUIT;
	}

	/**
	 * @return the qUANTITE
	 */
	public int getQUANTITE() {
		return QUANTITE;
	}

	/**
	 * @param qUANTITE the qUANTITE to set
	 */
	public void setQUANTITE(int qUANTITE) {
		QUANTITE = qUANTITE;
	}

	/**
	 * @return the tAILLE
	 */
	public String getTAILLE() {
		return TAILLE;
	}

	/**
	 * @param tAILLE the tAILLE to set
	 */
	public void setTAILLE(String tAILLE) {
		TAILLE = tAILLE;
	}

	/**
	 * @return the cOULEUR
	 */
	public String getCOULEUR() {
		return COULEUR;
	}

	/**
	 * @param cOULEUR the cOULEUR to set
	 */
	public void setCOULEUR(String cOULEUR) {
		COULEUR = cOULEUR;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LigneCommande [IDLCOMMANDE=" + IDLCOMMANDE + ", IDCOMMANDE=" + IDCOMMANDE + ", CODEPRODUIT="
				+ CODEPRODUIT + ", QUANTITE=" + QUANTITE + ", TAILLE=" + TAILLE + ", COULEUR=" + COULEUR + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(CODEPRODUIT, COULEUR, IDCOMMANDE, IDLCOMMANDE, QUANTITE, TAILLE);
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
		if (!(obj instanceof LigneCommande)) {
			return false;
		}
		LigneCommande other = (LigneCommande) obj;
		return Objects.equals(CODEPRODUIT, other.CODEPRODUIT) && Objects.equals(COULEUR, other.COULEUR)
				&& Objects.equals(IDCOMMANDE, other.IDCOMMANDE) && IDLCOMMANDE == other.IDLCOMMANDE
				&& QUANTITE == other.QUANTITE && Objects.equals(TAILLE, other.TAILLE);
	}
	
	
	
	

	
}
