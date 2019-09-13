package fr.formation.inti;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.formation.inti.entities.Departement;

public class App2 {
	public static void main(String[] args) {
	System.out.println("Running app...");
	System.out.println("Create persistence manager");
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("myApp");
	EntityManager em=emf.createEntityManager();
	Departement vienne=new Departement();
	vienne.setName("Vienne");
	System.out.println("Persist entities in a transaction ");
	
	EntityTransaction transaction =em.getTransaction();
	transaction.begin();
	em.persist(vienne);
	transaction.commit();
}
}
