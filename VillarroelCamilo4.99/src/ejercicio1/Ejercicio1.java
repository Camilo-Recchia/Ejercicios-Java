/*
 *Descripción: Calculo de consumos de una empresa
 *Autor: Camilo Villarroel Recchia
 *Fecha: 17/12/2025
 */

package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {

		int[][] consumos = {
				{ 21, 26, 40, 32, 32, 15, 27, 15, 31, 3, 20, 32, 2, 18, 27, 2, 40, 31, 24, 37, 15, 24, 10, 36 },
				{ 5, 25, 28, 5, 10, 30, 14, 6, 35, 33, 29, 9, 32, 15, 8, 37, 15, 39, 19, 30, 40, 14, 18, 2 },
				{ 39, 7, 17, 14, 2, 12, 34, 21, 3, 40, 29, 31, 1, 18, 14, 9, 31, 1, 6, 37, 11, 5, 37, 30 },
				{ 1, 12, 37, 6, 7, 30, 31, 3, 15, 35, 2, 38, 6, 30, 32, 31, 2, 32, 6, 14, 14, 21, 21, 38 },
				{ 8, 23, 37, 16, 0, 28, 5, 13, 35, 10, 22, 18, 28, 6, 12, 21, 12, 38, 26, 15, 39, 24, 37, 4 },
				{ 28, 7, 27, 5, 21, 27, 37, 17, 39, 8, 29, 30, 22, 10, 6, 32, 39, 18, 34, 0, 25, 35, 4, 29 },
				{ 2, 16, 16, 36, 33, 9, 34, 23, 4, 26, 14, 26, 10, 11, 12, 31, 27, 17, 20, 12, 24, 32, 11, 33 } };

		for (int i = 0; i < 7; i++) {
			System.out.println("\t");
			for (int j = 0; j < 24; j++) {
				System.out.print("\t" + consumos[i][j] + " ");

			}
		}
		
		for(int i = 0; i< 7;i++) {
			System.out.println("La ultima temperatura mas pequeña de este dia fue: "+horaMinimo(consumos,i));
			
		}
		
		System.out.println("El dia de mas consumo fue el "+semanaMinimo(consumos));
	}

	//Metodo que calcula el ultimno consumo mas pequqño //
	
	public static int horaMinimo(int[][] array, int dia) {
		int minimo = array[dia][0];

		for (int j = 0; j < 24; j++) {

			if (minimo > array[dia][j]) {
				minimo = array[dia][j];
			}

		}
		return minimo;
	}
	
	// Metodo que calcula el dia de mayor consumo //
	public static int semanaMinimo(int[][] array) {
		int minimo = array[0][0];
		int dia = 0;
		
		for (int i = 0; i < 7; i++) {
		
			for (int j = 0; j < 24; j++) {
				if (minimo < array[i][j]) {
					dia = i;
					}
				}
		}
		return dia;
	}
}
