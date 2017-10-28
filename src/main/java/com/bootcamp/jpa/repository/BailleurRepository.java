package com.bootcamp.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.jpa.entities.Bailleur;

@Repository
public interface BailleurRepository extends JpaRepository<Bailleur,Long>{

}
