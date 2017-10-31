package com.bootcamp.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.jpa.entities.IndicateurQuantitatif;
import com.bootcamp.jpa.metier.IndicateurQuantitatifMetier;

@RestController
@RequestMapping(value="/indicateurQuantitatif")
public class IndicateurQuantitatifRestController {

	@Autowired
	private IndicateurQuantitatifMetier indicateurQuantitatifMetier;

	@RequestMapping(value="/add",method=RequestMethod.POST)
	public IndicateurQuantitatif add(@RequestBody IndicateurQuantitatif indicateurQuantitatif) {
		return indicateurQuantitatifMetier.add(indicateurQuantitatif);
	}

	@RequestMapping(method=RequestMethod.GET)
	public List<IndicateurQuantitatif> getAll() {
		return indicateurQuantitatifMetier.getAll();
	}

	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public IndicateurQuantitatif get(@PathVariable Long id) {
		return indicateurQuantitatifMetier.get(id);
	}

	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		indicateurQuantitatifMetier.delete(id);
	}

	@RequestMapping(method=RequestMethod.DELETE)
	public void deleteAll() {
		indicateurQuantitatifMetier.deleteAll();
	}
}
