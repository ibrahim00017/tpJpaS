package com.bootcamp.jpa.metier;

import java.util.List;

import com.bootcamp.jpa.entities.Programme;

public interface ProgrammeMetier {
public Programme add(Programme programme);
public List<Programme> getAll();
public Programme get(Long id);
public void delete(Long id);
public void deleteAll();

}
