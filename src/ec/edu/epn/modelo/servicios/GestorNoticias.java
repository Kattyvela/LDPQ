package ec.edu.epn.modelo.servicios;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ec.edu.epn.modelo.Noticia;

public class GestorNoticias {
 
	public void crearLocal(Noticia noticia) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("LDPQ");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(noticia);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Noticia> buscarNoticias (String nombreBusqueda){
		List <Noticia> locales= new ArrayList<Noticia>();
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("LDPQ");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select n from Noticia as n where n.tituloNoticia like ? ",Noticia.class);
		q.setParameter(1, nombreBusqueda+"%");
		locales = q.getResultList();
		return locales;
	}
	 
}
