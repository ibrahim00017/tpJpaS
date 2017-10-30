package com.bootcamp.jpa.metier;

import java.util.List;

import com.bootcamp.jpa.entities.Livrable;

public interface LivrableMetier {
	public Livrable add(Livrable livrable);
	public List<Livrable> getAll();
	public Livrable get(Long id);
	public void delete(Long id);
	

}
