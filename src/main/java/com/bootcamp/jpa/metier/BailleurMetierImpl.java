package com.bootcamp.jpa.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.jpa.entities.Bailleur;
import com.bootcamp.jpa.repository.BailleurRepository;

@Service
public class BailleurMetierImpl implements BailleurMetier{

	@Autowired
	private BailleurRepository bailleurRepository;
	@Override
	public Bailleur addBailleur(Bailleur bailleur) {
		// TODO Auto-generated method stub
		return bailleurRepository.save(bailleur);
	}

	@Override
	public List<Bailleur> getBailleurs() {
		// TODO Auto-generated method stub
		return bailleurRepository.findAll();
	}

	@Override
	public Bailleur getBailleur(Long id) {
		// TODO Auto-generated method stub
		return bailleurRepository.getOne(id);
	}

	@Override
	public void deleteBailleur(Long id) {
		// TODO Auto-generated method stub
		
	 bailleurRepository.delete(id);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		bailleurRepository.deleteAll();
	}

}
