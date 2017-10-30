package com.bootcamp.jpa.metier;

import java.util.List;

public interface BaseMetier<T> {
	public T add(T obj);
	public List<T> getAll();

}
