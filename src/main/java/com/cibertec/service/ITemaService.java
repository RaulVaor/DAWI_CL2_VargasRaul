package com.cibertec.service;

import java.util.List;

import com.cibertec.modelo.Tema;

public interface ITemaService {
	
	List<Tema> getAll();
	
	Tema findById(Integer id);
}
