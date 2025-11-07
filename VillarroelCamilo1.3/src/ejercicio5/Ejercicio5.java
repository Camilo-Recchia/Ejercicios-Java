/*
 *Descripción: Uso de variables con Math
 *Autor: Camilo Villarroel Recchia
 *Fecha: 1/10/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.print("Intoduzca el valor de las dos variables ");
		System.out.print("\n\nVariable 1: ");
		num1 = teclado.nextInt();		
		
		System.out.print("\nVariable 2: ");
		num2 = teclado.nextInt();		
	
		System.out.println("\nEl numero más pequeño entre los dos es el "+Math.min(num1, num2));
		System.out.println("El primer numero elevado al segundo da como resultado "+Math.pow( num1,  num2));
		System.out.println("La raíz cuadrada de el primer numero es "+Math.sqrt(num1));
		System.out.println("Este es un valor random "+Math.random());
	
	
	
	}

}
