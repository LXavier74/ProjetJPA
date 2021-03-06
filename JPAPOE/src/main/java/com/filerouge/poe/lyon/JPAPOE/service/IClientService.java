package com.filerouge.poe.lyon.JPAPOE.service;

import java.util.List;

import com.filerouge.poe.lyon.JPAPOE.model.Client;

public interface IClientService {
	List<Client> listeClients();
	void ajouterClient(Client c);
	void modifierClient(Client c);
	void supprimerClient(Client c);
	Client findClient(Integer i);
	List <Client> findAll();
	List <Client> requetenamed(String requete);
	List <Client> requetenamed(String requete, Object...tab);

}
