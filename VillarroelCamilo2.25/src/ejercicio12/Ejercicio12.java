package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero, previo, size;

		System.out.print("Introduzca a partir de que numero quiere saberse la secuencia de Fibonacci: ");
		numero = teclado.nextInt();
		previo = numero;

		System.out.print("Ahora introduzca hasta que dato quiera saber de la secuencia: ");
		size = teclado.nextInt();

		System.out.print(numero + " ");

		for (int i = 0; i < size; i++) {

			System.out.print(numero + " ");

			numero = numero + previo;
			previo = numero - previo;

		}

	}

}
