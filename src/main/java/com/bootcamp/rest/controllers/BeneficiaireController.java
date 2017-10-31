package com.bootcamp.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.jpa.entities.Beneficiaire;
import com.bootcamp.jpa.metier.BeneficiaireMetier;

@RestController
@RequestMapping(value="/beneficiaires")
public class BeneficiaireController {
	
	private BeneficiaireMetier benMetier;
	@Autowired
	public void setBeneficiaireMetier(BeneficiaireMetier beneficiaireMetier) {
		this.benMetier = beneficiaireMetier;
	}
	

	@RequestMapping(method=RequestMethod.GET)
	public List<Beneficiaire> getAll(){
		return benMetier.getBeneficiaires();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Beneficiaire add(@RequestBody Beneficiaire beneficiaire) {
		return benMetier.addBeneficiaire(beneficiaire);
	}
	
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Beneficiaire get(@PathVariable Long id) {
		return benMetier.get(id);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		benMetier.delete(id);
	}


}
