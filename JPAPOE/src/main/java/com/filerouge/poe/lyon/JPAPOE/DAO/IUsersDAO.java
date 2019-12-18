package com.filerouge.poe.lyon.JPAPOE.DAO;

import java.util.List;

import com.filerouge.poe.lyon.JPAPOE.model.Users;


public interface IUsersDAO {
	List <Users> listeUsers();
	void ajouterUsers(Users u);
	void modifierUsers(Users u);
	void supprimerUsers(Users u);
	Users findUsers(Integer i);
	List <Users> findAll();
	List <Users> requetenamed(String requete);
	List <Users> requetenamed(String requete, Object...tab);

}
