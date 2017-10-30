/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Ibrahim
 */
@Entity
@Table(name = "tp_beneficiaire")
@DiscriminatorValue("BENEFICIAIRE")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Beneficiaire extends Personne {

	private static final long serialVersionUID = 1L;
    public Beneficiaire() {

    }

    public Beneficiaire(String nom) {
        super(nom);
    }
    @OneToMany
    private List<Programme> programmes = new ArrayList<Programme>();
    
     @OneToMany
     private List<Programme_has_Beneficiaire> programmeHasBeneficiaires =new ArrayList<Programme_has_Beneficiaire>();

    public List<Programme> getProgrammes() {
        return programmes;
    }

    public void setProgrammes(List<Programme> programmes) {
        this.programmes = programmes;
    }

    @OneToMany
    private List<Beneficiaire_has_Projet> beneficiaireHasProjet = new ArrayList<Beneficiaire_has_Projet>();

}
