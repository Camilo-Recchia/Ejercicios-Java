/*
 *Descripción: Calculo del 1º día más caluroso del año.
 *Autor: Camilo Villarroel Recchia
 *Fecha: 22/10/2025
 */
package arraysMultidimencionales;

import java.util.Arrays;

public class DiasArray {

	public static void main(String[] args) {

		int mayorCalor = 0, menorCalor = 0, amplitud, temperaturaDiaMasCaluroso, diaMasCaluroso = 0;

		String mesDiaMasCaluroso = " ";

		int[][] temperaturas = new int[12][30];

		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		System.out.println(
				"          Aplicación para el caulculo del la amplitud termica en todo el año \n---------------------------------------------------------------------------------");

		for (int mes = 0; mes < 12; mes++) {

			System.out.print("\nMes " + (mes + 1) + ": ");

			for (int dia = 0; dia < 30; dia++) {

				temperaturas[mes][dia] = (int) (Math.random() * 40);

				System.out.print(" " + temperaturas[mes][dia] + "\t");
			}

		}
		System.out.println("");

		for (int mes1 = 0; mes1 < 12; mes1++) {

			mayorCalor = temperaturas[mes1][0];
			menorCalor = temperaturas[mes1][0];

			for (int dia1 = 0; dia1 < 30; dia1++) {

				if (mayorCalor < temperaturas[mes1][dia1]) {

					mayorCalor = temperaturas[mes1][dia1];

				}

				if (menorCalor > temperaturas[mes1][dia1]) {

					menorCalor = temperaturas[mes1][dia1];
				}

			}

			amplitud = mayorCalor - menorCalor;

			System.out.printf(
					"\n\nLa temperatura minima del %dº mes es de %d y con una temperatura maxima de %d. Y la amplitud termica es de %d",
					(mes1 + 1), menorCalor, mayorCalor, amplitud);

		}

		temperaturaDiaMasCaluroso = temperaturas[0][0];

		for (int mes = 0; mes < 12; mes++) {

			for (int dia = 0; dia < 30; dia++) {

				if (temperaturas[mes][dia] > temperaturaDiaMasCaluroso) {

					temperaturaDiaMasCaluroso = temperaturas[mes][dia];

					mesDiaMasCaluroso = meses[mes];

					diaMasCaluroso = (dia + 1);

				}

			}
		}
		
		Arrays.fill(temperaturas[1], 1);

		System.out.printf("\n\nEl dia más caluroso fue el %d de %s , con una temperatura de %dº", diaMasCaluroso,
				mesDiaMasCaluroso, temperaturaDiaMasCaluroso);

	}
}
