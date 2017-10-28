package com.bootcamp.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.jpa.entities.Livrable;

public interface LivrableRepository extends JpaRepository<Livrable,Long>{

}
