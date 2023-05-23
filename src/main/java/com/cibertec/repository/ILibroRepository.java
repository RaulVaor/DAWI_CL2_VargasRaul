package com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.modelo.Libro;

public interface ILibroRepository extends JpaRepository<Libro, Integer>{

}
