/*
 *Descripción: Mostrar Metodo Operadores
 *Autor: Camilo Villarroel Recchia
 *Fecha: 06/11/2025
 */
package metodos;

import java.util.Scanner;

public class OperacionNumeros {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Operación de ");

		System.out.print("Dime el primer numero: ");
		int a = teclado.nextInt();

		System.out.print("Dime el segundo numero: ");
		int b = teclado.nextInt();

		System.out.print("Dime la operacion que quieres realizar(+, -, *, /, %): ");
		teclado.nextLine();
		String operador = teclado.nextLine();

		double resultado = OperaciondeNumeros(a, b, operador);

		System.out.printf("El resultado es %.3f", resultado);

	}

//	Metodo para hacer operaciones de (+, -, *, / y %) entre un numero a y uno b

	public static double OperaciondeNumeros(double a, double b, String operador) {

		double resultado = 0;

		switch (operador) {

		case "+":
			resultado = a + b;
			break;

		case "-":
			resultado = a - b;
			break;

		case "*":
			resultado = a * b;
			break;

		case "/":
			resultado = a / b;
			break;

		case "%":
			resultado = a % b;
			break;

		}
		return resultado;
	}

}