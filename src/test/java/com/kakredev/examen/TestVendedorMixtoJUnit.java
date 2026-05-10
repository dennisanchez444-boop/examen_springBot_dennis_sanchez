package com.kakredev.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestVendedorMixtoJUnit {

	@Test
	public void testCalcularSueldo() {

		VendedorMixto vendedor = new VendedorMixto("0987654321");

		vendedor.setSueldoFijo(500);
		vendedor.setNumeroVentas(10);

		double sueldo = vendedor.calcularSueldo();

		assertEquals(550.0, sueldo);
	}
}