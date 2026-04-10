package ExamenUltimo;

import java.time.LocalDate;
import java.util.LinkedHashSet;

public class Principal {

	public static void main(String[] args) {

		// 1. Crea un libro digital con 3.5 Mb de tamaño y formato PDF. Los demás
		// valores por defecto.

		LibroDigital libro1 = null;

		try {
			libro1 = generadorLibroDigital(null, 3.5, "PDF");
		} catch (IllegalArgumentException e) {
			System.out.printf("%s", e.getMessage());
		}

		System.out.println(libro1.toString());

		// 2. Modi􀀂ca la fecha de publicación a 20/12/2030.

		try {
			libro1.setFecha(LocalDate.of(2030, 12, 30));
		} catch (IllegalArgumentException e) {
			System.out.printf("%s", e.getMessage());
		}
		System.out.println(libro1.toString());

		// Crea un libro físico con 350 páginas y tapa dura. Los demás valores por
		// defecto.

		LibroFisico libro2 = null;

		try {
			libro2 = generadorLibroFisico(null, 350, "Dura");
		} catch (IllegalArgumentException e) {
			System.out.printf("%s", e.getMessage());
		}
		System.out.println(libro2.toString());

		// 4. Crea 20 libros físicos con número aleatorio de páginas entre -50 y 50
		// páginas y agrégalos
		// a una colección que controle los duplicados a través del identi􀀂cador.

		LinkedHashSet<LibroFisico> list = new LinkedHashSet<LibroFisico>();

		for (int i = 0; i < 20; i++) {
			LibroFisico libros = null;

			try {
				libros = generadorLibroFisico(null, numeroR(), null);
			} catch (IllegalArgumentException e) {
				System.out.printf("\n%s", e.getMessage());
			}
			list.add(libros);
		}

		System.out.println("\n" + list.toString());

		// 5. Crea 10 libros digitales con valores por defecto y agrégalos a la
		// colección anterior.

		for (int i = 0; i < 10; i++) {
			LibroDigital libros2 = generadorLibroDigital(null, 0, null);
			list.add(libro2);
		}
		System.out.println("\n" + list.toString());
		
	}

	public static LibroFisico generadorLibroFisico(String genero, int nPaginas, String tapa) {

		if (tapa == null) {
			tapa = "blanda";
		}

		if (genero == null) {
			genero = Libro.GENERO_DEFAULT;
		}

		LibroFisico libro;
		return libro = new LibroFisico(Libro.NOMBRE_DEFAULT, Libro.TITULO_DEFAULT, Libro.FECHA_DEFAULT, genero,
				Libro.DISPONIBILIDAD_DEFAULT, nPaginas, tapa);
	}

	public static LibroDigital generadorLibroDigital(String genero, double tamanno, String formato) {

		if (formato == null) {
			formato = "epub";
		}

		if (genero == null) {
			genero = Libro.GENERO_DEFAULT;
		}

		LibroDigital libro;
		return libro = new LibroDigital(Libro.NOMBRE_DEFAULT, Libro.TITULO_DEFAULT, Libro.FECHA_DEFAULT, genero,
				Libro.DISPONIBILIDAD_DEFAULT, tamanno, formato);
	}

	public static int numeroR() {
		return java.util.concurrent.ThreadLocalRandom.current().nextInt(-50, 51);
	}

}
