package com.filerouge.poe.lyon.JPAPOE.DAO.impl;

import java.util.List;

import com.filerouge.poe.lyon.JPAPOE.DAO.IProfilDAO;
import com.filerouge.poe.lyon.JPAPOE.model.Profil;

public class ProfilDAO extends EntityDao<Profil> implements IProfilDAO
 {

	public ProfilDAO(Dao dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Profil> listeProfils() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterProfil(Profil p) {
		this.add(p);
		
	}

	@Override
	public void modifierProfil(Profil p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerProfil(Profil p) {
		this.remove(Profil.class, p.getId());
		
	}

	@Override
	public Profil findProfil(Integer i) {
		return this.find(Profil.class,i);
	}

	@Override
	public List<Profil> findAll() {
		// TODO Auto-generated method stub
		return this.findAll();
	}

	@Override
	public List<Profil> requetenamed(String requete) {
		// TODO Auto-generated method stub
		return this.requeteNamed(Profil.class, requete);
	}

	@Override
	public List<Profil> requetenamed(String requete, Object... tab) {
		return this.requeteNamed(Profil.class, requete,tab);
	}

}
