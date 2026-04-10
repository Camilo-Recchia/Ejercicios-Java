package EjercicioArrayList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class EjercicioArrayList {

	public static void main(String[] args) {

		Registro alumno;

		ArrayList<Registro> list = new ArrayList<Registro>();

		// Ejercicio 1:

		File archivo = new File("notas1.txt");

		File archivo2 = new File("notas2.txt");

		// Ejercicio 2:

		System.out.printf("El archvio tiene %d lineas", contadorLineas(archivo));

		// Ejercicio 3:

		list = generadorListas(archivo);

		list = ordenadorPorNombreyGrupo(list);

		generadorDeArchivos(list, "ArrayList3.txt");

		System.out.println();
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}

		// Ejercicio 4

		alumno = generadorAlumnos(("1º ESO B;Duarte Durán, Alba;2;3;4;1;3").split(";"));

		list.add(alumno);

		// Ejercicio 5

		alumno = generadorAlumnos(("1º ESO B;Duarte Durán, Alba;2;3;4;1;3").split(";"));

		list.add(list.size() / 2, alumno);

		// Ejercicio 6

		System.out.printf("\n\nEl ultimo objeto añadido esta en la posicion: %d", list.indexOf(alumno));

		// Ejercicio 7

		ArrayList<Registro> list2 = new ArrayList<Registro>();

		list2 = generadorListas(archivo2);

		list.addAll(list2);

		list = ordenadorPorNombreyGrupo(list);

		generadorDeArchivos(list, "ArrayList7.txt");

		// Ejercicio 8

		try {

			System.out.printf("\nInformacion: %s", busquedaPorNombre("Cordero Benítez, Alejandro", list));

		} catch (IllegalAccessError ex) {

			System.out.printf("%s", ex.getMessage());
		}

		// Ejercicio 9

		try {

			System.out.printf("\n\nInformacion: %s", busquedaPorNombre("Fernández Villalón, Carlos", list));

		} catch (IllegalAccessError ex) {

			System.out.printf("%s", ex.getMessage());
		}

		// Ejercicio 10

		int mediaLista = (list.size() / 2) + 1;

		System.out.printf("\n\nEl registro nº %d sera eliminado.\nSu información es: %s", mediaLista,
				list.get(mediaLista).toString());

		System.out.println("\n\nBorrando...");

		list.remove(mediaLista);

		// Ejercicio 11

		ArrayList<Registro> eliminados = new ArrayList<Registro>();

		for (int i = 0; i < 10; i++) {
			eliminados.add(list.get(0));
			list.remove(0);

		}

		generadorDeArchivos(eliminados, "ArrayList11.txt");

		// Ejercicio 12

		ArrayList<Registro> elimina2 = new ArrayList<>();

		for (Iterator<Registro> iterator = list.iterator(); iterator.hasNext();) {
			Registro registro = iterator.next();

			if (registro.getNotas()[0] == 2) {
				elimina2.add(registro);
				iterator.remove();
			}
		}

		generadorDeArchivos(elimina2, "ArrayList12.txt");
		System.out.printf("elimina2 size: %d", elimina2.size());

		// Ejercicio 13

		System.out.println();

		ArrayList<Registro> notaMedia = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			System.out.printf("Alumno: %s | Media: %.2f\n", list.get(i).getNombre(), list.get(i).calcularMedia());
			notaMedia.add(list.get(i));
		}

		generadorDeArchivos(notaMedia, "ArrayList13.txt");

		// Ejercicio 14

		ArrayList<Registro> esoA = new ArrayList<>();
		ArrayList<Registro> esoB = new ArrayList<>();
		ArrayList<Registro> esoC = new ArrayList<>();
		ArrayList<Registro> esoD = new ArrayList<>();
		ArrayList<Registro> esoE = new ArrayList<>();

		for (Registro registro : list) {
			switch (registro.getCurso()) {
			case "1º ESO A": {
				esoA.add(registro);

				break;
			}
			case "1º ESO B": {
				esoB.add(registro);
				break;
			}
			case "1º ESO C": {
				esoC.add(registro);
				break;
			}
			case "1º ESO D": {
				esoD.add(registro);
				break;
			}
			case "1º ESO E": {
				esoE.add(registro);
				break;
			}
			}
		}

		ordenadorPorNombreyGrupo(esoA);
		ordenadorPorNombreyGrupo(esoB);
		ordenadorPorNombreyGrupo(esoC);
		ordenadorPorNombreyGrupo(esoD);
		ordenadorPorNombreyGrupo(esoE);

		generadorDeArchivos(esoA, "1º ESO A_ordenado_por_nombre_descendente.txt");
		generadorDeArchivos(esoB, "1º ESO B_ordenado_por_nombre_descendente.txt");
		generadorDeArchivos(esoC, "1º ESO C_ordenado_por_nombre_descendente.txt");
		generadorDeArchivos(esoD, "1º ESO D_ordenado_por_nombre_descendente.txt");
		generadorDeArchivos(esoE, "1º ESO E_ordenado_por_nombre_descendente.txt");

		// Ejercicio 15

		double[] mediasA = mediasPorMateria(esoA);
		double[] mediasB = mediasPorMateria(esoB);
		double[] mediasC = mediasPorMateria(esoC);
		double[] mediasD = mediasPorMateria(esoD);
		double[] mediasE = mediasPorMateria(esoE);

		generadorDeArchivosPorMedia(mediasA, "arraylist15_1º ESO A Anotas_medias.txt");
		generadorDeArchivosPorMedia(mediasB, "arraylist15_1º ESO B Anotas_medias.txt");
		generadorDeArchivosPorMedia(mediasC, "arraylist15_1º ESO C Anotas_medias.txt");
		generadorDeArchivosPorMedia(mediasD, "arraylist15_1º ESO D Anotas_medias.txt");
		generadorDeArchivosPorMedia(mediasE, "arraylist15_1º ESO E Anotas_medias.txt");

	}

	// Busqueda de informacion segun el nombre
	public static Registro busquedaPorNombre(String nombre, ArrayList<Registro> list) throws IllegalAccessError {

		Registro alumno = null;

		for (Registro registro : list) {
			if (registro.getNombre().equalsIgnoreCase(nombre)) {

				alumno = registro;
			}
		}

		return alumno;

	}

	// Generador de archivos generico
	public static void generadorDeArchivosPorMedia(double[] medias, String nombre) {

		try (FileWriter archivo = new FileWriter(nombre)) {

			archivo.append("Mates: " + medias[0] + "\nLengua: " + medias[1] + "\nFisica: " + medias[2] + "\nQuimica: "
					+ medias[3] + "\nIngles: " + medias[4]);

		} catch (IOException ex) {
			System.out.printf("%s", ex.getMessage());
		}

	}

	// Genera un archivo
	public static void generadorDeArchivos(ArrayList<Registro> list, String nombre) {
		try (FileWriter archivo = new FileWriter(nombre)) {

			for (int i = 0; i < list.size(); i++) {
				int[] notas = list.get(i).getNotas();
				String notaS = notas[0] + ";" + notas[1] + ";" + notas[2] + ";" + notas[3] + ";" + notas[4];

				archivo.append(list.get(i).getCurso()).append(";").append(list.get(i).getNombre()).append(";")
						.append(notaS).append("\n");
			}

		} catch (IOException ex) {
			System.out.printf("%s", ex.getMessage());
		}
	}

	// Genera un objeto tipo Scanner para leer el archivo
	public static Scanner generadorLector(File archivo) {

		Scanner lector = null;

		try {

			lector = new Scanner(archivo);

		} catch (IOException ex) {

			System.out.printf("%s", ex.getMessage());

		}

		return lector;
	}

	// Genera un nuevo alumno
	public static Registro generadorAlumnos(String[] valores) {

		int[] notas = { Integer.parseInt(valores[2]), Integer.parseInt(valores[3]), Integer.parseInt(valores[4]),
				Integer.parseInt(valores[5]), Integer.parseInt(valores[6]) };

		Registro alumno = new Registro(valores[0], valores[1], notas);

		return alumno;

	}

	// Devuelve la cantidad de lines de un archivo
	public static int contadorLineas(File archivo) {

		int contadorLineas = 0;

		Scanner lector = generadorLector(archivo);

		while (lector.hasNextLine()) {
			lector.nextLine();
			contadorLineas++;
		}

		return contadorLineas;

	}

	// Genera una lista con todos los datos de un archivo
	public static ArrayList<Registro> generadorListas(File archivo) {

		ArrayList<Registro> list = new ArrayList<Registro>();

		Scanner lector = generadorLector(archivo);

		while (lector.hasNextLine()) {

			list.add(generadorAlumnos((lector.nextLine()).split(";")));

		}

		return list;
	}

	// Ordeana por curso y nombre una lista
	public static ArrayList<Registro> ordenadorPorNombreyGrupo(ArrayList<Registro> list) {

		Collections.sort(list, new ComparadorPorNombre());

		return list;

	}

	// Ordeana por nombre una lista
	public static ArrayList<Registro> ordenadorPorNombre(ArrayList<Registro> list) {

		Collections.sort(list, new ComparadorPorNombreyGrupo());

		return list;

	}

	// Devuelve un array con las notas medias de cada asignatura
	public static double[] mediasPorMateria(ArrayList<Registro> list) {

		double matematicas = 0;
		double lengua = 0;
		double fisica = 0;
		double quimica = 0;
		double ingles = 0;

		for (Registro registro : list) {
			matematicas += registro.getNotas()[0];
			lengua += registro.getNotas()[1];
			fisica += registro.getNotas()[2];
			quimica += registro.getNotas()[3];
			ingles += registro.getNotas()[4];
		}

		matematicas = matematicas / list.size();
		lengua = lengua / list.size();
		fisica = fisica / list.size();
		quimica = quimica / list.size();
		ingles = ingles / list.size();

		double[] medias = { matematicas, lengua, fisica, quimica, ingles };

		return medias;

	}

}
