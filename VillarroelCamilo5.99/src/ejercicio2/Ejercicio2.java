/*
 *Descripción: Utiliza la clase CuentaBancaria para crear 3 cuentas distintas y modificar sus valores
 *Autor: Camilo Villarroel Recchia
 *Fecha: 28/01/2026
 */
package ejercicio2;

import java.time.LocalDate;

import libtarea3.CuentaBancaria;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos 3 cuentas bancarias

		CuentaBancaria Villarroel_1;

		CuentaBancaria Villarroel_2;

		CuentaBancaria Villarroel_3;

		// Les inicializanis valores a cada una de ellas

		Villarroel_1 = new CuentaBancaria(1000, LocalDate.now(), -2000);

		Villarroel_2 = new CuentaBancaria(2000, LocalDate.now(), -2000);

		Villarroel_3 = new CuentaBancaria(3000, LocalDate.now(), -2000);

		// Mostramos por la consola los valores de cada cuenta con el .toString()

		System.out.printf("%s", Villarroel_1.toString());
		System.out.println("");
		System.out.printf("%s", Villarroel_2.toString());
		System.out.println("");
		System.out.printf("%s", Villarroel_3.toString());
		System.out.println("");

		// Mostramos la cuenta con menor limire de descubierto

		if (Villarroel_1.getLimiteDescubierto() < Villarroel_2.getLimiteDescubierto()
				&& Villarroel_1.getLimiteDescubierto() < Villarroel_3.getLimiteDescubierto()) {
			System.out.printf("La cuenta con menor límite de descubierto es la 1");
		} else if (Villarroel_2.getLimiteDescubierto() < Villarroel_1.getLimiteDescubierto()
				&& Villarroel_2.getLimiteDescubierto() < Villarroel_3.getLimiteDescubierto()) {
			System.out.printf("La cuenta con menor límite de descubierto es la 2");
		} else {
			System.out.printf("La cuenta con menor límite de descubierto es la 3");
		}

		// Transferimos 1500€ desde la cuenta 1 a la 2
		
		for (int i = 0; i < 5; i++) {

			Villarroel_1.transferir(300, Villarroel_2);
		}
		
		// Mostramos el saldo de ambas cuentas
		
		System.out.println("");
		System.out.printf("Cuenta 1: %f", Villarroel_1.getSaldo());
		System.out.println();
		System.out.printf("Cuenta 2: %f", Villarroel_2.getSaldo());
		System.out.println("");

		// Embargamos un 50% de la cuenta 3
		
		Villarroel_3.embargar(50);

		// Y mostramos los datos de la cuenta nº 3
		
		System.out.printf("%s", Villarroel_3.toString());
		
		// Por ultimo mostramos el saldo global y las cuentas embargadas
		
		System.out.println();
		System.out.printf("El total de saldo de todas las cuentas es de: %s", CuentaBancaria.getSaldoGlobal());
		System.out.println("");
		System.out.printf("El total de cuentas embargadas es de: %s", CuentaBancaria.getNumCuentasEmbargadas());
		System.out.println();

	}

	// Genera un numero aleatorio entre -4000 y 0 donde sus unidades son siempre 0
	public static int limiteAleatorio() {

		int valor = ((int) (Math.random() * -400)) * 10;

		return valor;
	}

}
