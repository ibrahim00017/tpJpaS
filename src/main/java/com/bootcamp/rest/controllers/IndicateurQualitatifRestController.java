package com.bootcamp.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.jpa.entities.IndicateurQualitatif;
import com.bootcamp.jpa.metier.IndicateurQualitatifMetier;

@RestController
@RequestMapping(value="/indicateurQualitatif")
public class IndicateurQualitatifRestController {

	@Autowired
	private IndicateurQualitatifMetier indicateurQualitatifMetier;

	@RequestMapping(value="/add",method=RequestMethod.POST)
	public IndicateurQualitatif add(@RequestBody IndicateurQualitatif indicateurQualitatif) {
		return indicateurQualitatifMetier.add(indicateurQualitatif);
	}

	@RequestMapping(method=RequestMethod.GET)
	public List<IndicateurQualitatif> getAll() {
		return indicateurQualitatifMetier.getAll();
	}

	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public IndicateurQualitatif get(@PathVariable Long id) {
		return indicateurQualitatifMetier.get(id);
	}

	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		indicateurQualitatifMetier.delete(id);
	}

	@RequestMapping(method=RequestMethod.DELETE)
	public void deleteAll() {
		indicateurQualitatifMetier.deleteAll();
	}
}
