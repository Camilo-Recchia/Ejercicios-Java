/*
 *Descripción: Tablas de Multiplicar
 *Autor: Camilo Villarroel Recchia
 *Fecha: 05/11/2025
 */
package ada;

public class EjercicioTablas03 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			System.out.print("\nTabla del " + (i) + ": ");

			for (int j = 1; j <= 10; j++) {

				System.out.print("\t" + i * j + " ");

			}
		}

	}

}
