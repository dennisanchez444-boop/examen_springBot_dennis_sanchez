package com.kakredev.examen.test;

import com.kakredev.examen.AdminVentas;
import com.kakredev.examen.Vendedor;
import com.kakredev.examen.VendedorComision;
import com.kakredev.examen.VendedorMixto;

public class TestAdmin {

	public static void main(String[] args) {
		AdminVentas admin = new AdminVentas();
		Vendedor vendedor1 = new Vendedor("111");
		vendedor1.setSueldoFijo(500);

		VendedorComision vendedor2 = new VendedorComision("222");
		vendedor2.setNumeroVentas(10);
		vendedor2.setComisionPorVenta(20);

		VendedorMixto vendedor3 = new VendedorMixto("333");
		vendedor3.setSueldoFijo(500);
		vendedor3.setNumeroVentas(10);

		admin.agregar(vendedor1);
		admin.agregar(vendedor2);
		admin.agregar(vendedor3);

		System.out.println(admin.calcularSueldo("111"));
		System.out.println(admin.calcularSueldo("222"));
		System.out.println(admin.calcularSueldo("333"));

		System.out.println(admin.calcularSueldo("999"));
	}
}
