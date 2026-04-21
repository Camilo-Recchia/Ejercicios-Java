package ejerciciosA;

import java.io.File;

public class Ejercicio3A {

	public static void main(String[] args) {
		File DOCS = new File("C:\\Users\\DAM1\\Downloads\\Documentos\\Documentos");
		File FOTOS = new File("C:\\Users\\DAM1\\Downloads\\Documentos\\Documentos\\Fotografias");
		File LECTURAS = new File("C:\\Users\\DAM1\\Downloads\\Documentos\\Documentos\\Libros");

		File DOCS1 = new File("C:\\Users\\DAM1\\Downloads\\Documentos\\DOCS");
		File FOTOS1 = new File("C:\\Users\\DAM1\\Downloads\\Documentos\\Documentos\\FOTOS");
		File LECTURAS1 = new File("C:\\Users\\DAM1\\Downloads\\Documentos\\Documentos\\LECTURAS");

		DOCS.renameTo(DOCS1);
		FOTOS.renameTo(FOTOS1);
		LECTURAS.renameTo(LECTURAS1);

//		DOCS1.renameTo(DOCS);
//		FOTOS1.renameTo(FOTOS);
//		LECTURAS1.renameTo(LECTURAS);

	}
}
