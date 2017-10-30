package com.bootcamp.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.jpa.entities.Bailleur;
import com.bootcamp.jpa.metier.BailleurMetier;

@RestController
@RequestMapping(value="/bailleurs")
public class BailleurRestController {
	
	private BailleurMetier bailleurMetier;
	
	@Autowired
	public void setBailleurMetier(BailleurMetier bailleuMetier) {
		this.bailleurMetier = bailleuMetier;
	}

	@RequestMapping(method=RequestMethod.POST)
	public Bailleur addBailleur(@RequestBody Bailleur bailleur) {
		return bailleurMetier.addBailleur(bailleur);
	}

	@RequestMapping(method=RequestMethod.GET)
	public List<Bailleur> getBailleurs() {
		return bailleurMetier.getBailleurs();
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Bailleur getBailleur(@PathVariable Long id) {
		return bailleurMetier.getBailleur(id);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void  deleteBailleur(@PathVariable Long id) {
		
		bailleurMetier.deleteBailleur(id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public void deleteAll() {
		bailleurMetier.deleteAll();
	}
	 

}
