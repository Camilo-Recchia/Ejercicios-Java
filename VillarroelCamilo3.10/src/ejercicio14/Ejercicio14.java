/*
 *Descripción: Numeros en un array??
 *Autor: Camilo Villarroel Recchia
 *Fecha: 21/10/2025
 */
package ejercicio14;

public class Ejercicio14 {

	public static void main(String[] args) {

		final int SIZE = 55;

		int[] numeros = new int[SIZE];
		int contador = 0,numero = 1;

		for (int i = 0; i < 55; i++) {
			
			numero = contador;
			
			while(contador<=numero) {
				
				numeros[i] = numero;
				contador++;
				
			}
			
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
			
		}
	}

}
