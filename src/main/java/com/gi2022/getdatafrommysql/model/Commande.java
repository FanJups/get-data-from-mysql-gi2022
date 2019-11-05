package com.gi2022.getdatafrommysql.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "COMMANDE")
public class Commande implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(columnDefinition = " int(10) unsigned")
	private Integer IDCOMMANDE;
	
	
	@Column(insertable = false, updatable = false, columnDefinition="timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date DATECOMMANDE;
	
	
	@Column(columnDefinition="decimal(10,2) unsigned NOT NULL")
	private double MONTANT;
	
	
	@Column(columnDefinition="varchar(50) not null")
    private String NOMCLIENT;
	
	@Column(columnDefinition="varchar(20) not null")
    private String TELEPHONECLIENT;
	
	@Column(columnDefinition="text not null")
    private String ADRESSECLIENT;

	@Column(columnDefinition="text")
    private String COMMENTAIRE;
	
	@Column(columnDefinition = "tinyint(1) unsigned DEFAULT 0")
	private Integer LIVRE;
	
	public Commande()
	{
		super();
	}

	public Commande(Date DATECOMMANDE, double MONTANT, String NOMCLIENT, String TELEPHONECLIENT, String ADRESSECLIENT,
			String COMMENTAIRE, Integer LIVRE) {
		
		this.DATECOMMANDE = DATECOMMANDE;
		this.MONTANT = MONTANT;
		this.NOMCLIENT = NOMCLIENT;
		this.TELEPHONECLIENT = TELEPHONECLIENT;
		this.ADRESSECLIENT = ADRESSECLIENT;
		this.COMMENTAIRE = COMMENTAIRE;
		this.LIVRE = LIVRE;
	}

	public Integer getIDCOMMANDE() {
		return IDCOMMANDE;
	}

	public void setIDCOMMANDE(Integer iDCOMMANDE) {
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

	public Integer getLIVRE() {
		return LIVRE;
	}

	public void setLIVRE(Integer lIVRE) {
		LIVRE = lIVRE;
	}

	@Override
	public String toString() {
		return "Commande [IDCOMMANDE=" + IDCOMMANDE + ", DATECOMMANDE=" + DATECOMMANDE + ", MONTANT=" + MONTANT
				+ ", NOMCLIENT=" + NOMCLIENT + ", TELEPHONECLIENT=" + TELEPHONECLIENT + ", ADRESSECLIENT="
				+ ADRESSECLIENT + ", COMMENTAIRE=" + COMMENTAIRE + ", LIVRE=" + LIVRE + "]";
	}
	
	
	
	
}
