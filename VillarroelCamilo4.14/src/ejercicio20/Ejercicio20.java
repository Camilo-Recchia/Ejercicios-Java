package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] tabla = new int[10];

		System.out.println("Dime un numero n y te dire su tabla de multiplicar.");
		System.err.print("Valor: ");
		int x = teclado.nextInt();
		
		System.out.printf("La tabla de %d es:",x);
		
		tablaMultiplicar(x,tabla);
		
		System.out.println("");
		
		for(int i = 0; i<tabla.length;i++) {
			System.out.println(tabla[i]);
		}

	}

	// Metodo que muesta la tabla de multiplicar de un valor x //

	public static void tablaMultiplicar(int x, int[] tabla) {

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = x * (i + 1);
		}
	}

}
