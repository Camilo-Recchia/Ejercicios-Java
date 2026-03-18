package ejemploArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayLists {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		ArrayList<Integer> lista = new ArrayList<Integer>();

		LinkedList<Integer> lista2 = new LinkedList<Integer>();

		for (int i = 0; i < 5; i++) {
			lista.add(Integer.valueOf(numeroR(numeroR(50))));
		}

		System.out.printf("lista 1: \nTamaño: %d \nLista: %s", lista.size(), lista.toString());

		System.out.print("\n\nIndica el numero a añadir: ");
		int nuev = teclado.nextInt();
		System.out.printf(
				"\n\nIndica la posicion que va a tomar ese numero.\nPensa que la lista tiene por ahora solo %d espacios: ",
				lista.size());
		int pos = teclado.nextInt();
		try {
			lista.add(pos, nuev);
		} catch (IndexOutOfBoundsException ex1) {
			System.out.println("Indice fuera de rango.");
		}

		System.out.printf(
				"\n\nQuieres añadir más numeros? \nSi quieres escribelo y se agregara ultimo en la lista, sino escribe \"no\": ");
		teclado.nextLine();
		String r = teclado.nextLine();

		while (!(r.toLowerCase()).equals("no")) {
			try {
				lista.addLast(Integer.valueOf(r));
			} catch (IndexOutOfBoundsException ex1) {
				System.out.println("Indice fuera de rango.");
			}

			System.out.printf("\nLista nueva: %s", lista.toString());

			System.out.printf(
					"\n\nQuieres añadir más numeros? \nSi quieres escribelo y se agregara ultimo en la lista, sino escribe \"no\": ");
			r = teclado.nextLine();
		}

		System.out.print("\n\nIndica que numero que quieres buscar: ");
		int n = teclado.nextInt();

		System.out.println("Buscando...");

		System.out.printf("EL numero %d %s se encuenta en la lista.", n,
				lista.contains(Integer.valueOf(n)) ? "si" : "no");

		if (lista.contains(Integer.valueOf(n))) {
			System.out.printf("\n\nDeseas borrar el numero %d de la lista (si o no): ", n);
			teclado.nextLine();
			String p = teclado.nextLine();

			if (p.toLowerCase().equals("si")) {

				lista.remove(Integer.valueOf(n));

				System.out.printf("El numero %d fue eliminado.", n);

				System.out.printf("\n\nLa lista ahora se encuentra asi: %s", lista.toString());
			} else {
				System.out.println(p);
				System.out.print("Operacion cancelada...");
			}
		}

		System.out.printf("\n\nDime la poscion del numero que quieres eliminar: ");
		int pos2 = teclado.nextInt();

		System.out.printf("\nEliminando la posción %d", pos2);

		lista.remove(pos);

		System.out.println(
				"\n\nAhora vamos a crear una nueva lista a tu gusto.\nQue prefieres?\n\n1) Generar por medio de datos una lista con numeros dentro de un ramgo a tu gusto?\n2) Generar una lista con tus propios numeros?\n3) Dejarlo al azar >=D");
		int des = teclado.nextInt();

	}

//		for (int i = 0; i < 10; i++) {
//			lista2.add(Integer.valueOf(numeroR(50)));
//		}
//
//		System.out.println();
//		System.out.println();
//		System.out.printf("Tamaño lista 2: %d \nLista: %s", lista2.size(), lista2.toString());

//	public static ArrayList<Integer> generador(){
//		
//	}

	public static int numeroR(int n) {
		return (int) ((Math.random() * n));
	}
}
