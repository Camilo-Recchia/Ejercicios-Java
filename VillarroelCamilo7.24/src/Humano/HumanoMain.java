package Humano;

import java.util.Scanner;

public class HumanoMain {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Humano h1 = new Humano("Camilo", "Villarroel Recchia");
		Humano h2 = new Ciudadano("Alexis", "Beboteo Jonsales", "04321197a");
		Humano h3 = new Ciudadano("Rafita", "Maestro", "00000000T");

		System.out.printf("Humano 1: %s", h1.toString());
		System.out.println();

		System.out.printf("Humano 2: %s", h2.toString());
		System.out.println();

		System.out.printf("Humano 3: %s", h3.toString());
		System.out.println();

		Humano h4;

		boolean comprobador = false;
		do {
			try {

				System.out.print("Dime tu nombre: ");
				String nombre = teclado.nextLine();

				System.out.print("Dime tus apellidos: ");
				String apellidos = teclado.nextLine();

				System.out.print("Dime tu docuemnto: ");
				String documento = teclado.nextLine();

				h4 = new Ciudadano(nombre, apellidos, documento);

				comprobador = true;

			} catch (Exception ex1) {
				System.out.println();
				System.out.printf("%s", ex1.getMessage());
				System.out.println();
				h4 = new Humano();

				comprobador = false;
			}

		} while (comprobador != true);

		System.out.printf("Humano 4: %s", h4.toString());
		System.out.println();

		teclado.close();
	}

}
