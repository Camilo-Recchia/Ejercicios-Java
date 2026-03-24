package botanico;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Ejercicio 3. Calendario de especies de plantas
 * 
 * @author Profesor
 */
public class Ejercicio03 {

	public static void main(String[] args) {

		// ----------------------------------------------
		// Declaración de variables y constantes
		// ----------------------------------------------

		// Constantes

		// Variables de entrada

		Map<LocalDate, String> mapa = new HashMap<LocalDate, String>();

		Collections.sort((List<Object>) mapa, new Ejercicio3Sort());

		// Variables auxiliares

		// Variables de salida

		// ----------------------------------------------
		// Entrada de datos
		// ----------------------------------------------

		int i = 0;

		while (mapa.size() != 7) {
			
			i++;
		}

		// No se piden datos al usuario, ya que se usa un número fijo de elementos
		// aleatorios

		System.out.println("CALENDARIO DE ESPECIES DE PLANTAS");
		System.out.println("---------------------------------");

		// ----------------------------------------------
		// Procesamiento
		// ----------------------------------------------

		// ----------------------------------------------
		// Salida de resultados
		// ----------------------------------------------

	}
}