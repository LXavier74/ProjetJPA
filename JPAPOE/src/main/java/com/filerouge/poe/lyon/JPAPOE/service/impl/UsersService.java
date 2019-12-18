package com.filerouge.poe.lyon.JPAPOE.service.impl;

import java.util.List;

import com.filerouge.poe.lyon.JPAPOE.DAO.IUsersDAO;
import com.filerouge.poe.lyon.JPAPOE.DAO.impl.Dao;
import com.filerouge.poe.lyon.JPAPOE.DAO.impl.UsersDAO;
import com.filerouge.poe.lyon.JPAPOE.model.Users;
import com.filerouge.poe.lyon.JPAPOE.service.IUsersService;

public class UsersService implements IUsersService {
	private IUsersDAO usersDao;
	
	public UsersService(Dao dao) {
	super();
	this.usersDao = new UsersDAO(dao);
}
	
	@Override
	public List<Users> listeUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterUsers(Users u) {
		this.usersDao.ajouterUsers(u);
		
	}

	@Override
	public void modifierUsers(Users u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerUsers(Users u) {
		this.usersDao.supprimerUsers(u);
		
	}

	@Override
	public Users findUsers(Integer i) {
		// TODO Auto-generated method stub
		return this.usersDao.findUsers(i);
	}

	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return this.usersDao.findAll();
	}

	@Override
	public List<Users> requetenamed(String requete) {
		// TODO Auto-generated method stub
		return this.usersDao.requetenamed(requete);
	}

	@Override
	public List<Users> requetenamed(String requete, Object... tab) {
		// TODO Auto-generated method stub
		return this.usersDao.requetenamed(requete, tab);
	}

}
