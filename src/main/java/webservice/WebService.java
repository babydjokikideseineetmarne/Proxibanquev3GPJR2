package webservice;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import model.Client;

@Produces({ "application/xml" })
public interface WebService {

	@GET
	@Path("/clients/{id}")
	public Client getClient(@PathParam("id") String id);

	@POST
	@Path("/clients/")
	public Response postClient(Client c);
	

}
