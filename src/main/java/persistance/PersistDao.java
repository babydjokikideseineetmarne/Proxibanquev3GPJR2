package persistance;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Client;
import model.CompteBancaire;
import model.Conseiller;

/**
 * 
 * Classe DAO pour persister les données.
 * 
 * @author GP JR
 *
 */
public class PersistDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

	/**
	 * Méthode permetttant de créer et sauvegarder un client dans la BD.
	 * 
	 */
	public void save(Client c) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {

			txn.begin();

			em.persist(c);

			txn.commit();
		}

		catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		}

		finally {
			if (em != null) {
				em.close();
			}
//			if (emf != null) {
//				emf.close();
//			}
		}

	}

	/**
	 * Méthode permetttant de trouver un client dans la BD.
	 * 
	 */
	public Client find(Long id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		Client c = new Client();
		try {

			txn.begin();
			c = em.find(Client.class, id);
			txn.commit();
		}

		catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		}

		finally {
			if (em != null) {
				em.close();
			}
//			if (emf != null) {
//				emf.close();
//			}
		}
		return c;

	}

	/**
	 * Méthode permetttant de retirer un client dans la BD.
	 * 
	 */
	public void delete(Long id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		Client c = new Client();
		try {

			txn.begin();

			c = em.find(Client.class, id);
			em.remove(c);

			txn.commit();
		}

		catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		}

		finally {
			if (em != null) {
				em.close();
			}
//			if (emf != null) {
//				emf.close();
//			}
		}

	}

	/**
	 * Méthode permetttant de mettre a jour/modifier un client dans la BD.
	 * 
	 */
	public void update(Client c) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		Client c1 = new Client();
		try {

			txn.begin();

			c1 = em.find(Client.class, c.getId());

			c1.setName(c.getName());
			c1.setNickname(c.getNickname());
			c1.setNumber(c.getNumber());
			c1.setPostalCode(c.getPostalCode());
			c1.setAddress(c.getAddress());
			c1.setCity(c.getCity());

			txn.commit();

		}

		catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		}

		finally {
			if (em != null) {
				em.close();
			}
//			if (emf != null) {
//				emf.close();
//			}
		}

	}

	/**
	 * Méthode permetttant de trouver la liste client d'un client dans la BD.
	 * 
	 */
	public List<Client> findall(Conseiller cons) {
		List<Client> liste = new ArrayList<>();
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			Query query = em.createQuery("SELECT element FROM Client element");
			liste = query.getResultList();
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {

			if (em != null) {
				em.close();
			}
//			if (emf != null) {
//				emf.close();
//			}

		}
		return liste;
	}

	/**
	 * Méthode permetttant de faire un virement d'un compte à un autre.
	 * 
	 */
	public void virement(Client c1, Client c2, double i) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();

			CompteBancaire cb1 = new CompteBancaire();
			CompteBancaire cb2 = new CompteBancaire();

			cb1 = em.find(CompteBancaire.class, c1.getId());
			cb2 = em.find(CompteBancaire.class, c2.getId());

			double a = cb1.getSold();
			a = a - i;
			cb1.setSold(a);

			double b = cb2.getSold();
			b = b + i;
			cb2.setSold(b);

			txn.commit();

		}

		catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		}

		finally {

			if (em != null) {
				em.close();
			}
//			if (emf != null) {
//				emf.close();
//			}

		}

	}
}
