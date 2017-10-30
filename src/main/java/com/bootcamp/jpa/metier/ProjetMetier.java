package com.bootcamp.jpa.metier;

import java.util.List;

import com.bootcamp.jpa.entities.Projet;

public interface ProjetMetier{
	public Projet add(Projet projet);
	public List<Projet> getAll();
	public Projet get(Long id);
	public void delete(Long id);
	public void deleteAll();

}
