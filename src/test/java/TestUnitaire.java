import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.hibernate.type.TrueFalseType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import model.Client;
import persistance.PersistDao;
import service.ServiceImpl;

import static org.mockito.Mockito.*;

public class TestUnitaire {

	
	
//	@Mock
//	PersistDao dao;
//	private ServiceImpl si;
//	
//	@BeforeEach
//	public void setup() {
//		MockitoAnnotations.initMocks(this);
//		si = new ServiceImpl();
//
//	}
//	
//	@Test
//	public void save() throws SQLException{
//		Client c = new Client("test", "test");
//
//		
//		when(si.findone(id)).thenReturn(0);
//		
//		
//		boolean result = si.findone(id)();
//		
//		assertTrue(result);
//		
//		verify(dao).save(c);
//	
//	
//	}
//}
////	@Test
////	public void save() {
////		Client c = new Client();
//		dao.save(c);
//		boolean result;
//		if (c.getId() != 0) {
//			result = true;
//		} else {
//			result = false;
//		}
//		assertTrue(result);
//		
	}

	
