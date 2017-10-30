package com.bootcamp.jpa.metier;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bootcamp.jpa.entities.IndicateurPerformance;
import com.bootcamp.jpa.repository.IndicateurPerformanceRepository;

@Service
public class IndicateurPerformanceMetierImpl implements IndicateurPerformanceMetier{
	IndicateurPerformanceRepository indicateurPerformanceRepo;
	@Override
	public IndicateurPerformance add(IndicateurPerformance indicateurPerformance) {
		// TODO Auto-generated method stub
		return indicateurPerformanceRepo.save(indicateurPerformance);
	}

	@Override
	public List<IndicateurPerformance> getAll() {
		// TODO Auto-generated method stub
		return indicateurPerformanceRepo.findAll();
	}

	@Override
	public IndicateurPerformance get(Long id) {
		// TODO Auto-generated method stub
		return indicateurPerformanceRepo.getOne(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		indicateurPerformanceRepo.delete(id);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		indicateurPerformanceRepo.deleteAll();
	}

}
