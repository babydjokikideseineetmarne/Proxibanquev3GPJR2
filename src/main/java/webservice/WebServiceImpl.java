package webservice;

import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.Client;
import service.ServiceImpl;

public class WebServiceImpl implements WebService {
	ServiceImpl si = new ServiceImpl();
	private static final Logger LOGGER = LoggerFactory.getLogger(WebServiceImpl.class);

	@Override
	public Client getClient(String id) {

		Long longId = Long.valueOf(id);
		Client c = si.findone(longId);


		return c;
	}

	@Override
	public Response postClient(Client c) {
		si.save(c);
		return Response.ok(c).build();

	}

	@Override
	public Response updateClient(Client c) {

		si.updateService(c);

		Response response = null;

		if (c != null) {
			response = Response.ok().build();
			LOGGER.info("modification OK");
		} else {
			response = Response.notModified().build();
			LOGGER.info("Erreur de modification");
		}

		return response;

	}

	@Override
	public Response deleteClient(String id) {
		Long longId = Long.valueOf(id);
		Response response = null;

		if (si.findone(longId) != null) {
			si.delete(longId);
			response = Response.ok().build();
			LOGGER.info("modification OK");
		} else {
			response = Response.notModified().build();
			LOGGER.info("Erreur de modification");
		}

		return response;
	}

}
