package ua.nure.kn.arutiunov.usermanagment.db;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.nure.kn.arutiunov.usermanagment.db.DaoFactory;
import ua.nure.kn.arutiunov.usermanagment.db.UserDao;

public class DaoFactoryTest {

	@Test
	public void testGetUserDao() {
		try {
			DaoFactory daoFactory = DaoFactory.getInstance();
			assertNotNull(daoFactory);
			assertNotNull("DaoFactory instance is null", daoFactory);
				
			UserDao userDao = daoFactory.getUserDao();
			assertNotNull(userDao);
			assertNotNull("UserDao instance is null", userDao);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.toString());
		}
		
	}

}