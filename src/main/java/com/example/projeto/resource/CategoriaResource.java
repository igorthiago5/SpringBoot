package com.example.projeto.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto.domain.Categoria;

@RestController
@RequestMapping(value="/categoria")
public class CategoriaResource {
	
	//devido ao uso simples do uso, queremo só 
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> lista() {
		Categoria categoria = new Categoria(1,"informatica");
		Categoria categoria2 = new Categoria(1,"Escritório");
		
		List<Categoria> c1 = new ArrayList<>();
		c1.add(categoria);
		c1.add(categoria2);
		
		return c1;
	}
}
