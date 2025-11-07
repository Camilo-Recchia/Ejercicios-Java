/*
 *Descripción: Comprovacion del formato de un DNI
 *Autor: Camilo Villarroel Recchia
 *Fecha: 31/10/2025
 */
package expresionesRegulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionRegularPrueba1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Pattern patron = Pattern.compile("[0-9]{8}[A-Z]");

		String DNI;
		System.out.print("Introduzca su DNI: ");
		DNI = teclado.nextLine();
		
		Matcher texto = patron.matcher(DNI);

		if (texto.matches()) {

			System.out.println("El formato del DNI es valido");
		} else {
			System.out.println("El formato del DNI es invalido");
		}

	}

}
