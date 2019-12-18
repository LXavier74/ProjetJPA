package com.filerouge.poe.lyon.JPAPOE.DAO.impl;

import java.util.List;

import com.filerouge.poe.lyon.JPAPOE.DAO.IDevisDAO;
import com.filerouge.poe.lyon.JPAPOE.model.Client;
import com.filerouge.poe.lyon.JPAPOE.model.Devis;

public class DevisDAO extends EntityDao<Devis> implements IDevisDAO{

	public DevisDAO(Dao dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Devis> listeDevis() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterDevis(Devis d) {
		this.add(d);
		
	}

	@Override
	public void modifierDevis(Devis d) {
//		
	}

	@Override
	public void supprimerDevis(Devis d) {
		this.remove(Devis.class, d.getId());
		
	}

	@Override
	public Devis findDevis(Integer i) {
		// TODO Auto-generated method stub
		return this.find(Devis.class, i);
	}

	@Override
	public List<Devis> findAll() {
		// TODO Auto-generated method stub
		return this.findAll(Devis.class);
	}

	@Override
	public List<Devis> requetenamed(String requete) {
		// TODO Auto-generated method stub
		 return this.requeteNamed(Devis.class, requete);
	}

	@Override
	public List<Devis> requetenamed(String requete, Object... tab) {
		// TODO Auto-generated method stub
		return this.requeteNamed(Devis.class, requete, tab);
	}

}
