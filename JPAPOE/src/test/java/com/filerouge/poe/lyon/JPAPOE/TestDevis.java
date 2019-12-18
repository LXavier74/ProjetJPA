package com.filerouge.poe.lyon.JPAPOE;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.filerouge.poe.lyon.JPAPOE.DAO.impl.Dao;
import com.filerouge.poe.lyon.JPAPOE.model.Client;
import com.filerouge.poe.lyon.JPAPOE.model.Devis;
import com.filerouge.poe.lyon.JPAPOE.service.IClientService;
import com.filerouge.poe.lyon.JPAPOE.service.IDevisService;
import com.filerouge.poe.lyon.JPAPOE.service.IUsersService;
import com.filerouge.poe.lyon.JPAPOE.service.IVehiculeService;
import com.filerouge.poe.lyon.JPAPOE.service.impl.ClientService;
import com.filerouge.poe.lyon.JPAPOE.service.impl.DevisService;
import com.filerouge.poe.lyon.JPAPOE.service.impl.UsersService;
import com.filerouge.poe.lyon.JPAPOE.service.impl.VehiculeService;

public class TestDevis {
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
	public void testDevisFindAll() {
		IDevisService devisService = new DevisService(dao);
		devisService.requetenamed("Devis.findAll").stream().forEach(System.out::println);
	}
	
	@Test
	public void testAddDevis() {
		IDevisService devisService = new DevisService(dao);
		IUsersService userService = new UsersService(dao);
		IClientService clientService = new ClientService(dao);
		IVehiculeService vehiculeService = new VehiculeService(dao);
		Devis d = new Devis();
		d.setClient(clientService.findClient(1));
		d.setUser(userService.findUsers(1));
		d.setVehicule(vehiculeService.findVehicule(1));
		d.setDatecreation(new Date());
		d.setEtat(false);
		devisService.ajouterDevis(d);
		devisService.findDevis(1);
		devisService.requetenamed("Devis.findAll").stream().forEach(System.out::println);

	}

	@Test
	public void testDevisFindClient() {
		IClientService clientService = new ClientService(dao);
		IDevisService devisService = new DevisService(dao);
		Client c = new Client();
		c.setName("La");
		c.setFirstname("Xavier");
		c.setAdresse("440 C");
		c.setVille("Lyon");
		c.setTel("069898952");
		c.setPortable("0698975824");
		c.setCodePostal("74300");
		clientService.ajouterClient(c);
		List<Devis> ld = devisService.requetenamed("Devis.findByClient", clientService.findClient(1));
		ld.stream().forEach(System.out::println);
	}
	@Test
	public void testDevisFromClient() {
		IClientService clientService = new ClientService(dao);
		List<Devis> lc= clientService.findClient(1).getListeDevis();
		lc.stream().forEach(c->System.out.println(c.getId()+"-"+c.getDatecreation()));
	}
	
	@Test
	public void testClientByDevis() {
		IDevisService devisService = new DevisService(dao);
		IUsersService userService = new UsersService(dao);
		IClientService clientService = new ClientService(dao);
		IVehiculeService vehiculeService = new VehiculeService(dao);
		Devis d = new Devis();
		d.setClient(clientService.findClient(1));
		d.setUser(userService.findUsers(1));
		d.setVehicule(vehiculeService.findVehicule(1));
		d.setDatecreation(new Date());
		d.setEtat(false);
		devisService.ajouterDevis(d);

		System.out.println(d.getClient());
		System.out.println(d.getUser()); 
		System.out.println(d.getVehicule());
		
	}
	

	
}
