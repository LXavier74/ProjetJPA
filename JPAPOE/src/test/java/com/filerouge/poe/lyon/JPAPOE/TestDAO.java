package com.filerouge.poe.lyon.JPAPOE;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.filerouge.poe.lyon.JPAPOE.DAO.impl.Dao;
import com.filerouge.poe.lyon.JPAPOE.model.Client;
import com.filerouge.poe.lyon.JPAPOE.model.Vehicule;
import com.filerouge.poe.lyon.JPAPOE.service.IClientService;
import com.filerouge.poe.lyon.JPAPOE.service.IVehiculeService;
import com.filerouge.poe.lyon.JPAPOE.service.impl.ClientService;
import com.filerouge.poe.lyon.JPAPOE.service.impl.VehiculeService;

public class TestDAO {
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
	public void test() {
		IClientService clientService= new ClientService(dao);
		System.out.println(clientService.findClient(1));
	}
	
	@Test
	public void testAutre() {
		IClientService clientService= new ClientService(dao);
		System.out.println(clientService.findAll());
	}
	
	
	@Test
	public void testNamedAllClients() {
		IClientService clientService= new ClientService(dao);
	clientService.requetenamed("Client.findAll").stream().forEach(System.out::println);
	}
	
	@Test
	public void testNamedParamClient() {
		IClientService clientService= new ClientService(dao);
		clientService.requetenamed("Client.findByName","C%").stream().forEach(System.out::println);
	}
	
	@Test
	public void testAjout() {
		IClientService clientService= new ClientService(dao);
		Client c = new Client();
		c.setName("La");
		c.setFirstname("Xavier");
		c.setAdresse("440 C");
		c.setVille("Lyon");
		c.setTel("069898952");
		c.setPortable("0698975824");
		c.setCodePostal("74300");
		clientService.ajouterClient(c);
		System.out.println(clientService.findAll());
	}
	
	@Test
	public void testSuppr() {
		IClientService clientService= new ClientService(dao);
		Client c = new Client();
		c.setName("La");
		c.setFirstname("Xavier");
		c.setAdresse("440 C");
		c.setVille("Lyon");
		c.setTel("069898952");
		c.setPortable("0698975824");
		c.setCodePostal("74300");
		this.testAutre();
		clientService.supprimerClient(c);
	}
	
	@Test
	public void testTrouverVehicule() {
		IVehiculeService vehiculeService= new VehiculeService(dao);
		System.out.println(vehiculeService.findVehicule(1));
	}
	
	@Test
	public void testTousLesVehicules() {
		IVehiculeService vehiculeService= new VehiculeService(dao);
		System.out.println(vehiculeService.findAll());
	}
	@Test
	public void testAjoutVehicule() {
		IVehiculeService vehiculeService= new VehiculeService(dao);
		Vehicule v = new Vehicule();
		v.setModele("Voiture Volante");
		v.setQuantite(52);
		v.setPrixHT(990000.0F);
		v.setDateCreation(new Date());
		vehiculeService.ajouterVehicule(v);
		System.out.println(vehiculeService.findAll());
	}
	@Test
	public void testSupprVehi() {
		IVehiculeService vehiculeService= new VehiculeService(dao);
		Vehicule v = vehiculeService.findVehicule(5);
		vehiculeService.supprimerVehicule(v);
		
		this.testTousLesVehicules();

	}
}
