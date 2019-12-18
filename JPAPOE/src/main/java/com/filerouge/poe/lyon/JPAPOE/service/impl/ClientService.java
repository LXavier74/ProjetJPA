package com.filerouge.poe.lyon.JPAPOE.service.impl;

import java.util.List;

import com.filerouge.poe.lyon.JPAPOE.DAO.IClientDAO;
import com.filerouge.poe.lyon.JPAPOE.DAO.impl.ClientDAO;
import com.filerouge.poe.lyon.JPAPOE.DAO.impl.Dao;
import com.filerouge.poe.lyon.JPAPOE.model.Client;
import com.filerouge.poe.lyon.JPAPOE.service.IClientService;

public class ClientService implements IClientService {
private IClientDAO clientDao;


	public ClientService(Dao dao) {
	super();
	this.clientDao = new ClientDAO(dao);
}

	public List<Client> listeClients() {
		// TODO Auto-generated method stub
		return null;
	}

	public void ajouterClient(Client c) {
		this.clientDao.ajouterClient(c);

	}

	public void modifierClient(Client c) {
		// TODO Auto-generated method stub
 
	}

	public void supprimerClient(Client c) {
		this.clientDao.supprimerClient(c);

	}

	public Client findClient(Integer i) {
		// TODO Auto-generated method stub
		return this.clientDao.findClient(i);
	}

	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return this.clientDao.findAll();
	}

	@Override
	public List<Client> requetenamed(String requete) {
		// TODO Auto-generated method stub
		return this.clientDao.requetenamed(requete);
	}

	@Override
	public List<Client> requetenamed(String requete, Object... tab) {
		// TODO Auto-generated method stub
		return this.clientDao.requetenamed(requete, tab);
	}



}
