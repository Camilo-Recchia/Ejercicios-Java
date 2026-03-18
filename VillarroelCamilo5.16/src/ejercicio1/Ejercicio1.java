package ejercicio1;

import java.time.LocalDate;

import libtarea3.CuentaBancaria;

public class Ejercicio1 {

	public static void main(String[] args) {

		CuentaBancaria cuentaPrivada;

		CuentaBancaria cuentaConjunta;

		CuentaBancaria cuentaFamiliar;
		try {

			cuentaPrivada = new CuentaBancaria(1000, LocalDate.of(2027, 9, 1));

		} catch (Exception ex1) {
			System.out.printf("Error al crear la cuenta privada: %s", ex1.getMessage());
		}

		try {

			cuentaConjunta = new CuentaBancaria(-200);

		} catch (Exception ex2) {
			System.out.printf("\nError al crear la cuenta conjunta: %s", ex2.getMessage());
		}

		cuentaPrivada = new CuentaBancaria(1000, LocalDate.of(2021, 7, 1), -200);

		cuentaConjunta = new CuentaBancaria(200, LocalDate.of(2021, 7, 1));

		cuentaFamiliar = new CuentaBancaria();

		System.out.printf("\n\nEl id de la cuenta privada es: %s", cuentaPrivada.getId());

		System.out.printf("\nLa fuecha de creacion de la cuenta fue el: %s", cuentaPrivada.getFechaCreacion());

		System.out.printf("\nEl limite de descuento de la cuenta es de: %.2f", cuentaPrivada.getLimiteDescubierto());

		System.out.printf("\nLa cuenta esta enbargada: %b", cuentaPrivada.isEmbargada());

		System.out.printf("\nLa cuenta esta en descubierto: %b", cuentaPrivada.isDescubierta());

		System.out.printf("\nCuento tiempo lleva la cuenta abierta: %d dias", cuentaPrivada.getDiasCuenta());

		cuentaFamiliar.ingresar(100);

		cuentaConjunta.extraer(100);

		cuentaPrivada.transferir(1100, cuentaFamiliar);

		System.out.printf("\n\nLa información de la cuenta privada es: %s", cuentaPrivada.toString());
		System.out.printf("\n\nLa información de la cuenta conjunta es: %s", cuentaConjunta.toString());
		System.out.printf("\n\nLa información de la cuenta familiar es: %s", cuentaFamiliar.toString());

	}
}
