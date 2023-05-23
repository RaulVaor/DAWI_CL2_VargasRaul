package com.cibertec.service;

import java.util.List;

import com.cibertec.modelo.Libro;

public interface ILibroService {
	void guardar(Libro libro);
	List<Libro> getAll();
}
