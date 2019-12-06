package com.gi2022.getdatafrommysql.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "photo")

public class Photo  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3759672564580789230L;

	@Id
	@GeneratedValue
	@Column
	private int idPhoto;
	
	@Column
	private String lienPhoto;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codePro",referencedColumnName="codePro")
	private Produit codePro;
	
	
	
	public Photo()
	{
		super();
	}

	public Photo(String lienPhoto, Produit codePro) {
		this.lienPhoto = lienPhoto;
		this.codePro = codePro;
	}

	/**
	 * @return the idPhoto
	 */
	public int getIdPhoto() {
		return idPhoto;
	}

	/**
	 * @param idPhoto the idPhoto to set
	 */
	public void setIdPhoto(int idPhoto) {
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
		return "Photo [idPhoto=" + idPhoto + ", lienPhoto=" + lienPhoto + ", codePro=" + codePro + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(codePro, idPhoto, lienPhoto);
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
		if (!(obj instanceof Photo)) {
			return false;
		}
		Photo other = (Photo) obj;
		return Objects.equals(codePro, other.codePro) && idPhoto == other.idPhoto
				&& Objects.equals(lienPhoto, other.lienPhoto);
	}
	
	
	
	
}
	
	
	
	
	
	
	
	


