/*
 *Descripción: Movimientos en Cuentas Bancarias
 *Autor: Camilo Villarroel Recchia
 *Fecha: 17/12/2025
 */

package ejercicio2;

import libtarea3.CuentaBancaria;

public class Ejercicio2 {

	public static void main(String[] args) {

		CuentaBancaria Villarroel_1;
		CuentaBancaria Villarroel_2;
		CuentaBancaria Villarroel_3;

		try {
			Villarroel_1 = new CuentaBancaria(saldoAleatorio());
		} catch (Exception ex1) {
			System.out.printf("\nLa cuenta bancaria 1 se creo con valor por defecto debido a que: %s", ex1.getMessage());
			Villarroel_1 = new CuentaBancaria();
		}

		try {
			Villarroel_2 = new CuentaBancaria(saldoAleatorio());
		} catch (Exception ex2) {
			System.out.printf("\nLa cuenta bancaria 2 se creo con valor por defecto debido a que: %s", ex2.getMessage());
			Villarroel_2 = new CuentaBancaria();
		}

		try {
			Villarroel_3 = new CuentaBancaria(saldoAleatorio());
		} catch (Exception ex3) {
			System.out.printf("\nLa cuenta bancaria 3 se creo con valor por defecto debido a que: %s", ex3.getMessage());
			Villarroel_3 = new CuentaBancaria();
		}

		System.out.println(
				"\n\n\t\tInformacion de las cuentas bancarias \n\t------------------------------------------------------");
		System.out.printf("\nLa informacion de la cuenta 1 es: %s", Villarroel_1.toString());
		System.out.printf("\nLa informacion de la cuenta 2 es: %s", Villarroel_2.toString());
		System.out.printf("\nLa informacion de la cuenta 3 es: %s", Villarroel_3.toString());

		double total1 = Villarroel_1.getTotalIngresado();
		double total2 = Villarroel_2.getTotalIngresado();
		double total3 = Villarroel_3.getTotalIngresado();

		System.out.println("\n");

		if (total1 >= total2 && total1 >= total3) {
			System.out.println("La cuenta 1 es la que tiene más dinero");
		} else if (total2 >= total1 && total2 >= total3) {
			System.out.println("La cuenta 2 es la que tiene más dinero");
		} else {
			System.out.println("La cuenta 3 es la que tiene más dinero");
		}

		Villarroel_1.ingresar(1000);

		int i = 0;

		do {
			try {

				System.out.printf("\n\nEsta operacion es un ingreso. La informacion de la cuenta era de: %s",
						Villarroel_1.toString());
				Villarroel_1.ingresar(saldoAleatorio());
				System.out.printf("\nLa informacion ahora es: %s", Villarroel_1.toString());

				System.out.printf("\n\nEsta operacion es una extraccion. La informacion de la cuenta era de: %s",
						Villarroel_1.toString());
				Villarroel_1.extraer(saldoAleatorio());
				System.out.printf("\nLa informacion ahora es: %s", Villarroel_1.toString());
				i++;
			} catch (Exception ex4) {
				System.out.printf("\n\nNo se pudo realizar la operacion porque %s", ex4.getMessage());
				i = 10;
			}
		} while (i < 10);

	}

	// Metodo que crea un valor entre -3000 y 3000 con las unidades y decenas en 00 // 

	public static double saldoAleatorio() {
		int aleatorio = (int) (Math.random() * 2);
		int valor;

		if (aleatorio == 1) {
			valor = -1;
		} else {
			valor = 1;
		}

		return ((int) (Math.random() * 30)) * 100 * valor;
	}

}
