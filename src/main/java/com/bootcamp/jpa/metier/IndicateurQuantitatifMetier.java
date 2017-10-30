package com.bootcamp.jpa.metier;

import java.util.List;

import com.bootcamp.jpa.entities.IndicateurQuantitatif;

public interface IndicateurQuantitatifMetier {
	public IndicateurQuantitatif add(IndicateurQuantitatif indicateurQuantitatif);
	public List<IndicateurQuantitatif> getAll();
	public IndicateurQuantitatif get(Long id);
	public void delete(Long id);
	public void deleteAll();

}
