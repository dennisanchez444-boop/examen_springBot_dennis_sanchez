package com.kakredev.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestVendedorComisionJUnit {
	@Test
	public void testCalcularSueldo() {

		VendedorComision vendedor = new VendedorComision("1234567890");

		vendedor.setNumeroVentas(10);
		vendedor.setComisionPorVenta(20);

		double sueldo = vendedor.calcularSueldo();

		assertEquals(200.0, sueldo);
	}
}
