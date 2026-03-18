package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame el valor de x: ");
		int x = teclado.nextInt();
		System.out.print("Dame el valor de y: ");
		int y = teclado.nextInt();
		System.out.print("Dame el valor de z: ");
		int z = teclado.nextInt();

		if (pitagoras(x, y, z) == true) {
			System.out.println("Los valores cuadran en la ecuación.");
		} else {
			System.out.println("Los valores no cuadran en la ecuación.");
		}

	}

	// Metodo que calcula la veracidad de unas variables dentro de la ecuacion de pitagoras //
	
	public static boolean pitagoras(int x, int y, int z) {

		boolean comprobador;

		if (((x * x) + (y * y)) == (z * z)) {
			comprobador = true;
		} else {
			comprobador = false;
		}

		return comprobador;
	}
}
