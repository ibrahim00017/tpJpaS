package com.bootcamp.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.jpa.entities.Beneficiaire;

public interface BeneficiaireRepository extends JpaRepository<Beneficiaire,Long> {

}
