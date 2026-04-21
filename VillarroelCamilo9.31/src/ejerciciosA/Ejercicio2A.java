package ejerciciosA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio2A {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Escribe la ruta: ");
		String nom = teclado.nextLine();

		boolean info;
		System.out.print("Escribe 0 (false) o 1 (true): ");
		if (teclado.nextInt() == 1) {
			info = true;
		} else {
			info = false;
		}

		try {
			muestraInfoRuta(new File(nom), info);
		} catch (FileNotFoundException ex) {
			System.out.printf("%s", ex.getMessage());
		}

		teclado.close();
	}

	public static void muestraInfoRuta(File ruta, boolean info) throws FileNotFoundException {

		if (ruta.isFile()) {
			System.out.println("Archivo: " + ruta.getName());
		} else if (ruta.isDirectory()) {
			System.out.println("Directorio: " + ruta.getName());

			File[] contenido = ruta.listFiles();
			if (contenido == null || contenido.length == 0) {
				System.out.println("(Vacío)");

			}

			ArrayList<File> list = new ArrayList<File>();

			for (int i = 0; i < contenido.length; i++) {
				list.add(contenido[i]);
			}

			Collections.sort(list, new ComparadorDeNombres());

			System.out.println("Carpetas:");
			for (File f : contenido) {
				if (f.isDirectory()) {
					System.out.println(" - " + f.getName());
					if (info) {
						System.out.printf(" - espacio: %d - Ultima modificacion: %d\n", f.getTotalSpace(),
								f.lastModified());

					}
				}
			}

			System.out.println("Archivos:");
			for (File f : contenido) {
				if (f.isFile()) {
					System.out.println(" - " + f.getName());
					if (info) {
						System.out.printf(" - espacio: %d - Ultima modificacion: %d\n", f.getTotalSpace(),
								f.lastModified());

					}
				}
			}
		}
		if (!ruta.exists()) {
			throw new FileNotFoundException("El fichero no fue encontrado");
		}

	}
}