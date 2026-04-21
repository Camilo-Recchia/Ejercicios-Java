package botanico;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Ejercicio 1. Creando jardín botánico
 * 
 * @author Profesor
 */
public class Ejercicio01 {

	public static void main(String[] args) {

		// ----------------------------------------------
		// Declaración de variables
		// ----------------------------------------------

		// Constantes

		final int CANTIDAD_ESPECIES_PLANTAS = 5;

		// Variables de entrada

		// Variables auxiliares

		// Variables de salida

		// ----------------------------------------------
		// Entrada de datos
		// ----------------------------------------------

		Set<String> list1 = new LinkedHashSet<String>();

		Set<String> list2 = new LinkedHashSet<String>();

		// No hay, pues se usa un número fijo de elementos aleatorios

		System.out.println("CONJUNTOS DE ESPECIES DE PLANTAS");
		System.out.println("--------------------------------");

		// ----------------------------------------------
		// Procesamiento
		// ----------------------------------------------

		// Rellenamos los conjuntos con especies de plantas aleatorias hasta que haya
		// CANTIDAD_ESPECIES_PLANTAS

		do {

			list1.add(Utilidades.especiePlantaAleatoria());

		} while (list1.size() < CANTIDAD_ESPECIES_PLANTAS);

		do {

			list2.add(Utilidades.especiePlantaAleatoria());

		} while (list2.size() < CANTIDAD_ESPECIES_PLANTAS);

		// Unión de los dos conjuntos

		Set<String> list3 = new LinkedHashSet<String>(list1);

		try {
			list3.addAll(list2);

		} catch (UnsupportedOperationException ex1) {

			System.out.printf(ex1.getMessage());

		} catch (ClassCastException ex2) {

			System.out.printf(ex2.getMessage());

		} catch (NullPointerException ex3) {

			System.out.printf(ex3.getMessage());

		} catch (IllegalArgumentException ex4) {

			System.out.printf(ex4.getMessage());

		} catch (IllegalStateException ex5) {

			System.out.printf(ex5.getMessage());

		}

		// Intersección de los conjuntos

		Set<String> list4 = new LinkedHashSet<String>(list1);

		try {
			list4.retainAll(list2);
		} catch (UnsupportedOperationException ex1) {
			System.out.printf("%s", ex1.getMessage());
		} catch (ClassCastException ex2) {
			System.out.printf("%s", ex2.getMessage());
		} catch (NullPointerException ex3) {
			System.out.printf("%s", ex3.getMessage());
		}

		// Diferencia de los conjuntos

		Set<String> list5 = new LinkedHashSet<String>(list1);

		list5.removeAll(list2);

		// ----------------------------------------------
		// Salida de Resultados
		// ----------------------------------------------

		// Recorremos el conjunto y mostramos su contenido por pantalla

		System.out.println(list1.toString());
		System.out.println(list2.toString());
		System.out.println(list3.toString());
		System.out.println(list4.toString());
		System.out.println(list5.toString());

	}
}