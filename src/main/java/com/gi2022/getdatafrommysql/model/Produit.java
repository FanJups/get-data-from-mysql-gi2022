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
@Table(name = "PRODUIT")
public class Produit implements Serializable {
	
	@Id
	@Column(columnDefinition = " int(8) unsigned not null")
	private Integer codePro;
	
	@Column(columnDefinition="varchar(100) not null default 'ND'")
    private String nomPro;
	
	@Column(columnDefinition="decimal(8,0) not  null")
	private double prix;
	
	
	
	@Column(columnDefinition = " int(8) unsigned not null")
    private Integer qte;
	
	
	
	@Column(columnDefinition="varchar(100) not null default 'RAS'")
    private String description;
	
	
	@Column(columnDefinition="varchar(12) not null")
    private String codeFour;
	
	
	@Column(columnDefinition = " tinyint(1) not null default 1")
	private Integer actif;
	
	
	@ManyToOne
    @JoinColumn(name = "idCat")
	private Categorie categorie;
	
	@Column(insertable = false, updatable = false, columnDefinition="datetime DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateInsertion;
	
	public Produit() {
        super();
    }

	public Produit(String nomPro, double prix, Integer qte, String description, String codeFour,
			Integer actif, Categorie categorie, Date dateInsertion) {
		
		
		this.nomPro = nomPro;
		this.prix = prix;
		this.qte = qte;
		this.description = description;
		this.codeFour = codeFour;
		this.actif = actif;
		this.categorie = categorie;
		this.dateInsertion = dateInsertion;
	}

	public Integer getCodePro() {
		return codePro;
	}

	public void setCodePro(Integer codePro) {
		this.codePro = codePro;
	}

	public String getNomPro() {
		return nomPro;
	}

	public void setNomPro(String nomPro) {
		this.nomPro = nomPro;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Integer getQte() {
		return qte;
	}

	public void setQte(Integer qte) {
		this.qte = qte;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCodeFour() {
		return codeFour;
	}

	public void setCodeFour(String codeFour) {
		this.codeFour = codeFour;
	}

	public Integer getActif() {
		return actif;
	}

	public void setActif(Integer actif) {
		this.actif = actif;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Date getDateInsertion() {
		return dateInsertion;
	}

	public void setDateInsertion(Date dateInsertion) {
		this.dateInsertion = dateInsertion;
	}

	@Override
	public String toString() {
		return "Produit [codePro=" + codePro + ", nomPro=" + nomPro + ", prix=" + prix + ", qte=" + qte
				+ ", description=" + description + ", codeFour=" + codeFour + ", actif=" + actif + ", categorie="
				+ categorie + ", dateInsertion=" + dateInsertion + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(actif, categorie, codeFour, codePro, dateInsertion, description, nomPro, prix, qte);
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
		if (!(obj instanceof Produit)) {
			return false;
		}
		Produit other = (Produit) obj;
		return Objects.equals(actif, other.actif) && Objects.equals(categorie, other.categorie)
				&& Objects.equals(codeFour, other.codeFour) && Objects.equals(codePro, other.codePro)
				&& Objects.equals(dateInsertion, other.dateInsertion) && Objects.equals(description, other.description)
				&& Objects.equals(nomPro, other.nomPro)
				&& Double.doubleToLongBits(prix) == Double.doubleToLongBits(other.prix)
				&& Objects.equals(qte, other.qte);
	}
	
	
	
	
	
	
	
	
	
	

}
