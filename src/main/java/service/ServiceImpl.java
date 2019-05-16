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
	public void delete(Client c) {
		dao.delete(c);

	}

//	@Override
//	public Client findall(Client c) {
//		dao.find(c);
//		return c;
//	}

	@Override
	public Client findone(String id) {
		Client c = dao.find(id);
		return c;
	}

}
