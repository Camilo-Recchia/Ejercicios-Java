package ejemploHashSet;

import java.util.HashSet;

public class HoshSet {

	public static void main(String[] args) {
		System.out.println("########### Conjunto n º 1 ###########");

		HashSet<Integer> conjunto = new HashSet<Integer>(numeroR(50));

		for (int i = 0; i < 100; i++) {

			int n = numeroR(100);

			if (!conjunto.add(Integer.valueOf(n))) {
				System.out.println("No se pudo añadir. El número " + n + " ya está en la lista.");
			}
		}

		System.out.printf("Se han agregado %d numeros a la lista", conjunto.size());
		System.out.println();
		System.out.println(conjunto.toString());
		System.out.println();

		System.out.printf("Calculando total numeros pares: %d", sumarPar(conjunto));
		System.out.println();
		System.out.printf("Calculando total numeros impares: %d", sumarImpar(conjunto));

	}

	public static int numeroR(int n) {
		return (int) ((Math.random() * n));
	}

	public static int sumarPar(HashSet<Integer> conjunto) {

		int pares = 0;
		for (Integer i : conjunto) {
			int entero = i.intValue();
			if (i % 2 == 0) {
				pares += entero;
			}
		}
		return pares;
	}

	public static int sumarImpar(HashSet<Integer> conjunto) {

		int impares = 0;
		for (Integer i : conjunto) {
			int entero = i.intValue();
			if (i % 2 != 0) {
				impares += entero;
			}
		}
		return impares;
	}

}
