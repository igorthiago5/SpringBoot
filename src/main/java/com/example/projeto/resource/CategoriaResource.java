package com.example.projeto.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categoria")
public class CategoriaResource {
	
	//devido ao uso simples do uso, queremo só 
	@RequestMapping(method=RequestMethod.GET)
	public String lista() {
		return "Rest ok";
	}
}
