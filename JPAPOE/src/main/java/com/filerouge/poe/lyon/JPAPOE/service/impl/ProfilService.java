package com.filerouge.poe.lyon.JPAPOE.service.impl;

import java.util.List;

import com.filerouge.poe.lyon.JPAPOE.DAO.IClientDAO;
import com.filerouge.poe.lyon.JPAPOE.DAO.IProfilDAO;
import com.filerouge.poe.lyon.JPAPOE.DAO.impl.Dao;
import com.filerouge.poe.lyon.JPAPOE.DAO.impl.DevisDAO;
import com.filerouge.poe.lyon.JPAPOE.DAO.impl.ProfilDAO;
import com.filerouge.poe.lyon.JPAPOE.model.Profil;
import com.filerouge.poe.lyon.JPAPOE.service.IProfilService;

public class ProfilService implements IProfilService{
	private IProfilDAO profilDao;

	public ProfilService(Dao dao) {
	super();
	this.profilDao = new ProfilDAO(dao);
}

	@Override
	public List<Profil> listeProfils() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterProfil(Profil p) {
		this.profilDao.ajouterProfil(p);
		
	}

	@Override
	public void modifierProfil(Profil p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerProfil(Profil p) {
		this.profilDao.supprimerProfil(p);
		
	}

	@Override
	public Profil findProfil(Integer i) {
		// TODO Auto-generated method stub
		return this.profilDao.findProfil(i);
	}

	@Override
	public List<Profil> findAll() {
		// TODO Auto-generated method stub
		return this.profilDao.findAll();
	}

	@Override
	public List<Profil> requetenamed(String requete) {
		// TODO Auto-generated method stub
		return this.profilDao.requetenamed(requete);
	}

	@Override
	public List<Profil> requetenamed(String requete, Object... tab) {
		// TODO Auto-generated method stub
		return this.profilDao.requetenamed(requete, tab);
	}

}
