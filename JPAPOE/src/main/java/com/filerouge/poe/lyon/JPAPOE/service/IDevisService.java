package com.filerouge.poe.lyon.JPAPOE.service;

import java.util.List;

import com.filerouge.poe.lyon.JPAPOE.model.Devis;

public interface IDevisService {
	List<Devis> listeDevis();
	void ajouterDevis(Devis d);
	void modifierDevis(Devis d);
	void supprimerDevis(Devis d);
	Devis findDevis(Integer i);
	List <Devis> findAll();
	List <Devis> requetenamed(String requete);
	List <Devis> requetenamed(String requete, Object...tab);
}
