package com.filerouge.poe.lyon.JPAPOE.service;

import java.util.List;

import com.filerouge.poe.lyon.JPAPOE.model.Profil;

public interface IProfilService {
	List<Profil> listeProfils();
	void ajouterProfil(Profil p);
	void modifierProfil(Profil p);
	void supprimerProfil(Profil p);
	Profil findProfil(Integer i);
	List <Profil> findAll();
	List <Profil> requetenamed(String requete);
	List <Profil> requetenamed(String requete, Object...tab);
}
