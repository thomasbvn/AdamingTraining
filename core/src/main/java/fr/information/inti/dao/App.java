package fr.information.inti.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import fr.formation.inti.entities.Employee;
import fr.formation.inti.utils.HibernateUtils;

public class App {
	public static void main( String[] args )
    {
        SessionFactory factory=HibernateUtils.getSessionFactory();
        Session session =factory.getCurrentSession();
        
        session.getTransaction().begin();
        System.out.println("Find Employee");
        Employee emp=session.find(Employee.class, 4);
        System.out.println(emp);
        
        session.getTransaction().commit();
        session.close();
        factory.close();
    }
}
