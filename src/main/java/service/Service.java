package service;

import model.Client;

public interface Service {

	public void save(Client c);

	public void delete(Long id);

	public Client findone(Long id);

	public void updateService (Client c);
	
	
	// public Client findall(Client c);
	// public Client findone (Client c); //est ce utile car methode get dans
	// webservice
	// method modifier.?
}
