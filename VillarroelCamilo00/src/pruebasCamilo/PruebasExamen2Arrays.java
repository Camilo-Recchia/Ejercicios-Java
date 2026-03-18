package pruebasCamilo;

import java.util.Arrays;
import java.util.Scanner;

public class PruebasExamen2Arrays {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Dime el numero de valores por fila: ");
		int filas = teclado.nextInt();
		System.out.print("Dume el numero de valores por columna: ");
		int columnas = teclado.nextInt();

		int[][] matriz = new int[filas][columnas];

		int opcion = mostrarMenu(teclado);

		while (opcion != 0) {

			switch (opcion) {

			case 1: {
				mostrarArray(matriz);
				break;
			}
			case 2: {
				rellenarArray(matriz);
				break;
			}
			case 3: {
				System.out.print("Dime la fila: ");
				int fila = teclado.nextInt();
				System.out.print("Dime la columna: ");
				int columna = teclado.nextInt();
				matriz[fila][columna] = 0;
				break;
			}
			case 4: {
				System.out.print("Dime la fila: ");
				int fila = teclado.nextInt();
				System.out.print("Dime la columna: ");
				int columna = teclado.nextInt();
				System.out.println("Dime el valor nuevo");
				int valor = teclado.nextInt();
				matriz[fila][columna] = valor;
			}
			case 5: {
				vaciarArray(matriz);
				break;
			}
			case 6: {
				System.out.print("Dime el valor de multiplicado: ");
				multiplicarArray(matriz,teclado);
				break;
			}
			default: {
				System.out.println("Dato erroneo, intentelo de nuevo.");
				break;
			}
			}

			opcion = mostrarMenu(teclado);
		}
	}

	public static int mostrarMenu(Scanner teclado) {

		System.out.println("\n\nSalir: 0");
		System.out.println("1. Mostrar el array.");
		System.out.println("2. Asignar valores random al array.");
		System.out.println("3. Eliminar un valor especifico del array.");
		System.out.println("4. Asignar un valor especifico en el array.");
		System.out.println("5. Vaciar el array.");
		System.out.println("6. Duplicar todos los valores del array.");

		System.out.print("Opcion: ");

		int opcion = teclado.nextInt();

		return opcion;
	}

	// Mostrar el array
	public static void mostrarArray(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println("");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}

		}

	}

	// Llenar el array de valores random
	public static void rellenarArray(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 100);
			}
		}
	}

	// Llenar el array de valores random
	public static void vaciarArray(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = 0;
			}
		}
	}

	// Multiplicar el array por un valor dado
	public static void multiplicarArray(int[][] array, Scanner teclado) {
	
		int valor = teclado.nextInt();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = array[i][j]*valor;
			}
		}

	}
}
