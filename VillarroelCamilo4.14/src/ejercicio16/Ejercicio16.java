/*
 *Descripción: Array valores random
 *Autor: Camilo Villarroel Recchia
 *Fecha: 18/11/2025
 */
package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dime el tamaño del array: ");
		int tamanno = teclado.nextInt();
		
		int[] vector = new int[tamanno];
		
		arrayRandom(vector);
		
		System.out.print("El array es: ");
		for(int i = 0;i<vector.length;i++) {
			System.out.print(vector[i]+" ");
		}
	}

	public static void arrayRandom(int[] vector) {
		
		for(int i = 0;i<vector.length;i++) {
			vector[i] = (int)((Math.random()*50)+50);
		}
	}
	
}
