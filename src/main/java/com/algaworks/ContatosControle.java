package com.algaworks;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContatosControle {	
	
	//constante static
	private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<Contato>();
	
	static { //atalho ctrl + alt seta baixo ;)
		LISTA_CONTATOS.add(new Contato("1", "Segovinha", "+55768-78989"));
		LISTA_CONTATOS.add(new Contato("2", "Nilton Santos", "+55768-78989"));
		LISTA_CONTATOS.add(new Contato("3", "Garrincha", "+55768-78989"));
		LISTA_CONTATOS.add(new Contato("4", "Pelé", "+55768-78989"));
		LISTA_CONTATOS.add(new Contato("5", "Zagallo", "+55768-78989"));
		LISTA_CONTATOS.add(new Contato("6", "Tquinho", "+55768-78989"));
	}
	
	
//	private static final Contato[]LISTA_CONTATO_2 = new Contato[10];
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/contatos")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("listar");
		modelAndView.addObject("contatos",LISTA_CONTATOS);
		return modelAndView;
	}
}
