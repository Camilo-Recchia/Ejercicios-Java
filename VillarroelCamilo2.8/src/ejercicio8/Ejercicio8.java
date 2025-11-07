/*
 *Descripción: Aplicación de senderismo
 *Autor: Camilo Villarroel Recchia
 *Fecha: 16/10/2025
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String nombre, apellido, ciudadCaminata, ciudadRutaLarga = "rico";

		int edad, ruta, distanciaRuta, mediaCaminatas = 0, distanciaCaminata, numeroParticipantes, caminataLarga = 0,
				numeroCaminata = 0;

		System.out.print("Dime tu nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Dime tus apellidos: ");
		apellido = teclado.nextLine();
		System.out.print("Dime tu edad: ");
		edad = teclado.nextInt();

		while (edad < 45 && edad < 18) {
			System.out.println("Esa edad no es correcta, por favor intentelo de nuevo.");
			System.out.print("Dime tu edad: ");
			edad = teclado.nextInt();
		}

		System.out.print("Dime cuantas rutas has echo: ");
		ruta = teclado.nextInt();
		System.out.print("Dime la distancia de tu ultima ruta(Metros): ");
		distanciaRuta = teclado.nextInt();

		System.out.println("Ahora dime tus estos datos de tus ultimas 5 caminatas.\n");

		for (int contador = 1; contador <= 5; contador++) {
			System.out.println("\n	Caminata nº" + contador);

			System.out.print("\nDisatncia(Metros): ");
			distanciaCaminata = teclado.nextInt();
			System.out.print("Número de participantes: ");
			numeroParticipantes = teclado.nextInt();
			System.out.print("Ciudad: ");
			ciudadCaminata = teclado.nextLine();

			ciudadCaminata = teclado.nextLine();

			mediaCaminatas = mediaCaminatas + distanciaCaminata;

			if (caminataLarga < distanciaCaminata) {
				caminataLarga = distanciaCaminata;
				numeroCaminata = contador;
				ciudadRutaLarga = ciudadCaminata;
			}
		}

		mediaCaminatas = mediaCaminatas / 5;

		System.out.println("\n--------------------------------------------------------");
		System.out.println(" Nombre: " + nombre);
		System.out.println(" Edad: " + edad);
		System.out.println(" Nº Rutas realizadas: " + ruta);

		System.out.println("\n Distancia media (5 últimas rutas): " + mediaCaminatas);
		System.out.println(
				" La ruta con mayor distancia es la " + numeroCaminata + "ª con unos " + caminataLarga + " metros");
		System.out.println(" Ciudad de la ruta más larga: " + ciudadRutaLarga);
		System.out.println("--------------------------------------------------------");

	}

}
