package ejemploHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LikedsHashSets {

	public static void main(String[] args) {

		System.out.println("########### Conjunto HashSet ###########");

		HashSet<Integer> conjunto = new HashSet<Integer>(50);

		for (int i = 0; i < numeroR(100); i++) {

			int n = numeroR(100);

			if (!conjunto.add(Integer.valueOf(n))) {
				System.out.println("No se pudo añadir. El número " + n + " ya está en la lista.");

			} else {
				for (Integer j : conjunto) {
					int entero = j.intValue();
					System.out.printf("%d ", entero);
				}
			}

		}

		System.out.println("########### Conjunto LinkedHashSet ###########");

		LinkedHashSet<Integer> conjunto2 = new LinkedHashSet<Integer>(50);

		for (int i = 0; i < numeroR(100); i++) {

			int n = numeroR(100);

			if (!conjunto2.add(Integer.valueOf(n))) {
				System.out.println("No se pudo añadir. El número " + n + " ya está en la lista.");
			} else {
				for (Integer j : conjunto) {
					int entero = j.intValue();
					System.out.printf("%d ", entero);
				}
			}
			
		}

//		System.out.println("########### Conjunto TreeSet ###########");
//
//		TreeSet<Integer> conjunto3 = new TreeSet<Integer>();
//
//		for (int i = 0; i < numeroR(100); i++) {
//
//			int n = numeroR(100);
//
//			if (!conjunto3.add(Integer.valueOf(n))) {
//				System.out.println("No se pudo añadir. El número " + n + " ya está en la lista.");
//			}
//		}
//
//		System.out.println("########### Conjunto HashSet ###########");
//
//		System.out.printf("Se han agregado %d numeros a la lista", conjunto.size());
//		System.out.println();
//		System.out.println(conjunto.toString());
//		System.out.println();
//
//		System.out.println("########### Conjunto LinkedHashSet ###########");
//
//		System.out.printf("Se han agregado %d numeros a la lista", conjunto2.size());
//		System.out.println();
//		System.out.println(conjunto2.toString());
//		System.out.println();
//
//		System.out.println("########### Conjunto TreeSet ###########");
//
//		System.out.printf("Se han agregado %d numeros a la lista", conjunto3.size());
//		System.out.println();
//		System.out.println(conjunto3.toString());
//		System.out.println();

	}

	public static int numeroR(int n) {
		return (int) ((Math.random() * n));
	}
}
