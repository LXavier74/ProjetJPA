package com.filerouge.poe.lyon.JPAPOE.DAO.impl;

import java.util.List;

import com.filerouge.poe.lyon.JPAPOE.DAO.IClientDAO;
import com.filerouge.poe.lyon.JPAPOE.DAO.IVehiculeDAO;
import com.filerouge.poe.lyon.JPAPOE.model.Client;
import com.filerouge.poe.lyon.JPAPOE.model.Vehicule;

public class VehiculeDAO extends EntityDao<Vehicule> implements IVehiculeDAO {

	public VehiculeDAO(Dao dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Vehicule> listeVehicules() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterVehicule(Vehicule v) {
		this.add(v);
	}

	@Override
	public void modifierVehicule(Vehicule v) {
		// TODO Auto-generated method stub
	}

	@Override
	public void supprimerVehicule(Vehicule v) {
		this.remove(Vehicule.class, v.getId());
		
	}

	@Override
	public Vehicule findVehicule(Integer i) {
		// TODO Auto-generated method stub
		return this.find(Vehicule.class, i);
	}

	@Override
	public List<Vehicule> findAll() {
		// TODO Auto-generated method stub
		return this.findAll(Vehicule.class);
	}

}
