/*
 *Descripción: Validacion de Dni
 *Autor: Camilo Villarroel Recchia
 *Fecha: 13/11/2025
 */
package ejercicio18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio18 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Pattern patron = Pattern.compile("[0-9]{8}[A-Z]");

		System.out.print("Digame su Dni: ");
		String posibleDni = teclado.nextLine();

		Matcher texto = patron.matcher(posibleDni);

		dniValido(posibleDni, texto, teclado, patron);

		if (dniLetra(posibleDni) == charSegunNumDni(dniNumeros(posibleDni))) {
			System.out.println("El dni es correcto");
		} else {
			System.out.println("El dni es incorrecto");
		}

	}

	// Metodo para saber si el formato de un dni es valido //

	public static void dniValido(String dni, Matcher texto, Scanner teclado, Pattern patron) {

		if (texto.matches()) {
			System.out.println("El formato del dni es valido.");
		} else {
			System.out.println("El formato del dni es invalido.");

			while (texto.matches() == false) {

				System.out.print("Introduzca un dni valido: ");
				dni = teclado.nextLine();

				texto = patron.matcher(dni);
			}

		}
	}

	// Metodo para obtener la letra de un dni //

	public static char dniLetra(String dni) {

		char letra;

		letra = dni.charAt(8);

		return letra;
	}

	// Metodo para obtener los numeros de un dni //

	public static int dniNumeros(String dni) {

		int numeros;

		String numerosString = dni.substring(0, 8);

		numeros = Integer.valueOf(numerosString);

		return numeros;
	}

	// Metodo para calcular la letra segun los numeros del dni

	public static char charSegunNumDni(int numeros) {

		char letra;

		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

		letra = letras.charAt(numeros % 23);

		return letra;
	}
}
