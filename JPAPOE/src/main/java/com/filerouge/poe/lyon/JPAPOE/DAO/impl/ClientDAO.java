package com.filerouge.poe.lyon.JPAPOE.DAO.impl;

import java.util.List;

import com.filerouge.poe.lyon.JPAPOE.DAO.IClientDAO;
import com.filerouge.poe.lyon.JPAPOE.model.Client;

public class ClientDAO extends EntityDao<Client> implements IClientDAO {

	
	public ClientDAO(Dao dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}

	public List<Client> listeClients() {
		// TODO Auto-generated method stub
		return null;
	}

	public void ajouterClient(Client c) {
		this.add(c);
	}

	public void modifierClient(Client c) {
		// TODO Auto-generated method stub

	}

	public void supprimerClient(Client c) {
		this.remove(Client.class, c.getId());
	}

	public Client findClient(Integer i) {
		// TODO Auto-generated method stub
		return this.find(Client.class, i);
	}
	public List <Client> findAll() {
		// TODO Auto-generated method stub
		return this.findAll(Client.class);
	}

	@Override
	public List<Client> requetenamed(String requete) {
		// TODO Auto-generated method stub
		 return this.requeteNamed(Client.class, requete);
	}

	@Override
	public List<Client> requetenamed(String requete, Object... tab) {
		// TODO Auto-generated method stub
		return this.requeteNamed(Client.class, requete, tab);
	}
}
