package com.bootcamp.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public Projet add(Projet projet) {
		return projetMetier.add(projet);
	}

	public List<Projet> getAll() {
		return projetMetier.getAll();
	}

	public Projet get(Long id) {
		return projetMetier.get(id);
	}

	public void delete(Long id) {
		projetMetier.delete(id);
	}

	public void deleteAll() {
		projetMetier.deleteAll();
	}

}
