package ec.edu.epn.modelo.servicios;

import javax.ejb.Local;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ec.edu.epn.modelo.Deporte;

public class GestorDeportes {
	public void crearDeporte(Deporte deporte) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("LDPQ");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(deporte);
		em.getTransaction().commit();
		em.close();
	}
}
