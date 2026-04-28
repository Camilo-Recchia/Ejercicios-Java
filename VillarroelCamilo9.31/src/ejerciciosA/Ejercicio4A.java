package ejerciciosA;

import java.io.File;

public class Ejercicio4A {

	public static void main(String[] args) {

		File MisCosas = new File("C:\\Users\\DAM1\\Downloads\\Documentos\\DOCS\\Mis Cosas");
		File Alfabeto = new File("C:\\Users\\DAM1\\Downloads\\Documentos\\DOCS\\Alfabeto");

		Alfabeto.mkdir();
		MisCosas.mkdir();

		File letras = new File("C:\\Users\\DAM1\\Downloads\\Documentos\\DOCS\\Alfabeto\\A");
		letras.mkdir();

		for (int i = 65; i < 90 || i == 165; i++) {
			letras.renameTo(new File("C:\\Users\\DAM1\\Downloads\\Documentos\\DOCS\\Alfabeto\\" + (char) i));
			letras.mkdir();
		}

	}

}
