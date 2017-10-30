package com.bootcamp.jpa.metier;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bootcamp.jpa.entities.Projet;
import com.bootcamp.jpa.repository.ProjetRepository;

@Service
public class ProjetMetierImpl implements ProjetMetier{
	ProjetRepository projetRepo;
	@Override
	public Projet add(Projet projet) {
		// TODO Auto-generated method stub
		return projetRepo.save(projet);
	}

	@Override
	public List<Projet> getAll() {
		// TODO Auto-generated method stub
		return projetRepo.findAll();
	}

	@Override
	public Projet get(Long id) {
		// TODO Auto-generated method stub
		return projetRepo.findOne(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		projetRepo.delete(id);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		projetRepo.deleteAll();
	}

}
