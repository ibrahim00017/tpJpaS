package com.bootcamp.jpa.metier;

import java.util.List;

import com.bootcamp.jpa.entities.Bailleur;

public interface BailleurMetier {
	
	public Bailleur add(Bailleur bailleur);
	public List<Bailleur> getBailleurs();
	public Bailleur getBailleur(Long id);
	public void deleteBailleur(Long id);
	public Bailleur update(Bailleur bailleur);
	public Bailleur findByName(String name);
	public List<Bailleur> findByPays(String pays);
	//public void deleteAll();

}
