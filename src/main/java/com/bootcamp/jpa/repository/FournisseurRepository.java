package com.bootcamp.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.jpa.entities.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur,Long> {

}
