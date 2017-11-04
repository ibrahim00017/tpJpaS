package com.bootcamp.jpa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bootcamp.jpa.entities.Bailleur;

@Repository
@Transactional
public class BailleurRepo {
	@PersistenceContext
	private EntityManager em;
	public Bailleur add(Bailleur bailleur) {
		em.persist(bailleur);
		return bailleur;
	}

	public void delete(Long id) {
		Bailleur bailleur = (Bailleur)em.createQuery("from Bailleur where id =:id").setParameter("id", id).getSingleResult();
		if (em.contains(bailleur))
			em.remove(bailleur);
		else
			em.remove(em.merge(bailleur));
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Bailleur> getAll() {
		return em.createQuery("from Bailleur").getResultList();
	}
	
	public Bailleur getById(Long id) {
		return em.find(Bailleur.class, id);
	}
	
	public Bailleur findByName(String name) {
		return (Bailleur)em.createQuery(
				"from Bailleur where nom =:name")
				.setParameter("name", name)
				.getSingleResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<Bailleur> findByPays(String pays){
		return em.createQuery(
				"from Bailleur where pays =:pays")
				.setParameter("pays",pays)
				.getResultList();
	}
	
	public Bailleur update(Bailleur bailleur) {
		em.merge(bailleur);
		
		return (Bailleur)em.createQuery(
				"from Bailleur where id =:id")
				.setParameter("id",bailleur.getId())
				.getSingleResult();
	}
}
