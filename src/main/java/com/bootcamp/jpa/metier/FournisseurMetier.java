package com.bootcamp.jpa.metier;

import java.util.List;

import com.bootcamp.jpa.entities.Fournisseur;

public interface FournisseurMetier {
	public Fournisseur add(Fournisseur fournisseur);
	public List<Fournisseur> getAll();
	public Fournisseur get(Long id);
	public void delete(Long id);
	public void deleteAll();

}
