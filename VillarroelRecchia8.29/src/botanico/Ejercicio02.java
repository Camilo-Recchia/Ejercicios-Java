package botanico;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Ejercicio 2. Búsqueda de especies de plantas populares
 * 
 * @author Profesor
 */
public class Ejercicio02 {

	public static void main(String[] args) {

		// ----------------------------------------------
		// Declaración de variables
		// ----------------------------------------------

		// Constantes

		final int CANTIDAD_ESPECIES_PLANTAS = 10;

		// Variables de entrada

		List<String> list1 = new ArrayList<String>();

		List<String> list2 = new ArrayList<String>();

		List<String> plantasPopulares = new ArrayList<String>();

		Set<String> plantasUnicas = new LinkedHashSet<String>();

		List<Integer> posicionesPopulares = new ArrayList<Integer>();

		// Variables auxiliares

		// Variables de salida

		// ----------------------------------------------
		// Entrada de datos
		// ----------------------------------------------

		System.out.println("BÚSQUEDA DE ESPECIES DE PLANTAS POPULARES");
		System.out.println("-----------------------------------------");

		// No hay, pues se usa un número fijo de elementos aleatorios

		// Rellenamos la lista con aleatorios hasta que haya CANTIDAD_ESPECIES_PLANTAS

		while (list1.size() != CANTIDAD_ESPECIES_PLANTAS) {
			list1.add(Utilidades.especiePlantaAleatoria());
		}

		while (list2.size() != CANTIDAD_ESPECIES_PLANTAS) {
			list2.add(Utilidades.especiePlantaAleatoria());
		}

		// ----------------------------------------------
		// Procesamiento
		// ----------------------------------------------

		// Recorremos a la vez las dos listas

		System.out.println(list1);
		System.out.println(list2);

		int contador = 0;

		for (String i : list1) {
			if (i.equals(list2.get(contador))) {
				plantasPopulares.add(i);

				plantasUnicas.add(i);

				posicionesPopulares.add(Integer.valueOf(contador));

				list1.set(contador, "*" + i + "*");
				list2.set(contador, "*" + i + "*");
			}
			contador++;
		}

		// ----------------------------------------------
		// Salida de resultados
		// ----------------------------------------------

		System.out.println(list1);
		System.out.println(list2);
		System.out.println(plantasPopulares);
		System.out.println(plantasUnicas);
		System.out.println(posicionesPopulares);

	}
}