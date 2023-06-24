package com.lanfranco.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lanfranco.app.models.Producto;
import com.lanfranco.app.services.ProductoService;

@RestController
public class ProductoController {
	
	@Autowired
	private ProductoService service;
	
	@GetMapping("/")
	public List<Producto> listar(){
		return service.listar();
	}

}
