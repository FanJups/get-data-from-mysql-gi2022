package com.gi2022.getdatafrommysql.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GESTIONNAIRE")
public class Gestionnaire implements Serializable {
	
	
	@Id
	@GeneratedValue
	@Column(columnDefinition = " int(10) unsigned")
	private Integer idGest;
	
	@Column(columnDefinition = "varchar(45) NOT NULL")
	private String nomGest;
	
	
	@Column(columnDefinition = "tinyint(1) NOT NULL")
	private Integer typeGest;
	
	@Column(columnDefinition = "varchar(20) NOT NULL",unique=true)
	private String login;
	
	
	@Column(columnDefinition = "varchar(20) NOT NULL")
	private String pwd;
	
	@Column(columnDefinition = "tinyint(1) NOT NULL DEFAULT 0")
	private Integer actif;

	
	public Gestionnaire()
	{
		super();
	}


	public Gestionnaire(String nomGest, Integer typeGest, String login, String pwd, Integer actif) {
	
		this.nomGest = nomGest;
		this.typeGest = typeGest;
		this.login = login;
		this.pwd = pwd;
		this.actif = actif;
	}
	
	


	public Integer getIdGest() {
		return idGest;
	}


	public void setIdGest(Integer idGest) {
		this.idGest = idGest;
	}


	public String getNomGest() {
		return nomGest;
	}


	public void setNomGest(String nomGest) {
		this.nomGest = nomGest;
	}


	public Integer getTypeGest() {
		return typeGest;
	}


	public void setTypeGest(Integer typeGest) {
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


	public Integer getActif() {
		return actif;
	}


	public void setActif(Integer actif) {
		this.actif = actif;
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
