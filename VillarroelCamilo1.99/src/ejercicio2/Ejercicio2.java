package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int menuOpciones = 0;

		double pvpFitness, pvpYoga, pvpMusculacion, precioFitness = 10, precioYoga = 15, precioMusculacion = 20,
				ivaFitness, ivaYoga, ivaMusculacion, ofertaFitness, ofertaYoga, ofertaMusculacion, descuento,
				tipoMatricula, cantidadFitness, cantidadYoga, cantidadMusculacion, cantidadTotal;

		System.out.println("	GESTIÓN DE UN GIMNASIO\n	----------------------");
		System.out.println("TIPOS DE MATRICULAS: 1. FITNESS - 2. YOGA - 3. MUSCULACIÓN");
		System.out.println("Precio de la matrícula tipo 1 (FITNESS): " + precioFitness + "€");
		System.out.println("Precio de la matrícula tipo 2 (YOGA): " + precioFitness + "€");
		System.out.println("Precio de la matrícula tipo 3 (MUSCULACIÓN): " + precioMusculacion + "€");
		System.out.println("");

		do {
			System.out.println("--- MENÚ DE OPERACIONES ---");
			System.out.println("1. Calcular PVP de cada matricula.");
			System.out.println("2. Aplicar oferta a un tipo de matricula (sin iva).");
			System.out.println("3. Calcular el importe total de matriculas realizadas (sin iva).");
			System.out.println("4. Salir");
			System.out.print("Seleccione una opción: ");
			menuOpciones = teclado.nextInt();

			if (menuOpciones == 1) {

				System.out.print("\nIngrese el IVA para el tipo de matrícula 1 (4 - 10 - 21): ");
				ivaFitness = teclado.nextInt();

				System.out.print("\nIngrese el IVA para el tipo de matrícula 2 (4 - 10 - 21): ");
				ivaYoga = teclado.nextInt();

				System.out.print("\nIngrese el IVA para el tipo de matrícula 3 (4 - 10 - 21): ");
				ivaMusculacion = teclado.nextInt();

				pvpFitness = precioFitness + (precioFitness * (ivaFitness / 100));

				pvpYoga = precioYoga + (precioYoga * (ivaYoga / 100));

				pvpMusculacion = precioMusculacion + (precioMusculacion * (ivaMusculacion / 100));

				System.out.println("\nEl PVP de la actividad de Fitness es: " + pvpFitness);
				System.out.println("El PVP de la actividad de Yoga es: " + pvpYoga);
				System.out.print("El PVP de la actividad de Musculación es: " + pvpMusculacion);
				System.out.println("\n");
			} else if (menuOpciones == 2) {

				System.out.print(" Seleccione tipo de matrícula (1. Fitness, 2. Yoga o 3. Musculación): ");
				tipoMatricula = teclado.nextDouble();

				System.out.print("Ingrese el % de descuento a aplicar:");
				descuento = teclado.nextDouble();

				if (tipoMatricula == 1) {

					ofertaFitness = precioFitness - (precioFitness * (descuento / 100));

					System.out.println(" El precio final (sin iva) con descuento para el tipo de matrícula 1 es: "
							+ ofertaFitness);

				} else if (tipoMatricula == 2) {

					ofertaYoga = precioYoga - (precioYoga * (descuento / 100));

					System.out.println(
							" El precio final (sin iva) con descuento para el tipo de matrícula 2 es: " + ofertaYoga);

				} else if (tipoMatricula == 3) {

					ofertaMusculacion = precioMusculacion - (precioMusculacion * (descuento / 100));

					System.out.println(" El precio final (sin iva) con descuento para el tipo de matrícula 3 es: "
							+ ofertaMusculacion);
				} else {
					System.out.println("Esa matricula no es valida.");
				}

			} else if (menuOpciones == 3) {

				System.out.print("Ingrese las matrículas realizadas para el tipo de matrícula 1: ");
				cantidadFitness = teclado.nextDouble();

				System.out.print("Ingrese las matrículas realizadas para el tipo de matrícula 2: ");
				cantidadYoga = teclado.nextDouble();

				System.out.print("Ingrese las matrículas realizadas para el tipo de matrícula 3: ");
				cantidadMusculacion = teclado.nextDouble();

				cantidadTotal = cantidadMusculacion * 20 + cantidadYoga * 15 + cantidadFitness * 10;

				System.out.println("El importe total (sin iva) de las matrículas realizadas es: " + cantidadTotal+"\n");

			} else if (menuOpciones < 1 || menuOpciones > 4) {
				System.out.println("\nOpción no válida. Intente de nuevo.\n");
			}

		} while (menuOpciones != 4);

		System.out.println(" Saliendo del programa...");

	}
}
