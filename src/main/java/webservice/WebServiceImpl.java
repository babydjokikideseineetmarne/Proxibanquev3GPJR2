package webservice;

import javax.ws.rs.core.Response;

import model.Client;
import service.ServiceImpl;

public class WebServiceImpl implements WebService {
	ServiceImpl si = new ServiceImpl();

	@Override
	public Client getClient(String id) {

//		// verific rest
//		// Client c1 = new Client("polo", "pola");
		Client c = si.findone(id);
//				c.getId();// voir pour ajouter dans getid dans class client (Long id) à l'interrieur
//		Long longId = Long.valueOf(id);
//		// c1.getId();

		return c;
	}

	@Override
	public Response postClient(Client c) {
		si.save(c);
		return Response.ok(c).build();

	}

}
