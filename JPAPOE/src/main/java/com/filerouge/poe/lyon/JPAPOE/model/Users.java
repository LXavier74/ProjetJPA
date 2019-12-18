package com.filerouge.poe.lyon.JPAPOE.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
@NamedQueries(
		{
			@NamedQuery(name = "Users.findAll",
					query = "SELECT u from Devis AS u"),
		})
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="FIRSTNAME", nullable=false, length=50)
	private String firstName;
	
	@Column(name="LASTNAME", nullable=false, length=50)
	private String lastName;
	
	@Column(name="LOGIN", nullable=false, length=15)
	private String login;
	
	@Column(name="PWD", nullable=false, length=10)
	private String password;

	@ManyToMany
	@JoinTable(
			name = "PROFIL_USER",
			joinColumns = {@JoinColumn(name = "ID_USER") },
			inverseJoinColumns = {@JoinColumn(name = "ID_PROFIL") }
			)
			List<Profil> profils;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", login=" + login
				+ ", password=" + password + ", profils=" + profils + "]";
	}

	public List<Profil> getProfils() {
		return profils;
	}

	public void setProfils(List<Profil> profils) {
		this.profils = profils;
	}


	
	
	
	
}
