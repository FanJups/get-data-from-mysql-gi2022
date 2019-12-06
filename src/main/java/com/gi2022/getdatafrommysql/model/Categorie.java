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
@Table(name="categorie")
public class Categorie implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7400903157677555605L;

	/**
	 * 
	 */
	

	@Id
	@GeneratedValue
	@Column
	private int idCat;
	
	@Column
    private String nomCat;
	
	@OneToMany(mappedBy = "idCategorie",fetch = FetchType.LAZY)
	private List<Produit> produits = new ArrayList<>();
	
	public Categorie() {
        super();
    }
    public Categorie(String nomCat) {
        super();
        this.nomCat=nomCat;
        
    }

	public int getIdCat() {
		return idCat;
	}

	public void setIdCat(int idCat) {
		this.idCat = idCat;
	}

	public String getNomCat() {
		return nomCat;
	}

	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
	}
	
	
	
	
	/**
	 * @return the produits
	 */
	public List<Produit> getProduits() {
		return produits;
	}
	/**
	 * @param produits the produits to set
	 */
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	@Override
	public String toString() {
		return "Categorie [idCat=" + idCat + ", nomCat=" + nomCat + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(idCat, nomCat);
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
		if (!(obj instanceof Categorie)) {
			return false;
		}
		Categorie other = (Categorie) obj;
		return Objects.equals(idCat, other.idCat) && Objects.equals(nomCat, other.nomCat);
	}
	
	
	
	
	
	

}
