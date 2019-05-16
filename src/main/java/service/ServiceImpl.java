package service;

import model.Client;
import persistance.PersistDao;

public class ServiceImpl implements Service {
	PersistDao dao = new PersistDao();

	@Override
	public void save(Client c) {

		dao.save(c);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);

	}
	
//	@Override
//	public Client findall(Client c) {
//		dao.find(c);
//		return c;
//	}

	@Override
	public Client findone(Long id) {
		Client c = dao.find(id);
		return c;
	}

	@Override
	public void updateService(Client c) {
		dao.update(c);
		
	}
	
	

}
