package service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.Client;
import model.Conseiller;
import persistance.PersistDao;
import webservice.WebServiceImpl;

public class ServiceImpl implements Service {
	PersistDao dao = new PersistDao();
	private static final Logger LOGGER = LoggerFactory.getLogger(WebServiceImpl.class);

	@Override
	public void save(Client c) {
		if (c.getConseiller().getListec().size() < 10) {
			dao.save(c);
			LOGGER.info("Un client a étét créer");
		} else {
			LOGGER.info("ajout impossible, liste de client complete");
		}
	}

	@Override
	public void delete(Long id) {
		LOGGER.info("Un client a  été supprimé");
		dao.delete(id);

	}

	@Override
	public Client findone(Long id) {
		LOGGER.info("Recherche de client en cours");
		Client c = dao.find(id);
		return c;
	}

	@Override
	public void updateService(Client c) {
		LOGGER.info("Vous avez lancer la modification d'un client");
		dao.update(c);

	}

	@Override
	public List<Client> findall(Conseiller cons) {
		List<Client> listeall = dao.findall(cons);
		return listeall;
	}

	@Override
	public void virement(Client c1, Client c2, double i) {
		dao.virement(c1, c2, i);
	}

	public PersistDao getDao() {
		return dao;
	}

	public void setDao(PersistDao dao) {
		this.dao = dao;
	}

}
