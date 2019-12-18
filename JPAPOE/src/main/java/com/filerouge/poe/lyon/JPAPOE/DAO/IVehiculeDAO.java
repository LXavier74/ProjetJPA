package com.filerouge.poe.lyon.JPAPOE.DAO;
import java.util.List;

import com.filerouge.poe.lyon.JPAPOE.model.Vehicule;
public interface IVehiculeDAO {

		List<Vehicule> listeVehicules();
		void ajouterVehicule(Vehicule v);
		void modifierVehicule(Vehicule v);
		void supprimerVehicule(Vehicule v);
		Vehicule findVehicule(Integer i);
		List <Vehicule> findAll();
}
