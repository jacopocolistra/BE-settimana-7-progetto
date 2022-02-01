package it.business;

import java.util.List;

import it.data.Contatto;
import it.data.NumTelefono;
import jakarta.persistence.Query;
import jakarta.ejb.LocalBean;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


@Stateless
@LocalBean
public class RubricaEJB implements RubricaEJBLocal {

   @PersistenceContext(unitName="Rubrica")
	EntityManager em;
   public RubricaEJB() {
        
    }
   public void inserisci(Contatto c) {
	   em.persist(c);
	   
   }
   public Contatto getContattoById(Long id) {
	   return em.find(Contatto.class, id);
   }
   
   public void update(Contatto c) {
	  em.merge(c);
	   
	
	   
   }
   
   public void delete(Contatto c) {
	   em.merge(c);
   }
   
   
   public void getContattibySurname(String cognome) {
   	Query q = em.createNamedQuery("getProgetti.byName");
   	q.setParameter("cognome", "%" + cognome + "%");
   	List<Contatto> contatti = q.getResultList();
   	for(Contatto c : contatti ) {
   		System.out.println(c.getId() + " " + c.getCognome());
   	}
   }
   public void getContattibyNumber(Long numero) {
	   	Query q = em.createNamedQuery("getProgetti.byName");
	   	q.setParameter("numero", numero);
	   	List<Contatto> contatti = q.getResultList();
	   	for(Contatto c : contatti ) {
	   		System.out.println(c.getNumeroTelefoni());
	   	}
	   	
	}
   
   public void mostraContatti(Contatto c, NumTelefono numeri) {
	   
   }

}
