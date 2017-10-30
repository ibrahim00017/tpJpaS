package com.bootcamp.jpa.metier;

import java.util.List;

import com.bootcamp.jpa.entities.Beneficiaire;

public interface BeneficiaireMetier {
	public Beneficiaire addBeneficiaire(Beneficiaire beneficiaire);
	public List<Beneficiaire> getBeneficiaires();
	public Beneficiaire get(Long id);
	public void delete(Long id);
	public void deleteAll();
}
