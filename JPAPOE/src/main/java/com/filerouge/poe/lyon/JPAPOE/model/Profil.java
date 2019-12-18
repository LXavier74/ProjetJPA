package com.filerouge.poe.lyon.JPAPOE.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Profil")

public class Profil {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	


	@Override
	public String toString() {
		return "Profil [id=" + id + ", name=" + name + ", listeUsers="  + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="name", length = 50, nullable = false)
	private String name;
	



}
