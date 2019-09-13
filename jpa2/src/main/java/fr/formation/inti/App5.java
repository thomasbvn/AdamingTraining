package fr.formation.inti;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App5 {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("myApp");
	EntityManager em = emf.createEntityManager();
	EntityManager em2=emf.createEntityManager();
	EntityTransaction tx=em.getTransaction();
	tx.begin();
	em.remove(emp);
}
