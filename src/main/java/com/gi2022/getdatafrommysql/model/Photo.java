package com.gi2022.getdatafrommysql.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Photo  implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(columnDefinition = "int(10) unsigned")
	private Integer idPhoto;
	
	@Column(columnDefinition = "varchar(150) NOT NULL")
	private String lienPhoto;
	
	@OneToOne
    @JoinColumn(name = "codePro")
	private Produit produit;
	
	public Photo()
	{
		super();
	}
	
	

	public Photo(String lienPhoto, Produit produit) {
		this.lienPhoto = lienPhoto;
		this.produit = produit;
	}



	/**
	 * @return the idPhoto
	 */
	public Integer getIdPhoto() {
		return idPhoto;
	}

	/**
	 * @param idPhoto the idPhoto to set
	 */
	public void setIdPhoto(Integer idPhoto) {
		this.idPhoto = idPhoto;
	}

	/**
	 * @return the lienPhoto
	 */
	public String getLienPhoto() {
		return lienPhoto;
	}

	/**
	 * @param lienPhoto the lienPhoto to set
	 */
	public void setLienPhoto(String lienPhoto) {
		this.lienPhoto = lienPhoto;
	}

	/**
	 * @return the produit
	 */
	public Produit getProduit() {
		return produit;
	}

	/**
	 * @param produit the produit to set
	 */
	public void setProduit(Produit produit) {
		this.produit = produit;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Photo [idPhoto=" + idPhoto + ", lienPhoto=" + lienPhoto + ", produit=" + produit + "]";
	}
	
	
	
	
	
	

}
