package com.bootcamp.jpa.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.jpa.entities.Bailleur;
import com.bootcamp.jpa.repository.BailleurRepo;

@Service
public class BailleurMetierImpl implements BailleurMetier{

	@Autowired
	private BailleurRepo bailleurRepo;
	
	@Override
	public Bailleur add(Bailleur bailleur) {
		// TODO Auto-generated method stub
	
		return bailleurRepo.add(bailleur);
	}

	@Override
	public List<Bailleur> getBailleurs() {
		// TODO Auto-generated method stub
		return bailleurRepo.getAll();
	}

	@Override
	public Bailleur getBailleur(Long id) {
		// TODO Auto-generated method stub
		return bailleurRepo.getById(id);
	}

	@Override
	public void deleteBailleur(Long id) {
		// TODO Auto-generated method stub
		
	 bailleurRepo.delete(id);
	}

	@Override
	public Bailleur update(Bailleur bailleur) {
		// TODO Auto-generated method stub
		return bailleurRepo.update(bailleur);
	}

	@Override
	public Bailleur findByName(String name) {
		// TODO Auto-generated method stub
		return bailleurRepo.findByName(name);
	}

	@Override
	public List<Bailleur> findByPays(String pays) {
		// TODO Auto-generated method stub
		return bailleurRepo.findByPays(pays);
	}



}
