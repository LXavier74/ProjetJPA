package com.filerouge.poe.lyon.JPAPOE.service.impl;

import java.util.List;

import com.filerouge.poe.lyon.JPAPOE.DAO.IClientDAO;
import com.filerouge.poe.lyon.JPAPOE.DAO.IDevisDAO;
import com.filerouge.poe.lyon.JPAPOE.DAO.impl.ClientDAO;
import com.filerouge.poe.lyon.JPAPOE.DAO.impl.Dao;
import com.filerouge.poe.lyon.JPAPOE.DAO.impl.DevisDAO;
import com.filerouge.poe.lyon.JPAPOE.model.Devis;
import com.filerouge.poe.lyon.JPAPOE.service.IDevisService;

public class DevisService implements IDevisService {
	private IDevisDAO devisDao;

	
	public DevisService(Dao dao) {
	super();
	this.devisDao = new DevisDAO(dao);
}

	@Override
	public List<Devis> listeDevis() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterDevis(Devis d) {
		this.devisDao.ajouterDevis(d);
		
	}

	@Override
	public void modifierDevis(Devis d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerDevis(Devis d) {
this.devisDao.supprimerDevis(d);		
	}

	@Override
	public Devis findDevis(Integer i) {
		// TODO Auto-generated method stub
		return this.devisDao.findDevis(i);
	}

	@Override
	public List<Devis> findAll() {
		// TODO Auto-generated method stub
		return this.devisDao.findAll();
	}

	@Override
	public List<Devis> requetenamed(String requete) {
		// TODO Auto-generated method stub
		return this.devisDao.requetenamed(requete);
	}

	@Override
	public List<Devis> requetenamed(String requete, Object... tab) {
		// TODO Auto-generated method stub
		return this.devisDao.requetenamed(requete, tab);
	}

}
