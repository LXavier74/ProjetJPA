package com.filerouge.poe.lyon.JPAPOE.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="DEVIS")
@NamedQueries(
		{
			@NamedQuery(name = "Devis.findAll",
					query = "SELECT d from Devis AS d"),
			@NamedQuery(name = "Devis.findByClient",
			query = "Select d from Devis as d where d.client like ?1")
		})
public class Devis {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/**
	 * On décrit une jointure objet entre la colonne
	 * id_client et le Beans Client avec sa clé KP @ID
	 */
	@ManyToOne
	@JoinColumn(name="id_client", nullable=false)
	private Client client;
	
	@ManyToOne
	@JoinColumn(name="id_vehicule", nullable=false)
	private Vehicule vehicule;
	
	@ManyToOne
	@JoinColumn(name="id_user", nullable=false)
	private Users user;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "date_creation", nullable=false)
	private Date datecreation;
	
	@Column(name="etatdevis", nullable=true)
	private Boolean etat;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Date getDatecreation() {
		return datecreation;
	}

	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}

	public Boolean getEtat() {
		return etat;
	}

	public void setEtat(Boolean etat) {
		this.etat = etat;
	}

	@Override
	public String toString() {
		return "Devis [id=" + id + ", datecreation=" + datecreation + ", etat=" + etat + "]";
	}




}
