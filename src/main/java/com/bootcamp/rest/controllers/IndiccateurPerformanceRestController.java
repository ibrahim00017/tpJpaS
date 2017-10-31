package com.bootcamp.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.jpa.entities.IndicateurPerformance;
import com.bootcamp.jpa.metier.IndicateurPerformanceMetier;

@RestController
@RequestMapping(value="/indicateurPerformance")
public class IndiccateurPerformanceRestController {
	
	@Autowired
	private IndicateurPerformanceMetier indicateurPerformanceMetier;

	@RequestMapping(value="/add",method=RequestMethod.POST)
	public IndicateurPerformance add(@RequestBody IndicateurPerformance indicateurPerformance) {
		return indicateurPerformanceMetier.add(indicateurPerformance);
	}

	@RequestMapping(method=RequestMethod.GET)
	public List<IndicateurPerformance> getAll() {
		return indicateurPerformanceMetier.getAll();
	}

	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public IndicateurPerformance get(@PathVariable Long id) {
		return indicateurPerformanceMetier.get(id);
	}

	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void delete(Long id) {
		indicateurPerformanceMetier.delete(id);
	}

	@RequestMapping(method=RequestMethod.DELETE)
	public void deleteAll() {
		indicateurPerformanceMetier.deleteAll();
	}

}
