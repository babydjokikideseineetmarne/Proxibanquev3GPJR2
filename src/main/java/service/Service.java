package service;

import model.Client;

public interface Service {

	public void save(Client c);

	public void delete(Client c);

	// public Client findall(Client c);
	public Client findone(String id);
	// public Client findone (Client c); //est ce utile car methode get dans
	// webservice
	// method modifier.?
}
