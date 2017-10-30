package com.bootcamp.jpa.metier;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bootcamp.jpa.entities.Fournisseur;
import com.bootcamp.jpa.repository.FournisseurRepository;

@Service
public class FournisseurMetierImpl implements FournisseurMetier{
	
	FournisseurRepository fournisseurRepo;
	@Override
	public Fournisseur add(Fournisseur fournisseur) {
		// TODO Auto-generated method stub
		return fournisseurRepo.save(fournisseur);
	}

	@Override
	public List<Fournisseur> getAll() {
		// TODO Auto-generated method stub
		return fournisseurRepo.findAll();
	}

	@Override
	public Fournisseur get(Long id) {
		// TODO Auto-generated method stub
		return fournisseurRepo.getOne(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		fournisseurRepo.delete(id);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		fournisseurRepo.deleteAll();
	}

	
}
