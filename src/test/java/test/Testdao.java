package test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import model.Client;
import model.ClientEntreprise;
import persistance.PersistDao;
import service.ServiceImpl;

/**
 * Classe permettant de tester les différentes méthodes
 * 
 * @author GP JR
 *
 */
public class Testdao {

	@Mock
	PersistDao dao;
	private ServiceImpl si;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
		si = new ServiceImpl();
		si.setDao(dao);

	}

	/**
	 * Test permettant de vérifier la Méthode find
	 * 
	 */
	@Test
	public void test_Methode_Find_Renvoi_Client() throws SQLException {
		Client c = new ClientEntreprise();

		when(dao.find(c.getId())).thenReturn(c);

		boolean result = si.findone(c.getId()).equals(c);

		assertTrue(result);

		verify(dao).find(c.getId());

	}
}
