package com.bootcamp.jpa.metier;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bootcamp.jpa.entities.Livrable;
import com.bootcamp.jpa.repository.LivrableRepository;

@Service
public class LivrableMetierImpl implements LivrableMetier{
	LivrableRepository livrableRepo;
	@Override
	public Livrable add(Livrable livrable) {
		// TODO Auto-generated method stub
		return livrableRepo.save(livrable);
	}

	@Override
	public List<Livrable> getAll() {
		// TODO Auto-generated method stub
		return livrableRepo.findAll();
	}

	@Override
	public Livrable get(Long id) {
		// TODO Auto-generated method stub
		return livrableRepo.findOne(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		livrableRepo.delete(id);
		
	}

}
