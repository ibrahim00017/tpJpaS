package com.bootcamp.jpa.metier;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bootcamp.jpa.entities.Programme;
import com.bootcamp.jpa.repository.ProgrammeRepository;

@Service
public class ProgrammeMetierImpl implements ProgrammeMetier{
	ProgrammeRepository programmeRepo;
	@Override
	public Programme add(Programme programme) {
		// TODO Auto-generated method stub
		return programmeRepo.save(programme);
	}

	@Override
	public List<Programme> getAll() {
		// TODO Auto-generated method stub
		return programmeRepo.findAll();
	}

	@Override
	public Programme get(Long id) {
		// TODO Auto-generated method stub
		return programmeRepo.findOne(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		programmeRepo.delete(id);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		programmeRepo.deleteAll();
	}

}
