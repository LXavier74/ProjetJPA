package com.filerouge.poe.lyon.JPAPOE.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Vehicule")
public class Vehicule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name="modele", length = 50, nullable = false)
	private String modele;
	
	@Column(name="quantite", nullable = false)
	private Integer quantite;
	
	@Column(name="prixHT", columnDefinition="0.0")
	private Float prixHT;
	
	@Temporal(TemporalType.DATE)
	@Column(name="date_creation", nullable = false)
	private Date dateCreation;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public Float getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(Float prixHT) {
		this.prixHT = prixHT;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Vehicule [id=" + id + ", modele=" + modele + ", quantite=" + quantite + ", prixHT=" + prixHT
				+ ", dateCreation=" + dateCreation + "]";
	}


}
