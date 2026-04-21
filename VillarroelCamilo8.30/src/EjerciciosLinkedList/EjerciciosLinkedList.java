package EjerciciosLinkedList;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import EjercicioArrayList.ComparadorPorNombreyGrupo;
import EjercicioArrayList.EjercicioArrayList;
import EjercicioArrayList.Registro;

public class EjerciciosLinkedList extends EjercicioArrayList {

	public static void main(String[] args) {

		// Creamos un metodo que nos genere un nuevo objeto tipo Scanner para poder
		// recorrer nuestro archivo facilmente en mi caso este metodo se encuentra en:
		// EjerciciosArrayList

		// Creamos un objeto de tipo file que apunta en la direccion de nuestro txt

		File archivo = new File("notas1.txt");

		Scanner lector = generadorLector(archivo);

		LinkedList<Registro> list = generadorLinkedListas(archivo);

		System.out.printf("La lista tiene %d lineas", list.size());

		System.out.println("\nOrdenado lista...");
		
		ordenadorPorNombre(list);
		
		
		
		
		

	}

	// Genera una lista con todos los datos de un archivo
	public static LinkedList<Registro> generadorLinkedListas(File archivo) {

		LinkedList<Registro> list = new LinkedList<Registro>();

		Scanner lector = generadorLector(archivo);

		while (lector.hasNextLine()) {

			list.add(generadorAlumnos((lector.nextLine()).split(";")));

		}

		return list;
	}

	// Ordeana por nombre una lista
	public static LinkedList<Registro> ordenadorPorNombre(LinkedList<Registro> list) {

		Collections.sort(list, new ComparadorPorNombreyGrupo());

		return list;

	}

}
