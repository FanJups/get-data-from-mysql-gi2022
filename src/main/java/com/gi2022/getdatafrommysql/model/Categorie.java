package com.gi2022.getdatafrommysql.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CATEGORIE")
public class Categorie implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(columnDefinition = " int(10) unsigned NOT NULL AUTO_INCREMENT")
	private Integer idCat;
	
	@Column(nullable=false, length=60)
    private String nomCat;
	
	public Categorie() {
        super();
    }
    public Categorie(String nomCat) {
        super();
        this.nomCat=nomCat;
        
    }

	public Integer getIdCat() {
		return idCat;
	}

	public void setIdCat(Integer idCat) {
		this.idCat = idCat;
	}

	public String getNomCat() {
		return nomCat;
	}

	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
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
