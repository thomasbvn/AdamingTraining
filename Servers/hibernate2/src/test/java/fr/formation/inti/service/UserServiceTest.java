package fr.formation.inti.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import fr.formation.inti.entities.User;

public class UserServiceTest {
	UserService service;

	@Before
	public void init() {
		service = new UserService();
	}

	@Test
	public void authenticate() {
		User u = service.authenticate("root", "123456");
		assertNotNull(u);

	}
	

}
