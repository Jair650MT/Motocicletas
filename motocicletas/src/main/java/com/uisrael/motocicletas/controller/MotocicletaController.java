package com.uisrael.motocicletas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.uisrael.motocicletas.model.Motocicleta;
import com.uisrael.motocicletas.services.impl.IMotocicletaServices;



@Controller
public class MotocicletaController {
	@Autowired
	private IMotocicletaServices serviciosMoto;
	@GetMapping("/motocicleta")
	public String verMotos(Model model) {
		List<Motocicleta> listaMoto=serviciosMoto.listaMoto();
		model.addAttribute("listaMotos",listaMoto);
		return"/motocicletas/listaMotos";
	}
	
	@GetMapping("/motocicleta/nueva")
	private String insertMotos(Model model) {
		model.addAttribute("nuevaMoto",new Motocicleta());
		return"/motocicletas/nuevaMoto";
	}
	
	
	@PostMapping("/motocicleta/guardar")
	private String guardarMoto(@ModelAttribute("nuevaMoto") Motocicleta nueva) {
		serviciosMoto.insertMoto(nueva);
		return"redirect:/motocicleta";
	}
	@GetMapping("/motocicleta/editar/{id}")
	private String editarMoto(@PathVariable("id") Integer idObjeto, Model model) {
		model.addAttribute("nuevaMoto", serviciosMoto.editarMoto(idObjeto));
		return"/motocicletas/nuevaMoto";
	}
	
	@GetMapping("/borrarMotocicleta/{id}")
	public String BorrarMoto(@PathVariable("id") Integer idObjeto) {
		serviciosMoto.borrarMoto(idObjeto);
		return "redirect:/motocicleta";
	}
	
}
