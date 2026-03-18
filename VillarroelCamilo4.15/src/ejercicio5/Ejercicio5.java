/*
 *Descripción: Programa que calcula la posicon de un jugador sugun su numero de camiseta
 *Autor: Camilo Villarroel Recchia
 *Fecha: 21/11/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Dime tu nombre: ");
		String nombre = teclado.nextLine();

		System.out.print("Dime tu numero de camiseta: ");
		int numero = teclado.nextInt();

		nombre = nombre + posicionNum(numero);

		System.out.println(nombre);
		
		teclado.close();
	}

	// Metodo que calcula la posicion de un jugador segun su numero //
	
	public static String posicionNum(int numero) {

		String cadena = ", con el dorsal " + numero + " juega el próximo partido como ";

		switch (numero) {
		case 1:
			cadena = cadena + "portero.";
			break;
		case 2, 3, 4, 5:
			cadena = cadena + "defensa.";
			break;
		case 6, 7, 8:
			cadena = cadena + "centrocampista.";
			break;
		case 9, 10, 11:
			cadena = cadena + "delantero.";
			break;
		case 12, 13, 14, 15, 16:
			cadena = cadena + "suplente.";
			break;
		}

		return cadena;
	}

}
