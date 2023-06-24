package com.lanfranco.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lanfranco.app.models.Producto;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Override
	public List<Producto> listar() {
		
		List<Producto> productos = new ArrayList<>();
		productos.add(new Producto(1, "Laptop", "laptop MSI de gama alta", 2500.0));
		productos.add(new Producto(2, "Mouse", "mouse Logitech", 100.0));
		productos.add(new Producto(3, "Pantalla", "pantalla Samsung", 1500.0));
		productos.add(new Producto(4, "Cooler", "coolermaster 4 ventiladores", 250.0));
		productos.add(new Producto(5, "Disco SSD", "Kingston Hyper X", 350.0));
		
		return productos;
	}

}
