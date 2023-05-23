package com.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.modelo.Tema;
import com.cibertec.repository.ITemaRepository;

@Service
public class TemaServiceImp implements ITemaService{

	@Autowired
	ITemaRepository iTemaRepository;
	
	@Override
	public List<Tema> getAll() {
		return iTemaRepository.findAll();
	}

	@Override
	public Tema findById(Integer id) {
		Optional<Tema> tema = iTemaRepository.findById(id);
		
		if (tema.isEmpty()) {
			return null;
		}
		
		return tema.get();
	}

}
