/*
 *Descripción: Datos de un Club
 *Autor: Camilo Villarroel Recchia
 *Fecha: 26/09/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String nombre, estadio, capitan;
		short año;

		System.out.print("Introducir nombre club: ");
		nombre = teclado.nextLine();

		System.out.print("Introducir año de fundación: ");
		año = teclado.nextShort();

		teclado.nextLine();

		System.out.print("Introducir nombre estadio: ");
		estadio = teclado.nextLine();

		System.out.print("Introducir nombre capitán: ");
		capitan = teclado.nextLine();

		System.out.print("Nombre del Equipo: " + nombre + "\nFundado en :" + año + "\nEstadio: " + estadio
				+ "\nCapitán:" + capitan);

	}

}
