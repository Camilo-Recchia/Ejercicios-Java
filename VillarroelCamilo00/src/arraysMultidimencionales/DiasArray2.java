/*
 *Descripción: Calculo del 1º día más caluroso del mes.
 *Autor: Camilo Villarroel Recchia
 *Fecha: 22/10/2025
 */
package arraysMultidimencionales;

public class DiasArray2 {

	public static void main(String[] args) {

		int mayorCalor = 0, menorCalor = 0, amplitud, contador = 0;

		int[][] temperaturas = new int[12][30];

		System.out.println(
				"          Aplicación para el caulculo del la amplitud termica en todo el año \n---------------------------------------------------------------------------------");

		for (int mes = 0; mes < 12; mes++) {

			for (int dia = 0; dia < 30; dia++) {

				temperaturas[mes][dia] = (int) (Math.random() * 40);
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

			System.out.println("");
			System.out.println("La temperatura minima del " + (mes1 + 1) + "º mes es de " + menorCalor);
			System.out.println("La temperatura maxima del " + (mes1 + 1) + "º mes es de " + mayorCalor);
			System.out.println("La amplitud termica es de " + amplitud + "º" + "\n");

			for (int mes3 = 0; mes3 < 12; mes3++) {

				menorCalor = temperaturas[mes3][0];
				
					while(contador<30) {
						contador++;
						if(menorCalor>)
						
						
					}

				
			}
		}
	}
}
