package com.cibertec.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "libro")
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idlibro")
	private int idlibro;
	
	//@Pattern(regexp = "[Aa-Zz][0-9]{45}", message = "Tiene un máximo de 35 carácteres")
	@Column(name = "titulo")
	private String titulo;
	
	//@Pattern(regexp = "[Aa-Zz]{35}", message = "Tiene un máximo de 35 carácteres")
	@Column(name = "precio")
	private double precio;
	
	//@Pattern(regexp = "[0-9]{3}", message = "Este campo ")
	@Column(name = "cantEjemplares")
	private int cantEjemplares;
	
	//@Pattern(regexp = "[Aa-Zz]{50}", message = "Tiene un máximo de 35 carácteres")
	@Column(name = "origen")
	private String origen;
	
	@ManyToOne
	@JoinColumn(name = "idtema")
	@NotNull(message = "Debes seleccionar un tema")
	private Tema tema;

	
	
	
	
	public int getIdlibro() {
		return idlibro;
	}

	public void setIdlibro(int idlibro) {
		this.idlibro = idlibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantEjemplares() {
		return cantEjemplares;
	}

	public void setCantEjemplares(int cantEjemplares) {
		this.cantEjemplares = cantEjemplares;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	
	
	

}
