package com.kakredev.examen.test;

import com.kakredev.examen.Vendedor;

public class TestVendedor {

	public static void main(String[] args) {
		Vendedor vendedor1 = new Vendedor("1723456789");

		vendedor1.setNumeroVentas(10);
		vendedor1.setSueldoFijo(500);
		vendedor1.setComisionPorVenta(25);

		System.out.println(vendedor1);
	}

}
