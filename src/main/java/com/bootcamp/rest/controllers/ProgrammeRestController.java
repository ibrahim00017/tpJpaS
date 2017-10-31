package com.bootcamp.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.jpa.entities.Programme;
import com.bootcamp.jpa.metier.ProgrammeMetier;

@RestController
@RequestMapping(value="/programmes")
public class ProgrammeRestController {

	@Autowired
	private ProgrammeMetier programmeMetier;

	@RequestMapping(value="/add",method=RequestMethod.POST)
	public Programme add(@RequestBody Programme programme) {
		return programmeMetier.add(programme);
	}

	@RequestMapping(method=RequestMethod.GET)
	public List<Programme> getAll() {
		return programmeMetier.getAll();
	}

	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Programme get(@PathVariable Long id) {
		return programmeMetier.get(id);
	}

	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void delete(Long id) {
		programmeMetier.delete(id);
	}

	@RequestMapping(method=RequestMethod.DELETE)
	public void deleteAll() {
		programmeMetier.deleteAll();
	}
}
