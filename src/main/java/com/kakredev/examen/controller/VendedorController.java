package com.kakredev.examen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kakredev.examen.AdminVentas;
import com.kakredev.examen.Vendedor;

@RestController
@RequestMapping("/vendedores")
public class VendedorController {

	private AdminVentas adminVentas;

	public VendedorController() {
		adminVentas = new AdminVentas();
	}

	@PostMapping("/agregar")
	public void agregarVendedor(
			@RequestBody Vendedor vendedor) {

		adminVentas.agregar(vendedor);
	}

	@GetMapping("/calcular/{cedula}")
	public Double calcularSueldoVendedor(
			@PathVariable String cedula) {

		return adminVentas.calcularSueldo(cedula);
	}
}