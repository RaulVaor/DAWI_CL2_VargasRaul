package com.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.modelo.Libro;
import com.cibertec.repository.ILibroRepository;

@Service
public class LibroServiceImp implements ILibroService{

	@Autowired
	ILibroRepository iLibroRepository;
	
	@Override
	public void guardar(Libro libro) {
		iLibroRepository.save(libro);
	}

	@Override
	public List<Libro> getAll() {
		return iLibroRepository.findAll();
	}

}
