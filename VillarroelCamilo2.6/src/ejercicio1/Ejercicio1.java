/*
 *Descripción: Analizar dos variables y decir cual es mayor que la otra
 *Autor: Camilo Villarroel Recchia
 *Fecha: 03/10/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		

		Scanner teclado = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.println("Introduzca dos numeros para analizarlos: ");
		
		System.out.print("Variable 1: ");
		num1 = teclado.nextInt();
		
		System.out.print("Variable 2: ");
		num2 = teclado.nextInt(); 
	
		if (num1>num2)//Primera variable mayor que la segunda
		System.out.print(num1+" es mayor que "+num2);
		else if (num2>num1)//Segunda variable mayor que la primera
		System.out.print(num2+" es mayor que "+num1);//Las dos variables son iguales
		else System.out.print(num1+" es igual a "+num2);
	}

}
