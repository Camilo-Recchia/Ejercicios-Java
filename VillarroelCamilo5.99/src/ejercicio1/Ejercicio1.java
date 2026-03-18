/*
 *Descripción: Calcula las medias y valores de la produccion de 4 trabajadores en una semana laboral
 *Autor: Camilo Villarroel Recchia
 *Fecha: 28/01/2026
 */
package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos e Instanciamos los tres arrays. Uno para los dias de la semana
		// Otro para los trabajadores
		// Y otro para los valores de produccion
		String[] dias = { "lunes", "martes", "mierco", "jueves", "virnes" };
		String[] personas = { "Juan", "José", "Pedro", "Luis" };
		int[][] valores = new int[4][5];

		// Damos valores al array valores
		ValoresRandom(valores);

		// mostramos el array por consola
		MostrarArrays(valores, dias, personas);
		System.out.println("\n");

		// Mostramos la produccion semanal de cada trabajador
		System.out.printf(
				"La produccion semanal de los trabajadores es:\n" + "Trabajador 1: %d\n" + "Trabajador 2: %d\n"
						+ "Trabajador 3: %d\n" + "Trabajador 4: %d\n",
				ProduccionSemanal(valores, 0), ProduccionSemanal(valores, 1), ProduccionSemanal(valores, 2),
				ProduccionSemanal(valores, 3));

		for (int i = 0; i < dias.length; i++) {
			System.out.println("");
			System.out.printf("La produccion media del %s, fue de %.2f", dias[i], ProduccionMedia(valores, i));

		}
		System.out.println("");
		System.out.printf("El dia de menor produccion es el %s", MenosProduccionMedia(dias, valores));

	}

	// Crea un array de 4x5 con valores aleatorios entre 100 y 300. Con las unidades
	// siendo 0.
	public static void ValoresRandom(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) ((Math.random() * 30) + 10) * 10;
			}
		}
	}

	// Muestra por la consola el array creado por ValoresRandom()
	public static void MostrarArrays(int[][] valores, String[] dias, String[] personas) {
		System.out.print("\t");
		for (int i = 0; i < dias.length; i++) {
			System.out.print(dias[i] + "   ");
		}
		System.out.println("");
		for (int i = 0; i < valores.length; i++) {
			System.out.print(personas[i] + "\t");
			for (int j = 0; j < valores[i].length; j++) {
				System.out.print(valores[i][j] + "\t");
			}
			System.out.println("");
		}
	}

	// Devuelve la produccion semanal de un trabajador
	public static int ProduccionSemanal(int[][] valores, int n_trabajador) {
		int produccion = 0;
		for (int i = 0; i < valores[n_trabajador].length; i++) {
			produccion = produccion + valores[n_trabajador][i];

		}
		return produccion;
	}

	// Devuelve la produccion del dia de los trabajadores
	public static double ProduccionMedia(int[][] valores, int dia) {
		int produccion = 0;
		for (int i = 0; i < valores.length; i++) {
			produccion = produccion + valores[i][dia];
		}
		return produccion / 4;
	}

	// Devuelve en letras el dia de menor produccion
	public static String MenosProduccionMedia(String[] dias, int[][] valores) {

		String diaMenor = "";
		int MenorProduccion = (int) ProduccionMedia(valores, 0);
		for (int i = 0; i < dias.length; i++) {
			if (MenorProduccion > ProduccionMedia(valores, i)) {
				diaMenor = dias[i];
			}
		}

		return diaMenor;
	}
}
