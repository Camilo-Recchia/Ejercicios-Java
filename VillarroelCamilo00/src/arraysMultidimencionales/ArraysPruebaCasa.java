package arraysMultidimencionales;

public class ArraysPruebaCasa {

	public static void main(String[] args) {

		// Inicialización de constantes para el tamaño del array
		final int MESES = 12, DIAS = 30;

		// Inicialización de variables para el calcuilo de la amplitud
		int tempMin, tempMax, amplitud, menorA_10, contador, diaMenorQue_10;

		// Inicialización del array principal
		int[][] temperatura = new int[MESES][DIAS];

		// Bucle que insterta los 360 datos en el Array
		for (int mes = 0; mes < 12; mes++) {
			for (int dia = 0; dia < 30; dia++) {
				temperatura[mes][dia] = (int) (Math.random() * 40);
			}
		}

		// Bucle que muestra todos los datos del Array ordenados en distintos meses
		for (int mes = 0; mes < 12; mes++) {
			System.out.print("\nMes " + (mes + 1) + ": ");
			if (mes < 9) // Arreglo de la posiciñon de los primeros dias
				System.out.print(" ");
			for (int dia = 0; dia < 30; dia++) {

				System.out.print(" \t" + temperatura[mes][dia] + " ");

			}
		}

		System.out.println("");

		// Bucle para buscar las temperaturas minimas y maximas de todo el mes.
		for (int mes = 0; mes < 12; mes++) {

			// Inicializamos las variables a la primera temperatura del mes, asi trabajamos con valores reales
			tempMax = temperatura[mes][0];
			tempMin = temperatura[mes][0];

			for (int dia2 = 0; dia2 < 30; dia2++) {

				if (temperatura[mes][dia2] > tempMax) {

					tempMax = temperatura[mes][dia2];

				}

				if (temperatura[mes][dia2] < tempMin) {

					tempMin = temperatura[mes][dia2];
				}

			}

			menorA_10 = temperatura[mes][0];
			contador = 0;
			diaMenorQue_10 = 0;

			// Bucle para calcular el primer dia con una temoperatura menor a 10º
			while (menorA_10 > 10) {

				menorA_10 = temperatura[mes][contador];
				contador++;
				diaMenorQue_10 = contador;
			}

			amplitud = tempMax - tempMin;

			System.out.println("\nLa temperatura maxima del mes " + (mes + 1) + " fue de " + tempMax + "º.");
			System.out.println("La temperatura minima del mes " + (mes + 1) + " fue de " + tempMin + "º.");
			System.out.println("La amplitud termica del mes " + (mes + 1) + " fue de " + amplitud + "º.");
			System.out.println("El primer dia en el que la temperatura fue menor a 10º fue el dia " + (diaMenorQue_10)
					+ " con " + menorA_10 + "º");

		}

	}

}