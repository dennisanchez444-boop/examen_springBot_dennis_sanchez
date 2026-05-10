package com.kakredev.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestVendedorJUnit {

	@Test
	public void testCalcularSueldo() {

		Vendedor vendedor = new Vendedor("1723456789","V");
		vendedor.setSueldoFijo(500.0);

		double sueldo = vendedor.calcularSueldo();

		assertEquals(500.0, sueldo);
	}
}