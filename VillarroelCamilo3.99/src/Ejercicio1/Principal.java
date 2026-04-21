package Ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		solicitarAlumnos(teclado);

	}

	public static void solicitarAlumnos(Scanner teclado) {

		String nom;

		do {

			System.out.print("\n\nIntroduzca el nombre del alumno: ");

			nom = teclado.nextLine();

			if (!nom.equalsIgnoreCase("fin")) {

				System.out.printf("La nota media del alumno %s es: %d", nom, calcularMedia(solicitarNotas(teclado)));

			}

			teclado.nextLine();

		} while (!nom.equalsIgnoreCase("fin"));
	}

	public static double[] solicitarNotas(Scanner teclado) {
		double[] notas = new double[4];

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("\nNota de curso %dº:", (i + 1));
			notas[i] = teclado.nextDouble();

			if (notas[i] > 10 || notas[i] < 0) {
				while (notas[i] > 10 || notas[i] < 0) {
					System.out.printf("Valor invalido, intoduzcalo de nuevo: ");
					notas[i] = teclado.nextDouble();
				}
			}
		}

		return notas;
	}

	public static int calcularMedia(double[] notas) {

		double media = 0;

		for (int i = 0; i < notas.length; i++) {
			media += notas[i];
		}

		return (int) Math.round(media / notas.length);
	}

}
