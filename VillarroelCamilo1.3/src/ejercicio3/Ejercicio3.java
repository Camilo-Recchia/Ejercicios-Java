/*
 *Descripción: Cambiar una variable por otra
 *Autor: Camilo Villarroel Recchia
 *Fecha: 1/10/2025
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		
		int num1,num2,cambio;
		
		System.out.print("Instroduce el valor de la primera variable: ");
		num1 = teclado.nextInt();
		
		System.out.print("Introducir el valor de la segundo variable: ");
		num2 = teclado.nextInt();
		

		
		System.out.print("\n--------------------------------------------\n///Intercambiando Valores de Varibales///\n--------------------------------------------");
		
		cambio = num2;
		
		num2 = num1;
		
		num1 = cambio;
		
		System.out.print("\n\nAhora la primera variable vale "+num1+" y la segunda vale "+num2);
		
	}

}
