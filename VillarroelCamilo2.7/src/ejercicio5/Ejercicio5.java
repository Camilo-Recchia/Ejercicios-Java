/*
 *Descripción: Calculadora Basica
 *Autor: Camilo Villarroel Recchia
 *Fecha: 08/10/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int num1, num2, calculo;
		double resultado = 0;

		System.out.print("Introduzca el valor 1: ");
		num1 = teclado.nextInt();
		System.out.print("\n\nIntroduzca el valor 2: ");
		num2 = teclado.nextInt();

		System.out.print(
				"\n\nIndique la operación que quiere realizar (Inserte un número):\n\n(1) Suma\n\n(2) Resta\n\n(3) Multiplicación\n\n(4) División\n\nNúmero: ");
		calculo = teclado.nextInt();

		System.out.println("\n----------------------------------");

		switch (calculo) { // Diferente operación segun el digito

		case 1:
			resultado = num1 + num2;
			System.out.print("El resultado de su operación es " + resultado);
			break;
		case 2:
			resultado = num1 - num2;
			System.out.print("El resultado de su operación es " + resultado);
			break;
		case 3:
			resultado = num1 * num2;
			System.out.print("El resultado de su operación es " + resultado);
			break;
		case 4:
			resultado = num1 / (double) num2;
			System.out.print("El resultado de su operación es " + resultado);
			break;
		default:
			System.out.print(
					"El numero ingresado no corresponde \ncon ninguna operación. Por favor \nintentelo de nuevo");
		}

	}

}
