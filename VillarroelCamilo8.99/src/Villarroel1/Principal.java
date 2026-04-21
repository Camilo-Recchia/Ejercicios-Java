package Villarroel1;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {

		// 1. Crea un libro con valores por defecto exemto el autor

		Libro libro1 = null;

		try {
			libro1 = new Libro("Villarroel");
		} catch (IllegalArgumentException ex) {
			System.out.printf("\n%s", ex.getMessage());
		}

		System.out.println(libro1.toString());

		// 2. Calcula el precio para el libro por 10 dias

		try {
			System.out.printf("\n%.2f", libro1.getPrecio(10));
		} catch (IllegalArgumentException ex) {
			System.out.printf("\n%s", ex.getMessage());
		}

		// 3. Crea una revista con valores por defecto

		Revista revista1 = null;

		try {
			revista1 = new Revista();
		} catch (IllegalArgumentException ex) {
			System.out.printf("\n%s", ex.getMessage());
		}

		System.out.println(revista1.toString());

		// 4. Calcula el precio para la revista por 5 dias

		try {
			System.out.printf("\n%.2f", revista1.getPrecio(5));
		} catch (IllegalArgumentException ex) {
			System.out.printf("\n%s", ex.getMessage());
		}

		// 5.

		boolean comprobador = true;

		while (comprobador) {
			try {
				comprobador = false;
				libro1.setPublicacion(LocalDate.of(((int) (Math.random() * 20) + 1940), 01, 01));
			} catch (IllegalArgumentException ex) {
				System.out.printf("\n\n%s", ex.getMessage());
				comprobador = true;
			}
		}

		System.out.printf("\n\nEl nuevo valor de fecha del libro es: %d/%d/%d", libro1.getPublicacion().getDayOfMonth(),
				libro1.getPublicacion().getMonthValue(), libro1.getPublicacion().getYear());

	}

}
