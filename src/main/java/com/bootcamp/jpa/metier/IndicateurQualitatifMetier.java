package com.bootcamp.jpa.metier;

import java.util.List;

import com.bootcamp.jpa.entities.IndicateurQualitatif;

public interface IndicateurQualitatifMetier {
	public IndicateurQualitatif add(IndicateurQualitatif indicateurQualitatif);
	public List<IndicateurQualitatif> getAll();
	public IndicateurQualitatif get(Long id);
	public void delete(Long id);
	public void deleteAll();
}
