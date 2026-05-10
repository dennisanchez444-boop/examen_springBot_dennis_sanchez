package com.kakredev.examen;

public class VendedorMixto extends Vendedor {

	public VendedorMixto(String cedula) {
		super(cedula,"M");
	}

	@Override
	public double calcularSueldo() {

		double bono = getSueldoFijo() * 0.01 * getNumeroVentas();

		return getSueldoFijo() + bono;
	}
}