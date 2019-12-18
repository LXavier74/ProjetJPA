package com.filerouge.poe.lyon.JPAPOE;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.filerouge.poe.lyon.JPAPOE.DAO.impl.Dao;
import com.filerouge.poe.lyon.JPAPOE.model.Devis;
import com.filerouge.poe.lyon.JPAPOE.model.Profil;
import com.filerouge.poe.lyon.JPAPOE.model.Users;
import com.filerouge.poe.lyon.JPAPOE.service.IClientService;
import com.filerouge.poe.lyon.JPAPOE.service.IDevisService;
import com.filerouge.poe.lyon.JPAPOE.service.IProfilService;
import com.filerouge.poe.lyon.JPAPOE.service.IUsersService;
import com.filerouge.poe.lyon.JPAPOE.service.IVehiculeService;
import com.filerouge.poe.lyon.JPAPOE.service.impl.ClientService;
import com.filerouge.poe.lyon.JPAPOE.service.impl.DevisService;
import com.filerouge.poe.lyon.JPAPOE.service.impl.ProfilService;
import com.filerouge.poe.lyon.JPAPOE.service.impl.UsersService;
import com.filerouge.poe.lyon.JPAPOE.service.impl.VehiculeService;

public class TestProfilUsers {
	private static Dao dao;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = new Dao();
		dao.init();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		dao.close();
	}
	
	@Test
	public void testProfilUsers() {
		IUsersService userService = new UsersService(dao);
		IProfilService profilService = new ProfilService(dao);
		Users u = new Users();
		u.setFirstName("La");
		u.setLastName("Xavier");
		u.setLogin("Xla");
		u.setPassword("ds");
		Profil p = profilService.findProfil(1);
		List<Profil> lp = new ArrayList<Profil>();
		lp.add(p);
		u.setProfils(lp);
		userService.ajouterUsers(u);
		System.out.println(u.getProfils());
		u.setProfils(profilService.listeProfils());

		
		
	}

}
