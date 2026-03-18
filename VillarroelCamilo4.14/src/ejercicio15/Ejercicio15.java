/*
 *Descripción: Suma y Media de un vector
 *Autor: Camilo Villarroel Recchia
 *Fecha: 18/11/2025
 */
package ejercicio15;

public class Ejercicio15 {

	public static void main(String[] args) {

		int[] vector = new int[50];

		arrayRandom(vector);

		System.out.print("El vector es: ");
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
		}

		System.out.println("\nLa suma total de los numeros es: " + suma(vector));
		System.out.println("\nLa media total de los numeros es: " + media(vector));

	}

	public static void arrayRandom(int[] vector) {

		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) ((Math.random() * 50) + 50);
		}
	}

	public static int suma(int[] vector) {

		int suma = 0;

		for (int i = 0; i < vector.length; i++) {
			suma = suma + vector[i];
		}

		return suma;

	}

	public static int media(int[] vector) {
		return suma(vector) / vector.length;
	}

}
