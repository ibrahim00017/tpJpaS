package com.bootcamp.jpa.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.jpa.entities.IndicateurQualitatif;
import com.bootcamp.jpa.repository.IndicateurQualitatifRepository;
@Service
public class IndicateurQualitatifMetierImpl implements IndicateurQualitatifMetier{
	@Autowired
	IndicateurQualitatifRepository indicateurQualitatifRepo;
	@Override
	public IndicateurQualitatif add(IndicateurQualitatif indicateurQualitatif) {
		// TODO Auto-generated method stub
		return indicateurQualitatifRepo.save(indicateurQualitatif);
	}

	@Override
	public List<IndicateurQualitatif> getAll() {
		// TODO Auto-generated method stub
		return indicateurQualitatifRepo.findAll();
	}

	@Override
	public IndicateurQualitatif get(Long id) {
		// TODO Auto-generated method stub
		return indicateurQualitatifRepo.findOne(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		indicateurQualitatifRepo.delete(id);
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		indicateurQualitatifRepo.deleteAll();
	}

}
