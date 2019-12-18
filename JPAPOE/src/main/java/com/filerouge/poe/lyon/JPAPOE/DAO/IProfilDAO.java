package com.filerouge.poe.lyon.JPAPOE.DAO;

import java.util.List;

import com.filerouge.poe.lyon.JPAPOE.model.Profil;


public interface IProfilDAO {
	List<Profil> listeProfils();
	void ajouterProfil(Profil p);
	void modifierProfil(Profil p);
	void supprimerProfil(Profil p);
	Profil findProfil(Integer i);
	List <Profil> findAll();
	List <Profil> requetenamed(String requete);
	List <Profil> requetenamed(String requete, Object...tab);
}
