package ejerciciosA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio1A {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Escribe la ruta: ");
		try {
			muestraInfoRuta(new File(teclado.nextLine()));
		} catch (FileNotFoundException ex) {
			System.out.printf("%s", ex.getMessage());
		}

		teclado.close();
	}

	public static void muestraInfoRuta(File ruta) throws FileNotFoundException {

		if (ruta.isFile()) {
			System.out.println("Archivo: " + ruta.getName());
		} else if (ruta.isDirectory()) {
			System.out.println("Directorio: " + ruta.getName());

			File[] contenido = ruta.listFiles();
			if (contenido == null || contenido.length == 0) {
				System.out.println("(Vacío)");

			}

			System.out.println("Carpetas:");
			for (File f : contenido) {
				if (f.isDirectory()) {
					System.out.println(" - " + f.getName());
				}
			}

			System.out.println("Archivos:");
			for (File f : contenido) {
				if (f.isFile()) {
					System.out.println(" - " + f.getName());
				}
			}
		}
		if (!ruta.exists()) {
			throw new FileNotFoundException("El fichero no fue encontrado");
		}

	}
}