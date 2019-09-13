package fr.formation.inti;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.formation.inti.entities.Departement;
import fr.formation.inti.entities.Voiture;

public class App3 {
	public static void main(String[] args) {
	System.out.println("Running app...");
	System.out.println("Create persistence manager");
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("myApp");
	EntityManager em=emf.createEntityManager();
	Voiture mercedes=new Voiture();
	mercedes.setVoit_id(1);
	mercedes.setMarque("Mercedes");
	mercedes.setChevaux(421);
	mercedes.setCylindree(1991);
	mercedes.setCarburant("éthanol");
	Voiture opel=new Voiture();
	opel.setVoit_id(2);
	opel.setMarque("opel");
	opel.setChevaux(420);
	opel.setCylindree(1845);
	opel.setCarburant("éthanol");
	System.out.println("Persist entities in a transaction ");
	
	EntityTransaction transaction =em.getTransaction();
	transaction.begin();
	em.persist(mercedes);
	transaction.commit();
	}
}
