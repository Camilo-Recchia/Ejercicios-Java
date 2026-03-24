package ejemploHashSet;

import java.util.HashSet;

import java.util.Scanner;

public class HushSet {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("########### Conjunto n º 1 ###########");

		HashSet<Integer> conjunto = new HashSet<Integer>(numeroR(50));

		for (int i = 0; i < numeroR(100); i++) {

			int n = numeroR(100);

			if (!conjunto.add(Integer.valueOf(n))) {
				System.out.println("No se pudo añadir. El número " + n + " ya está en la lista.");
			}
		}

		System.out.printf("Se han agregado %d numeros a la lista", conjunto.size());
		System.out.println();
		System.out.println(conjunto.toString());
		System.out.println();
		System.out.print("Introduzca el numero que quiera seber si esta: ");
		int n = teclado.nextInt();

		System.out.printf("El numero %d %sesta en el conjunto", Integer.valueOf(n), conjunto.contains(n) ? "" : "no ");
		System.out.println();
		System.out.print("\nIntroduzca el numero que quiera eliminar: ");
		n = teclado.nextInt();

		conjunto.remove(Integer.valueOf(n));

		System.out.printf("Se ha eliminado el numero %d del conjunto. Ahora este quedaria asi: \n%s", n,
				conjunto.toString());

		System.out.println("\n\n########### Conjunto n º 2 ###########");

		HashSet<Integer> conjunto2 = new HashSet<Integer>(numeroR(50));

		for (int i = 0; i < 100; i++) {

			int n2 = numeroR(100);

			if (!conjunto2.add(Integer.valueOf(n2))) {
				System.out.println("No se pudo añadir. El número " + n2 + " ya está en la lista.");
			}
		}

		System.out.printf("Se han agregado %d numeros a la lista", conjunto2.size());
		System.out.println();
		System.out.println(conjunto2.toString());
		System.out.println();

		System.out.println("Sumando los dos conjuntos...");
		try {
			conjunto.addAll(conjunto2);

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

		System.out.println();
		System.out.printf("Luego de sumar los dos conjuntos creados. Como resultado el conjunto 1 quedo asi: \n%s",
				conjunto.toString());

		System.out.println("\n\nEliminando contenido del conjunto 1...");
		conjunto.removeAll(conjunto);

		System.out.println("\nRellenando nuevamente el conjunto 1:");

		for (int i = 0; i < 10; i++) {

			n = numeroR(100);

			if (!conjunto.add(Integer.valueOf(n))) {
				System.out.println("No se pudo añadir. El número " + n + " ya está en la lista.");
			}
		}

		System.out.printf("Se han agregado %d numeros a la lista", conjunto.size());
		System.out.println();
		System.out.println(conjunto.toString());
		System.out.println();

		System.out.println("Comprobando la intersección de los dos conjuntos...");
		try {
			conjunto.retainAll(conjunto2);
		} catch (UnsupportedOperationException ex1) {
			System.out.printf("%s", ex1.getMessage());
		} catch (ClassCastException ex2) {
			System.out.printf("%s", ex2.getMessage());
		} catch (NullPointerException ex3) {
			System.out.printf("%s", ex3.getMessage());
		}

		System.out.println("Estado actual de la intersección de los dos conjuntos: ");
		System.out.println(conjunto.toString());
		System.out.println();
	}

	public static int numeroR(int n) {
		return (int) ((Math.random() * n));
	}

}
