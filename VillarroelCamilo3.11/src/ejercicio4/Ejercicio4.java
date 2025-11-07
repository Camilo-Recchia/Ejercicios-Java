/*
 *Descripción: Programa para Calculo de nota 
 *Autor: Camilo Villarroel Recchia
 *Fecha: 31/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		final int ALUMNOS = 4, ASIGNATURAS = 5;

		int notaMinima, notaMaxima, notaMedia = 0;

		int[][] notas = new int[ALUMNOS][ASIGNATURAS];

		System.out.println("Programa para Calculo de nota.\n------------------------------");

		// Inicializacion de datos en el array.

		for (int alumno = 0; alumno < ALUMNOS; alumno++) {

			System.out.println("\nNotas del " + (alumno + 1) + " alumno. ");

			for (int asignatura = 0; asignatura < 5; asignatura++) {

				System.out.print("Nota " + (asignatura + 1) + "ª: ");

				notas[alumno][asignatura] = teclado.nextInt();

				while (notas[alumno][asignatura] > 10 || notas[alumno][asignatura] < 1) {

					System.out.print("Ese dato no es valido. Por favor inserte uno valido: ");
					notas[alumno][asignatura] = teclado.nextInt();

				}

			}
		}

		// Lectura del array para buscar maximos, minimos y medias.

		for (int alumno = 0; alumno < ALUMNOS; alumno++) {

			notaMinima = notas[alumno][0];

			notaMaxima = notas[alumno][0];

			for (int asignatura = 0; asignatura < 5; asignatura++) {

				if (notas[alumno][asignatura] < notaMinima) {
					notaMinima = notas[alumno][asignatura];
				}
				if (notaMaxima < notas[alumno][asignatura]) {
					notaMaxima = notas[alumno][asignatura];
				}

				notaMedia = notaMedia + notas[alumno][asignatura];

			}
			System.out.println("");
			notaMedia = notaMedia / ASIGNATURAS;

			System.out.println("alumno nº " + (alumno + 1));

			System.out.println("La nota maxima es un " + notaMaxima);
			System.out.println("La nota minima es un " + notaMinima);
			System.out.println("La nota media es un " + notaMedia);

			notaMedia = 0;

		}

	}
}