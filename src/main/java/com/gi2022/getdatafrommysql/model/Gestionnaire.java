package com.gi2022.getdatafrommysql.model;

import java.io.Serializable;
import java.util.ArrayList;
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
@Table(name = "gestionnaire")
public class Gestionnaire implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3521543095267351985L;

	@Id
	@GeneratedValue
	@Column
	private int idGest;
	
	@Column
	private String nomGest;
	
	
	@Column
	private int typeGest;
	
	@Column(unique=true)
	private String login;
	
	
	@Column
	private String pwd;
	
	@Column
	private int actif;
	
	@OneToMany(mappedBy = "idGest",fetch = FetchType.LAZY)
	private List<Facture> factures = new ArrayList<>();
	
	@OneToMany(mappedBy = "idGest",fetch = FetchType.LAZY)
	private List<GestionStock> gestionStocks = new ArrayList<>();

	
	


	public Gestionnaire()
	{
		super();
	}


	public Gestionnaire(String nomGest, int typeGest, String login, String pwd, int actif) {
	
		this.nomGest = nomGest;
		this.typeGest = typeGest;
		this.login = login;
		this.pwd = pwd;
		this.actif = actif;
	}
	
	


	public int getIdGest() {
		return idGest;
	}


	public void setIdGest(int idGest) {
		this.idGest = idGest;
	}


	public String getNomGest() {
		return nomGest;
	}


	public void setNomGest(String nomGest) {
		this.nomGest = nomGest;
	}


	public int getTypeGest() {
		return typeGest;
	}


	public void setTypeGest(int typeGest) {
		this.typeGest = typeGest;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public int getActif() {
		return actif;
	}


	public void setActif(int actif) {
		this.actif = actif;
	}
	
	/**
	 * @return the factures
	 */
	public List<Facture> getFactures() {
		return factures;
	}


	/**
	 * @param factures the factures to set
	 */
	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}
	
	


	/**
	 * @return the gestionStocks
	 */
	public List<GestionStock> getGestionStocks() {
		return gestionStocks;
	}


	/**
	 * @param gestionStocks the gestionStocks to set
	 */
	public void setGestionStocks(List<GestionStock> gestionStocks) {
		this.gestionStocks = gestionStocks;
	}


	@Override
	public String toString() {
		return "Gestionnaire [idGest=" + idGest + ", nomGest=" + nomGest + ", typeGest=" + typeGest + ", login=" + login
				+ ", pwd=" + pwd + ", actif=" + actif + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(actif, idGest, login, nomGest, pwd, typeGest);
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
		if (!(obj instanceof Gestionnaire)) {
			return false;
		}
		Gestionnaire other = (Gestionnaire) obj;
		return Objects.equals(actif, other.actif) && Objects.equals(idGest, other.idGest)
				&& Objects.equals(login, other.login) && Objects.equals(nomGest, other.nomGest)
				&& Objects.equals(pwd, other.pwd) && Objects.equals(typeGest, other.typeGest);
	}


	
	
	
	
}
