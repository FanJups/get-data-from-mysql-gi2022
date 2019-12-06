package com.gi2022.getdatafrommysql.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "commande")
public class Commande implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2824858411987343798L;

	@Id
	@GeneratedValue
	@Column
	private int IDCOMMANDE;
	
	@Column
	private Date DATECOMMANDE;
	
	@Column
	private double MONTANT;
	
	
	@Column
    private String NOMCLIENT;
	
	@Column
    private String TELEPHONECLIENT;
	
	@Column
    private String ADRESSECLIENT;

	@Column
    private String COMMENTAIRE;
	
	@Column
	private int LIVRE;
	
	@OneToMany(mappedBy = "IDCOMMANDE",fetch = FetchType.LAZY)
	private List<LigneCommande> ligneCommandes = new ArrayList<>();
	
	public Commande()
	{
		super();
	}

	public Commande(Date DATECOMMANDE, double MONTANT, String NOMCLIENT, String TELEPHONECLIENT, String ADRESSECLIENT,
			String COMMENTAIRE, int LIVRE) {
		
		this.DATECOMMANDE = DATECOMMANDE;
		this.MONTANT = MONTANT;
		this.NOMCLIENT = NOMCLIENT;
		this.TELEPHONECLIENT = TELEPHONECLIENT;
		this.ADRESSECLIENT = ADRESSECLIENT;
		this.COMMENTAIRE = COMMENTAIRE;
		this.LIVRE = LIVRE;
	}

	public int getIDCOMMANDE() {
		return IDCOMMANDE;
	}

	public void setIDCOMMANDE(int iDCOMMANDE) {
		IDCOMMANDE = iDCOMMANDE;
	}

	public Date getDATECOMMANDE() {
		return DATECOMMANDE;
	}

	public void setDATECOMMANDE(Date dATECOMMANDE) {
		DATECOMMANDE = dATECOMMANDE;
	}

	public double getMONTANT() {
		return MONTANT;
	}

	public void setMONTANT(double mONTANT) {
		MONTANT = mONTANT;
	}

	public String getNOMCLIENT() {
		return NOMCLIENT;
	}

	public void setNOMCLIENT(String nOMCLIENT) {
		NOMCLIENT = nOMCLIENT;
	}

	public String getTELEPHONECLIENT() {
		return TELEPHONECLIENT;
	}

	public void setTELEPHONECLIENT(String tELEPHONECLIENT) {
		TELEPHONECLIENT = tELEPHONECLIENT;
	}

	public String getADRESSECLIENT() {
		return ADRESSECLIENT;
	}

	public void setADRESSECLIENT(String aDRESSECLIENT) {
		ADRESSECLIENT = aDRESSECLIENT;
	}

	public String getCOMMENTAIRE() {
		return COMMENTAIRE;
	}

	public void setCOMMENTAIRE(String cOMMENTAIRE) {
		COMMENTAIRE = cOMMENTAIRE;
	}

	public int getLIVRE() {
		return LIVRE;
	}

	public void setLIVRE(int lIVRE) {
		LIVRE = lIVRE;
	}
	
	

	/**
	 * @return the ligneCommandes
	 */
	public List<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}

	/**
	 * @param ligneCommandes the ligneCommandes to set
	 */
	public void setLigneCommandes(List<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}

	@Override
	public String toString() {
		return "Commande [IDCOMMANDE=" + IDCOMMANDE + ", DATECOMMANDE=" + DATECOMMANDE + ", MONTANT=" + MONTANT
				+ ", NOMCLIENT=" + NOMCLIENT + ", TELEPHONECLIENT=" + TELEPHONECLIENT + ", ADRESSECLIENT="
				+ ADRESSECLIENT + ", COMMENTAIRE=" + COMMENTAIRE + ", LIVRE=" + LIVRE + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(ADRESSECLIENT, COMMENTAIRE, DATECOMMANDE, IDCOMMANDE, LIVRE, MONTANT, NOMCLIENT,
				TELEPHONECLIENT);
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
		if (!(obj instanceof Commande)) {
			return false;
		}
		Commande other = (Commande) obj;
		return Objects.equals(ADRESSECLIENT, other.ADRESSECLIENT) && Objects.equals(COMMENTAIRE, other.COMMENTAIRE)
				&& Objects.equals(DATECOMMANDE, other.DATECOMMANDE) && IDCOMMANDE == other.IDCOMMANDE
				&& LIVRE == other.LIVRE && Double.doubleToLongBits(MONTANT) == Double.doubleToLongBits(other.MONTANT)
				&& Objects.equals(NOMCLIENT, other.NOMCLIENT) && Objects.equals(TELEPHONECLIENT, other.TELEPHONECLIENT);
	}
	
	
	
	
	
}
