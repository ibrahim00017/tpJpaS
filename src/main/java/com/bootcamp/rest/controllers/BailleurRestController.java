package com.bootcamp.rest.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.jpa.entities.Bailleur;
import com.bootcamp.jpa.metier.BailleurMetier;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;




@RestController
@RequestMapping(value="/bailleurs")
@Api(value="Bailleur controller Api",produces=MediaType.APPLICATION_JSON_VALUE)
public class BailleurRestController {
	
	private BailleurMetier bailleurMetier;
	
	@Autowired
	public void setBailleurMetier(BailleurMetier bailleuMetier) {
		this.bailleurMetier = bailleuMetier;
	}

	@RequestMapping(method=RequestMethod.POST)
	@ApiOperation("Ajouter un enregistrement de bailleur ")
	//@ApiResponses(value= {@ApiResponse(code = 200,message="ok", response =Bailleur.class)})
	public ResponseEntity<Bailleur> addBailleur(@RequestBody Bailleur bailleur) {
		return ResponseEntity.ok(bailleurMetier.add(bailleur));
	}

	@RequestMapping(method=RequestMethod.GET)
	@ApiOperation("affichage de la liste de bailleurs existants ")
	public ResponseEntity<List<Bailleur>> getBailleurs(@RequestParam(value="pays",defaultValue="") String pays) {
		if(pays.isEmpty())
		return ResponseEntity.ok(bailleurMetier.getBailleurs());
		else
			return ResponseEntity.ok(bailleurMetier.findByPays(pays));
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ApiOperation("suppression d'un bailleur par son identifiant")
	public void  deleteBailleur(@PathVariable Long id) {
		
		bailleurMetier.deleteBailleur(id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	@ApiOperation("suppression d'un bailleur existant par son identifiant passe en parametre")
	public void deleteById(@RequestParam(value="id",required=true) Long id) {
		
		bailleurMetier.deleteBailleur(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	@ApiOperation("Mis a jour d'un bailleur existant ")
	public ResponseEntity<Bailleur> update(Bailleur bailleur) {
		return ResponseEntity.ok(bailleurMetier.update(bailleur));
				
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	@ApiOperation("recherche un bailleur par son identifaint passe en parametre ")
	public ResponseEntity<Bailleur> findById(@PathVariable Long id){
		
			return ResponseEntity.ok(bailleurMetier.getBailleur(id));		
	}
	
	@RequestMapping(params="nom",method=RequestMethod.GET)
	@ApiOperation("recherche un bailleur par suivant son nom, passe en parametre ")
	public ResponseEntity<Bailleur> findByName(@RequestParam(value= "nom",required=false) String name){
		
			return ResponseEntity.ok(bailleurMetier.findByName(name));		
	}
	
//	@RequestMapping(params="fields",method=RequestMethod.GET)
//		public ResponseEntity<Collection<Bailleur>> getBailleursByFields(@RequestParam(value="nom") String nom,
//				@RequestParam(value="pays") String pays){
//		
//		
//	}
			
		
	
	
	/*@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody List<Bailleur> findByTypeDeBailleur(@RequestParam(value="typeDeBailleur",required=true) TypeDeBailleur typeDeBailleur){
		return bailleurMetier.findByTypeDeBailleur(typeDeBailleur);
	}*/
 

}
