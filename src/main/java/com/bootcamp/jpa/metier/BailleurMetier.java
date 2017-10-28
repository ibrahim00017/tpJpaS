package com.bootcamp.jpa.metier;

import java.util.List;

import com.bootcamp.jpa.entities.Bailleur;

public interface BailleurMetier {
	
	public Bailleur addBailleur(Bailleur bailleur);
	public List<Bailleur> getBailleurs();

}
