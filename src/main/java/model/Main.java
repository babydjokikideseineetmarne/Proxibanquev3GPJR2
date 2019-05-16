package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {

			txn.begin();

			Client c = new Client("Paul", "Dupuis");
			Client c1 = new Client("Paul", "Dupuis");
			Conseiller con = new Conseiller("DOC", "Mountain");
			Conseiller con1 = em.find(Conseiller.class, 6L);
			Client c5=em.find(Client.class, 5L);
			
			List<Client> tab = new ArrayList<Client>();
			tab.add(c);
			tab.add(c1);
			
			con.setListec(tab);
			c.setConseiller(con);
			
			c5.setConseiller(con1);
			
			
		
			em.persist(con);
			em.persist(c5);

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
