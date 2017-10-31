package com.bootcamp.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.jpa.entities.Projet;
import com.bootcamp.jpa.metier.ProjetMetier;

@RestController
@RequestMapping(value="/projets")
public class ProjetRestController {
	@Autowired
	private ProjetMetier projetMetier;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public Projet add(@RequestBody Projet projet) {
		return projetMetier.add(projet);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Projet> getAll() {
		return projetMetier.getAll();
	}

		@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Projet get(@PathVariable Long id) {
		return projetMetier.get(id);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		projetMetier.delete(id);
	}

	@RequestMapping(method=RequestMethod.DELETE)
	public void deleteAll() {
		projetMetier.deleteAll();
	}

}
