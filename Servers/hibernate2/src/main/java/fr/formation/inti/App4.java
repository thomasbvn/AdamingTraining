package fr.formation.inti;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.formation.inti.dao.GenericDaoImpl;
import fr.formation.inti.entities.Role;

public class App4 {
	private static final Log log  = LogFactory.getLog(App4.class);
	public static void main(String[] args) {
		GenericDaoImpl<Role, Integer> dao = new GenericDaoImpl<Role, Integer>();
		
	}

}
