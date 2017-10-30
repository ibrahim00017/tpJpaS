package com.bootcamp.jpa.metier;

import java.util.List;

import com.bootcamp.jpa.entities.IndicateurPerformance;

public interface IndicateurPerformanceMetier {
	public IndicateurPerformance add(IndicateurPerformance indicateurPerformance);
	public List<IndicateurPerformance> getAll();
	public IndicateurPerformance get(Long id);
	public void delete(Long id);
	public void deleteAll();

}
