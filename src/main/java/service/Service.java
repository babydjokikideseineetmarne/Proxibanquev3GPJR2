package service;

import java.util.List;

import model.Client;
import model.Conseiller;

/**
 * L'interface Service possède la majorité des méthodes appelés contrats
 * permettant la gestion des clients aussi bien au niveau de leur informations
 * personnelles (modification, lecture) que de leur comptes bancaires.
 * 
 * @author Samirath et Gwennhaelle
 */
public interface Service {

	/**
	 * Methode pour créer un client
	 */
	public void save(Client c);

	/**
	 * Methode pour supprimer un client
	 */
	public void delete(Long id);

	/**
	 * Methode pour lire les informations d'un client
	 */
	public Client findone(Long id);

	/**
	 * Methode pour modifier un client
	 */
	public void updateService(Client c);

	/**
	 * Methode pour appeler une liste de client
	 */
	public List<Client> findall(Conseiller cons);

	/**
	 * Methode pour effectuer un virement de compte courant vers compte epargne
	 */
	public void virement(Client c1, Client c2, double i);

}