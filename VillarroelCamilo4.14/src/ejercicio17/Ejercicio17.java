/*
 *Descripción: Un numero es primo o no.
 *Autor: Camilo Villarroel Recchia
 *Fecha: 18/11/2025
 */
package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int primo;
		
		do {
		
		System.out.println("Dime los numeros de los que quieras saber si son primos o no.");
		System.out.print("Numero: ");
		primo = teclado.nextInt();

		if (esPrimo(primo) == true) {
			System.out.println("El numero es primo");
		} else {
			System.out.println("El numero no es primo ");
		}
		System.out.println("------------------");
		} while(primo!= 0);
	}

	// Metodo para confirmar si un numero es primo o no //
	
	public static boolean esPrimo(int a) {
		boolean primo;

		if (a == 1) {
			primo = false;
		} else if (a / a == 1) {
			primo = true;
		} else {
			primo = false;
		}

		return primo;
	}

}
