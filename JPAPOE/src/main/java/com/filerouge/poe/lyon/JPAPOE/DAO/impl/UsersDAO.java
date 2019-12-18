package com.filerouge.poe.lyon.JPAPOE.DAO.impl;

import java.util.List;

import com.filerouge.poe.lyon.JPAPOE.DAO.IUsersDAO;
import com.filerouge.poe.lyon.JPAPOE.model.Users;
import com.filerouge.poe.lyon.JPAPOE.model.Vehicule;

public class UsersDAO extends EntityDao<Users> implements IUsersDAO {

	public UsersDAO(Dao dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Users> listeUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterUsers(Users u) {
		this.add(u);
		
	}

	@Override
	public void modifierUsers(Users u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerUsers(Users u) {
		this.remove(Users.class, u.getId());
		
	}

	@Override
	public Users findUsers(Integer i) {
		// TODO Auto-generated method stub
		return this.find(Users.class, i);
	}

	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return this.findAll(Users.class);
	}

	@Override
	public List<Users> requetenamed(String requete) {
		// TODO Auto-generated method stub
		return this.requeteNamed(Users.class, requete);
	}

	@Override
	public List<Users> requetenamed(String requete, Object... tab) {
		return this.requeteNamed(Users.class, requete, tab);
	}

}
