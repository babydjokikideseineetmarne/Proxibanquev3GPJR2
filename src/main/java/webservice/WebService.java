package webservice;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import model.Client;

/**
 * Interface du Webservice permettant d'acc�der � l'ensemble des m�thodes
 * 
 * @author GP JR
 *
 */
@Produces({ "application/xml" })
public interface WebService {

	
	@GET
	@Path("/clients/{id}")
	public Client getClient(@PathParam("id") String id);

	/**
	 * M�thode permetttant au Webservice de cr�er un client dans la BD.
	 * 
	 */
	@POST
	@Path("/clients/")
	public Response postClient(Client c);

	/**
	 * M�thode permetttant au Webservice de modifier un client dans la BD.
	 * 
	 */
	@PUT
	@Path("/clients/")
	public Response updateClient(Client c);

	/**
	 * M�thode permetttant au Webservice de supprimer un client dans la BD.
	 * 
	 */
	@DELETE
	@Path("/clients/{id}")
	public Response deleteClient(@PathParam("id") String id);

}
