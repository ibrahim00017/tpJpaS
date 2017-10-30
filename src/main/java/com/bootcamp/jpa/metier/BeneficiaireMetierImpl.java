package com.bootcamp.jpa.metier;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bootcamp.jpa.entities.Beneficiaire;
import com.bootcamp.jpa.repository.BeneficiaireRepository;

@Service
public class BeneficiaireMetierImpl implements BeneficiaireMetier{
	private BeneficiaireRepository beneficiaireRepository;

	@Override
	public Beneficiaire addBeneficiaire(Beneficiaire beneficiaire) {
		// TODO Auto-generated method stub
		return beneficiaireRepository.save(beneficiaire);
	}

	@Override
	public List<Beneficiaire> getBeneficiaires() {
		// TODO Auto-generated method stub
		return beneficiaireRepository.findAll();
	}

	@Override
	public Beneficiaire get(Long id) {
		// TODO Auto-generated method stub
		return beneficiaireRepository.getOne(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		beneficiaireRepository.delete(id);
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		beneficiaireRepository.deleteAll();
		
	}

}
