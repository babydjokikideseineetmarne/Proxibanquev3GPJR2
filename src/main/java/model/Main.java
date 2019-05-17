package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import service.ServiceImpl;

/**
 * Classe permettant de seter la base de données. Elle permet également de
 * tester différentes méthodes.
 * 
 * 
 * @author Joachim Gwennhaelle
 * 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServiceImpl service = new ServiceImpl();

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {

			txn.begin();

			Client c = new ClientParticulier("Paul", "Dupont", "25 av juin", "14585", "Lyon", "05.58.46.89.47");
			Client c2 = new ClientEntreprise("placoplatre", "dubois");
			Client c3 = new ClientEntreprise("terraform", "mars", "120 après le cratère", "mars", "marsville",
					"0505050505");
			Client c4 = new ClientParticulier("Paulette", "popole", "trou perdu", "00000", "chleu", "0215657898");

			Conseiller con = new Conseiller("Paum", "Dupont");
			Conseiller con2 = new Conseiller("lola", "lol");

			CompteEpargne cb = new CompteEpargne("222", "01.10.18", 250);
			CompteCourant cb2 = new CompteCourant("111", "17.05.18", 500);

			Gerant ge = new Gerant("master", "master");

			con.setGerant(ge);

			c.setConseiller(con);
			c3.setConseiller(con2);

			cb.setClient(c);
			cb2.setClient(c2);

			service.virement(c, c2, 100);

			em.persist(con2);
			em.persist(con);

			em.persist(c);
			em.persist(c2);
			em.persist(c3);
			em.persist(c4);

			em.persist(ge);

			em.persist(cb);
			em.persist(cb2);

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
			if (emf != null) {
				emf.close();
			}
		}

	}

}
