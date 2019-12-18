package com.filerouge.poe.lyon.JPAPOE.service.impl;

import java.util.List;

import com.filerouge.poe.lyon.JPAPOE.DAO.IClientDAO;
import com.filerouge.poe.lyon.JPAPOE.DAO.IVehiculeDAO;
import com.filerouge.poe.lyon.JPAPOE.DAO.impl.ClientDAO;
import com.filerouge.poe.lyon.JPAPOE.DAO.impl.Dao;
import com.filerouge.poe.lyon.JPAPOE.DAO.impl.VehiculeDAO;
import com.filerouge.poe.lyon.JPAPOE.model.Client;
import com.filerouge.poe.lyon.JPAPOE.model.Vehicule;
import com.filerouge.poe.lyon.JPAPOE.service.IClientService;
import com.filerouge.poe.lyon.JPAPOE.service.IVehiculeService;

public class VehiculeService implements IVehiculeService {
	private IVehiculeDAO vehiculeDao;

	public VehiculeService(Dao dao) {
		super();
		this.vehiculeDao = new VehiculeDAO(dao);
	}
	
	@Override
	public List<Vehicule> listeVehicules() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterVehicule(Vehicule v) {
		this.vehiculeDao.ajouterVehicule(v);
	}

	@Override
	public void modifierVehicule(Vehicule v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerVehicule(Vehicule v) {
		this.vehiculeDao.supprimerVehicule(v);
	}

	@Override
	public Vehicule findVehicule(Integer i) {
		return this.vehiculeDao.findVehicule(i);
	}

	@Override
	public List<Vehicule> findAll() {
		// TODO Auto-generated method stub
		return this.vehiculeDao.findAll();
	}
	

}
