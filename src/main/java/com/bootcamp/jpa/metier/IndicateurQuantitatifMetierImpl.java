package com.bootcamp.jpa.metier;

import java.util.List;

import org.springframework.stereotype.Service;
import com.bootcamp.jpa.entities.IndicateurQuantitatif;
import com.bootcamp.jpa.repository.IndicateurQuantitatifRepository;

@Service
public class IndicateurQuantitatifMetierImpl implements IndicateurQuantitatifMetier {
	IndicateurQuantitatifRepository indicateurQuantitatifRepo;
	@Override
	public IndicateurQuantitatif add(IndicateurQuantitatif indicateurQuantitatif) {
		// TODO Auto-generated method stub
		return indicateurQuantitatifRepo.save(indicateurQuantitatif);
	}

	@Override
	public List<IndicateurQuantitatif> getAll() {
		// TODO Auto-generated method stub
		return indicateurQuantitatifRepo.findAll();
	}

	@Override
	public IndicateurQuantitatif get(Long id) {
		// TODO Auto-generated method stub
		return indicateurQuantitatifRepo.getOne(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		indicateurQuantitatifRepo.delete(id);
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		indicateurQuantitatifRepo.deleteAll();
	}
	
	

}
