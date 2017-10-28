package com.bootcamp.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.jpa.entities.Programme;

public interface ProgrammeRepository extends JpaRepository<Programme,Long>{

}
