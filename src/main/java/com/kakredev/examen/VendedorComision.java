package com.kakredev.examen;

public class VendedorComision extends Vendedor {

	public VendedorComision(String cedula) {
		super(cedula,"C");
	}

	@Override
	public double calcularSueldo() {
		return getComisionPorVenta() * getNumeroVentas();
	}
}