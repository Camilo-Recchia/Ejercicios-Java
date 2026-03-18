/*
 *Descripción: Validar el dormato y letra de un DNI
 *Autor: Camilo Villarroel Recchia
 *Fecha: 04/11/2025
 */
package expresionesRegulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PruebaDniParaElExamen {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Pattern patron = Pattern.compile("[0-9]{8}[A-Z]{1}");

		char validacionLetra = ' ';

		System.out.print("Introduzca su dni: ");
		String posibleDni = teclado.nextLine();

		Matcher texto = patron.matcher(posibleDni);

		System.out.println(texto);
		
		if (texto.matches()) {

			System.out.println("El formato del dni es valido.");

		} else {

			System.out.println("El formato del dni es invalido.");

			while (texto.matches() == false) {

				System.out.print("Introduzca un dni valido: ");
				posibleDni = teclado.nextLine();

				texto = patron.matcher(posibleDni);
			}

		}

		String cadenaNumerosDni = posibleDni.substring(0, 8);

		char letraDni = posibleDni.charAt(8);

		String abecedario = "TRWAGMYFPDXBNJZSQVHLCKE";

		int numerosDni = Integer.valueOf(cadenaNumerosDni);

		int comprobador = (int) (numerosDni % 23);

		validacionLetra = abecedario.charAt(comprobador);

		if (validacionLetra == letraDni) {

			System.out.println("Su dni es correcto");

		} else {

			System.out.println("Su dni no es correcto");
		}
	}

}
