package EjercicioHashSet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class EjerciciosHashSet {

	public static void main(String[] args) {

		File notas1 = new File("notas1hs.txt");
		File notas2 = new File("notas2hs.txt");
		File notas3 = new File("notas3hs.txt");

		HashSet<RegistroHS> conjunto = new HashSet<>();

		// 1. Importa los registros de notas1hs.txt al HashSet
		System.out.println("1. Añadiendo registros de notas1hs.txt al conjunto...");
		conjunto = generadorHashSet(notas1);

		// 2. Muestra el número de registros
		System.out.printf("2. Número de registros añadidos al conjunto: %d%n", conjunto.size());

		// 3. Ordena los registros por grupo y nombre (usando ArrayList) y exporta
		System.out.println("3. Ordenamos los objetos del conjunto por grupo y nombre mediante un ArrayList...");
		ArrayList<RegistroHS> ordenados3 = ordenarPorGrupoYNombre(conjunto);
		generadorDeArchivos(ordenados3, "HashSet3.txt");
		System.out.println("Guardamos los objetos ordenados en: HashSet3.txt");

		// 4. Añade el registro indicado (y muestra si ya estaba)
		RegistroHS juan = generadorRegistro("1º ESO A;Plaza Gallego, Juan;1;1;3;1;1".split(";"));
		System.out.println("4. Añadimos un registro: 1º ESO A;Plaza Gallego, Juan;1;1;3;1;1...");
		boolean addedJuan = conjunto.add(juan);
		if (!addedJuan) {
			System.out.printf("El registro ya está en el conjunto. Número de registros: %d%n", conjunto.size());
		} else {
			System.out.printf("Número de registros: %d%n", conjunto.size());
		}

		// 5. Añade el registro indicado
		RegistroHS francisco = generadorRegistro("1º ESO A;Suárez Cano, Francisco José;2;3;4;1;2".split(";"));
		System.out.println("5. Añadimos un registro: 1º ESO A;Suárez Cano, Francisco José;2;3;4;1;2...");
		conjunto.add(francisco);
		System.out.printf("Número de registros: %d%n", conjunto.size());

		// 6. Importa notas2hs.txt a un arraylist
		System.out.println("6. Añadiendo registros de notas2hs.txt a la lista mediante una lista auxiliar...");
		ArrayList<RegistroHS> listaAux = generadorArrayList(notas2);
		System.out.printf("Total registros de la lista auxiliar: %d%n", listaAux.size());

		// 7. Inserta los registros del arraylist en el HashSet y exporta
		System.out.println("7.Insertamos los registros contenidos en el arralist anterior en el HashSet...");
		System.out.printf("Total registros en el HashSet antes de añadir: %d%n", conjunto.size());
		conjunto.addAll(listaAux);
		System.out.printf("Total registros en el HashSet después de añadir: %d%n", conjunto.size());

		ArrayList<RegistroHS> ordenados7 = ordenarPorGrupoYNombre(conjunto);
		generadorDeArchivos(ordenados7, "HashSet7.txt");
		System.out.println("Guardamos todos los objetos del HasHSet en: HashSet7.txt");

		// 8. Comprueba que el registro del punto 4 está en el conjunto
		System.out.println("8. Comprueba que el registro del punto 4 está en el conjunto...");
		System.out.printf("El registro de Juan está en la ista: %b%n", conjunto.contains(juan));

		// 9. Comprueba que el registro del punto 5 está en el conjunto
		System.out.println("9. Comprueba que el registro del punto 4 está en el conjunto...");
		System.out.printf("El registro de Francisco José está en la lista: %b%n", conjunto.contains(francisco));

		// 10. Crea un arraylist con notas3hs.txt y exporta
		System.out.println("10. Creando ArrayList con notas3hs.txt...");
		ArrayList<RegistroHS> lista3 = generadorArrayList(notas3);
		generadorDeArchivos(lista3, "HashSet10.txt");
		System.out.println("Guardamos todos los objetos del ArrayList en: HashSet10.txt");

		// 11. Intersección HashSet + ArrayList (retainAll) y exporta
		// Consideración: retainAll modifica la colección. Para no romper el conjunto
		// original, trabajamos con una copia.
		HashSet<RegistroHS> inter11 = new HashSet<>(conjunto);
		inter11.retainAll(lista3);
		generadorDeArchivos(ordenarPorGrupoYNombre(inter11), "HashSet11.txt");
		System.out.println("Guardamos la intersección en: HashSet11.txt");

		// 12. Crea un HashSet e inserta el arraylist anterior + objetos punto 4 y 5
		HashSet<RegistroHS> conjunto2 = new HashSet<>(lista3);
		conjunto2.add(juan);
		conjunto2.add(francisco);

		// 13. Intersección de los dos HashSet y exporta
		HashSet<RegistroHS> inter13 = new HashSet<>(conjunto);
		inter13.retainAll(conjunto2);
		generadorDeArchivos(ordenarPorGrupoYNombre(inter13), "HashSet13.txt");
		System.out.println("Guardamos la intersección en: HashSet13.txt");

		// 14. Busca y muestra “Romero Farfán, Estefanía”
		System.out.println("14. Busca y muestra el registro con nombre “Romero Farfán, Estefanía”...");
		RegistroHS r14 = buscarPorNombre("Romero Farfán, Estefanía", conjunto);
		if (r14 != null) {
			System.out.println("Registro encontrado: " + r14.toString());
			System.out.println("Objeto encontrado.");
		} else {
			System.out.println("Registro no encontrado.");
			System.out.println("Objeto no encontrado.");
		}

		// 15. Busca y muestra “Gutiérrez Martín, Marina”
		System.out.println("15. Busca y muestra el registro con nombre “Gutiérrez Martín, Marina”...");
		RegistroHS r15 = buscarPorNombre("Gutiérrez Martín, Marina", conjunto);
		if (r15 != null) {
			System.out.println("Registro encontrado: " + r15.toString());
			System.out.println("Objeto encontrado.");
		} else {
			System.out.println("Registro no encontrado.");
			System.out.println("Objeto no encontrado.");
		}

		// 16. Elimina el objeto del punto 4
		System.out.println("16. Elimina el objeto insertado en el punto 4...");
		System.out.printf("Total de registros antes de eliminar: %d%n", conjunto.size());
		conjunto.remove(juan);
		System.out.printf("Total de registros después de eliminar: %d%n", conjunto.size());

		// 17. Elimina el objeto del punto 5
		System.out.println("17. Elimina el objeto insertado en el punto 5...");
		System.out.printf("Total de registros antes de eliminar: %d%n", conjunto.size());
		conjunto.remove(francisco);
		System.out.printf("Total de registros después de eliminar: %d%n", conjunto.size());

		// 18. Exporta el HashSet original (actual) a txt
		System.out.println("18. Exporta el HashSet original a un documento de texto...");
		generadorDeArchivos(ordenarPorGrupoYNombre(conjunto), "HashSet18.txt");
		System.out.println("Guardamos la lista completa en: HashSet18.txt");
	}

	// Genera un objeto Scanner para leer archivo
	public static Scanner generadorLector(File archivo) {
		Scanner lector = null;
		try {
			lector = new Scanner(archivo);
		} catch (IOException ex) {
			System.out.printf("%s%n", ex.getMessage());
		}
		return lector;
	}

	// Genera un nuevo RegistroHS a partir del split
	public static RegistroHS generadorRegistro(String[] valores) {
		int[] notas = { Integer.parseInt(valores[2]), Integer.parseInt(valores[3]), Integer.parseInt(valores[4]),
				Integer.parseInt(valores[5]), Integer.parseInt(valores[6]) };
		return new RegistroHS(valores[0], valores[1], notas);
	}

	// 1: Genera HashSet desde archivo
	public static HashSet<RegistroHS> generadorHashSet(File archivo) {
		HashSet<RegistroHS> set = new HashSet<>();
		Scanner lector = generadorLector(archivo);

		while (lector != null && lector.hasNextLine()) {
			set.add(generadorRegistro(lector.nextLine().split(";")));
		}
		return set;
	}

	// 6/10: Genera ArrayList desde archivo
	public static ArrayList<RegistroHS> generadorArrayList(File archivo) {
		ArrayList<RegistroHS> list = new ArrayList<>();
		Scanner lector = generadorLector(archivo);

		while (lector != null && lector.hasNextLine()) {
			list.add(generadorRegistro(lector.nextLine().split(";")));
		}
		return list;
	}

	// 3: Ordenar HashSet por grupo y nombre (devolvemos ArrayList ordenada)
	public static ArrayList<RegistroHS> ordenarPorGrupoYNombre(Set<RegistroHS> set) {
		ArrayList<RegistroHS> list = new ArrayList<>(set);
		Collections.sort(list, new ComparadorPorGrupoYNombreHS());
		return list;
	}

	// Exporta lista a txt en "Archivos de txt 3/"
	public static void generadorDeArchivos(List<RegistroHS> list, String nombre) {
		File carpeta = new File("Archivos de txt 3");
		if (!carpeta.exists()) {
			carpeta.mkdirs();
		}

		try (FileWriter archivo = new FileWriter("Archivos de txt 3" + File.separator + nombre)) {

			for (int i = 0; i < list.size(); i++) {
				int[] n = list.get(i).getNotas();
				String notaS = n[0] + ";" + n[1] + ";" + n[2] + ";" + n[3] + ";" + n[4];

				archivo.append(list.get(i).getGrupo()).append(";").append(list.get(i).getNombre()).append(";")
						.append(notaS).append("\n");
			}

		} catch (IOException ex) {
			System.out.printf("%s%n", ex.getMessage());
		}
	}

	// 14/15: buscar por nombre dentro del HashSet
	public static RegistroHS buscarPorNombre(String nombre, Set<RegistroHS> set) {
		for (RegistroHS r : set) {
			if (r.getNombre().equalsIgnoreCase(nombre)) {
				return r;
			}
		}
		return null;
	}
}