package com.bootcamp.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.bootcamp.TpJpaSApplication;
import com.bootcamp.jpa.entities.Bailleur;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= TpJpaSApplication.class, webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)

public class BailleurTest {
	@LocalServerPort
	private int port=8080;

	TestRestTemplate restTemplate = new TestRestTemplate();

	HttpHeaders headers = new HttpHeaders();
	//private Client client = ClientBuilder.newClient();

	public void addBailleur() {
		Bailleur bailleur = new Bailleur();
		List<Bailleur> bailleurs= new ArrayList<Bailleur>();
		String[] noms= {"abladon","ibrahim","gerauld","faroud","mariam","barriath",
				"bachiroudine","fatai","mansour"};
		String[] pays= {"Algerie","Afganistan","Allmangne","Belgique","Benin","Burkina-Faso",
				"Canada","Malie","France","Londre","Togo","Ghana","Niger","Nigeria"};
		for(String name:noms) {
			bailleur.setNom(name);
			int rand = ThreadLocalRandom.current().nextInt(0,pays.length + 1);
			bailleur.setPays(pays[rand]);
			bailleurs.add(bailleur);
		}
		for(Bailleur bail:bailleurs) {
		HttpEntity<Bailleur> entity = new HttpEntity<Bailleur>(bail, headers);
		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("/bailleurs"),
				HttpMethod.POST, entity,String.class);
		}
//	WebTarget target = client.target("http://localhost:8080/bailleurs");
//	
//	Response response = target.request().post(Entity.json(new Bailleur("brain","Bnein")));
//	response.close();
//	client.close();
	}
	
	private String createURLWithPort(String uri) {
		return "http://localhost:" + port + uri;
	}
	
//	BailleurRepo bailleurRepo = new BailleurRepo();
//	Bailleur bailleur = new Bailleur();
//	@Autowired
//	BailleurMetier bailleurMetier;
//	@Test
//	public void add() {
//		String[] noms= {"abladon","ibrahim","gerauld","faroud","mariam","barriath",
//				"bachiroudine","fatai","mansour"};
//		String[] pays= {"Algerie","Afganistan","Allmangne","Belgique","Benin","Burkina-Faso",
//				"Canada","Malie","France","Londre","Togo","Ghana","Niger","Nigeria"};
//		for(String name:noms) {
//			bailleur.setNom(name);
//			int rand = ThreadLocalRandom.current().nextInt(0,pays.length + 1);
//			bailleur.setPays(pays[rand]);
//			bailleurMetier.add(bailleur);
//		}
//	}

}
