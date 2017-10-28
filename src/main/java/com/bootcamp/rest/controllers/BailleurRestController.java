package com.bootcamp.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.jpa.entities.Bailleur;
import com.bootcamp.jpa.metier.BailleurMetier;

@RestController
public class BailleurRestController {
	
	@Autowired
	private BailleurMetier bailleurMetier;

	@RequestMapping(value="/bailleurs",method=RequestMethod.POST)
	public Bailleur addBailleur(@RequestBody Bailleur bailleur) {
		return bailleurMetier.addBailleur(bailleur);
	}

	@RequestMapping(value="/bailleurs",method=RequestMethod.GET)
	public List<Bailleur> getBailleurs() {
		return bailleurMetier.getBailleurs();
	}
	 

}
