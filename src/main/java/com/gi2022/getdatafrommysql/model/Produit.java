package com.gi2022.getdatafrommysql.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Proxy;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDateTime;

@Entity
@Table(name = "produit")


public class Produit implements Serializable {
	
	/* https://stackoverflow.com/questions/33727017/configure-jackson-to-omit-lazy-loading-attributes-in-spring-boot/42368452 */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2856467289149890769L;

	@Id
	@Column
	private Integer codePro;
	
	@Column
    private String nomPro;
	
	@Column
	private double prix;
	
	@Column
    private Integer qte;
	
	
	@Column
    private String description;
	
	
	@Column
    private String codeFour;
	
	
	@Column
	private Integer actif;
	
	
	//@ManyToOne
	/*
	 * Thu Nov 07 13:08:19 CET 2019
There was an unexpected error (type=Internal Server Error, status=500).
No row with the given identifier exists: [com.gi2022.getdatafrommysql.model.Categorie#1500]; nested exception is javax.persistence.EntityNotFoundException: No row with the given identifier exists: [com.gi2022.getdatafrommysql.model.Categorie#1500]
	 * */
	
	
	/*
	 * Thu Nov 07 13:43:35 CET 2019
There was an unexpected error (type=Internal Server Error, status=500).
could not deserialize; nested exception is org.hibernate.type.SerializationException: could not deserialize
	 * */
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCategorie",referencedColumnName="idCat")
	private Categorie idCategorie;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date dateInsertion;
	
	@OneToMany(mappedBy = "codePro",fetch = FetchType.LAZY)
	private List<GestionStock> gestionStocks = new ArrayList<>();
	
	@OneToMany(mappedBy = "CODEPRODUIT",fetch = FetchType.LAZY)
	private List<LigneCommande> ligneCommandes = new ArrayList<>();
	
	
	@OneToOne(mappedBy = "codePro", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
  private Photo photo;
	
	public Produit() {
		
		super();
        
    }
	
	

	

	public Produit(Integer codePro, String nomPro, double prix, Integer qte, String description, String codeFour,
			Integer actif, Categorie idCategorie, Date dateInsertion) {
		this.codePro = codePro;
		this.nomPro = nomPro;
		this.prix = prix;
		this.qte = qte;
		this.description = description;
		this.codeFour = codeFour;
		this.actif = actif;
		this.idCategorie = idCategorie;
		this.dateInsertion = dateInsertion;
	}





	/**
	 * @return the codePro
	 */
	public Integer getCodePro() {
		return codePro;
	}

	/**
	 * @param codePro the codePro to set
	 */
	public void setCodePro(Integer codePro) {
		this.codePro = codePro;
	}

	/**
	 * @return the nomPro
	 */
	public String getNomPro() {
		return nomPro;
	}

	/**
	 * @param nomPro the nomPro to set
	 */
	public void setNomPro(String nomPro) {
		this.nomPro = nomPro;
	}

	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}

	/**
	 * @return the qte
	 */
	public Integer getQte() {
		return qte;
	}

	/**
	 * @param qte the qte to set
	 */
	public void setQte(Integer qte) {
		this.qte = qte;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the codeFour
	 */
	public String getCodeFour() {
		return codeFour;
	}

	/**
	 * @param codeFour the codeFour to set
	 */
	public void setCodeFour(String codeFour) {
		this.codeFour = codeFour;
	}

	/**
	 * @return the actif
	 */
	public Integer getActif() {
		return actif;
	}

	/**
	 * @param actif the actif to set
	 */
	public void setActif(Integer actif) {
		this.actif = actif;
	}

	/**
	 * @return the idCategorie
	 */
	public Categorie getIdCategorie() {
		return idCategorie;
	}

	/**
	 * @param idCategorie the idCategorie to set
	 */
	public void setIdCategorie(Categorie idCategorie) {
		this.idCategorie = idCategorie;
	}

	/**
	 * @return the dateInsertion
	 */
	public Date getDateInsertion() {
		return dateInsertion;
	}

	/**
	 * @param dateInsertion the dateInsertion to set
	 */
	public void setDateInsertion(Date dateInsertion) {
		this.dateInsertion = dateInsertion;
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
	
	



	




	/**
	 * @return the photo
	 */
	public Photo getPhoto() {
		return photo;
	}



	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(Photo photo) {
		this.photo = photo;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Produit [codePro=" + codePro + ", nomPro=" + nomPro + ", prix=" + prix + ", qte=" + qte
				+ ", description=" + description + ", codeFour=" + codeFour + ", actif=" + actif + ", idCategorie="
				+ idCategorie + ", dateInsertion=" + dateInsertion + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(actif, codeFour, codePro, dateInsertion, description, idCategorie, nomPro, prix, qte);
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
		return actif == other.actif && Objects.equals(codeFour, other.codeFour) && codePro == other.codePro
				&& Objects.equals(dateInsertion, other.dateInsertion) && Objects.equals(description, other.description)
				&& Objects.equals(idCategorie, other.idCategorie) && Objects.equals(nomPro, other.nomPro)
				&& Double.doubleToLongBits(prix) == Double.doubleToLongBits(other.prix) && qte == other.qte;
	}
	
	
	
	

	

}
