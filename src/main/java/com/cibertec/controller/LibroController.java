package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cibertec.modelo.Libro;
import com.cibertec.modelo.Tema;
import com.cibertec.repository.ILibroRepository;
import com.cibertec.service.ILibroService;
import com.cibertec.service.ITemaService;

import jakarta.validation.Valid;

@Controller
public class LibroController {
	
	@Autowired
	ITemaService temaService;
	
	@Autowired
	ILibroService libroService;
	

	
	public String listadoLibros(Model model) {
		model.addAttribute("lstLibros", libroService.getAll());
		return "listado";
	}
	
	
	
	
	
	
	@GetMapping("/libros/crear")
	public String saveFormCliente(Model model) {
		List<Tema> temas = temaService.getAll();
		Libro libro = new Libro();
		
		model.addAttribute("libro", libro);
		model.addAttribute("temas", temas);
		
		return "libro-registro";
	}
	
	
	
	@PostMapping("/libros/crear")
	public String saveLibros(@Valid @ModelAttribute(name = "libro") Libro libro,
								BindingResult result,
								RedirectAttributes redirectAttributes,
								Model model) {
		
		if(result.hasErrors()) {
			List<Tema> temas = temaService.getAll();
			model.addAttribute("temas", temas);
			
			return "libro-registro";
		}
		
		libroService.guardar(libro);
		redirectAttributes.addFlashAttribute("mensaje", "Libro agregado correctamente");
		
		return "redirect:/libros/crear";
	}
	
}
