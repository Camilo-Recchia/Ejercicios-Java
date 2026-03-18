package pruebaExamenMañana;

import java.time.LocalDate;
import java.util.Scanner;

import pruebaExamenMañana.Pelicula.Genero;

public class MainPelicula {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Pelicula[] peliculas = new Pelicula[100];

		Pelicula pelicula1 = new Pelicula("MadMax", (short) 128, LocalDate.of(1987, 11, 11), (double) 7.5,
				Genero.ACCION);

		int años = LocalDate.now().getYear() - pelicula1.getRealizacion().getYear();

		System.out.printf("La pelicula fue creada hace %d %s", años, años == 1 ? "año" : "años");
		System.out.println();

		try {
			pelicula1.setCalificacion((Math.random() * 10) + 5);
		} catch (Exception ex) {
			System.out.printf("No se pudo establecer esa calificacion porque: %s", ex.getMessage());
		}
		System.out.println();
		if (pelicula1.getRealizacion().getYear() < 5 && pelicula1.getCalificacion() > 5) {
			System.out.println("La pelicula es recomendable");
		} else {
			System.out.println("La pelicula no es recomendable");
		}

		System.out.print("Dime el nombre de la pelicula: ");
		String nombre = teclado.nextLine();
		System.out.print("Dime la furacion de la pelicula (MAX: 180): ");
		short duracion = teclado.nextShort();
		teclado.nextLine();
		System.out.println("Dime el dia, año y mes de la publicacion de la pelicula: ");
		System.out.print("Dia:");
		int dia = teclado.nextInt();
		System.out.print("Año:");
		int anno = teclado.nextInt();
		System.out.print("Mes:");
		int mes = teclado.nextInt();
		System.out.print("Dime la calificacion de la pelicula: ");
		double calificaicon = teclado.nextDouble();
		teclado.nextLine();
		System.out.print("Ingrese el género (ACCION, COMEDIA, DRAMA, SUSPENSE): ");
		String generoStr = teclado.nextLine();

		// Convertir la cadena al valor del enum
		Genero genero = null;
		try {
			genero = Genero.valueOf(generoStr.toUpperCase()); // Asegurarse de que la cadena esté en mayúsculas
		} catch (IllegalArgumentException e) {
			System.out.printf("%s", e.getMessage());
		}
		Pelicula pelicula2 = new Pelicula(nombre, duracion, LocalDate.of(anno, mes, dia), calificaicon, genero);

		for (int i = 0; i < 100; i++) {
			try {
				System.out.println("Pelicula" + (i + 1) + " creada");
				double calificacion = (double) ((Math.random() * 10) + 5);
				peliculas[i] = new Pelicula("Ejemplo", (short) 60, LocalDate.now(), calificacion, Genero.SUSPENSE);

			} catch (Exception ex1) {
				System.out.printf(
						"La pelicula %d no pudo crearse debido a que: %s. Porende esta no cueta para los valores generales.",
						(i + 1), ex1.getMessage());
				System.out.println("");
			}
		}

		System.out.println(
				"En total las peliculas de suspense duran: " + pelicula1.getDuracion_peliculas_suspense() + " Minutos");
		System.out.println("En total las peliculas duran: " + pelicula1.getDuracion_peliculas() + " Minutos");

	}
}
