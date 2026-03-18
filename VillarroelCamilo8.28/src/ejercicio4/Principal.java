package ejercicio4;

import java.util.Collections;

import java.util.HashSet;

import java.util.LinkedList;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		HashSet<Trabajador> list = new HashSet<Trabajador>();

		Trabajador b;

		int cantidad = (int) (Math.random() * 11) + 20;

		for (int i = 0; i < cantidad; i++) {
			b = new Trabajador();

			try {
				list.add(b);
			} catch (Exception e) {
			}

		}

		System.out.println("------------------------MENU DE OPCIONES------------------------");

		int resp = 0;

		do {

			resp = mostrarMenu(teclado);

			switch (resp) {

			case 1:
				mostrarEmpleados(list);
				break;

			case 2:
				System.out.printf("La cantidad de hombes es de: %d\n", nHombres(list));
				break;

			case 3:
				System.out.printf("La cantidad de casados es de: %d\n", nCasados(list));
				break;

			case 4:
				System.out.printf("La cantidad total de los sueldos de los trabajadores es de: %d\n",
						cantidadSueldos(list));
				break;

			default:
				System.out.println("Saliendo...");
				break;
			}

		} while (resp != 5);

	}

	public static int mostrarMenu(Scanner teclado) {
		System.out.println("\n\n1) mostrar todos los trabajadores ordenados por sexo y estado civil");
		System.out.println("2) la cantidad de trabajadores del sexo masculino");
		System.out.println("3) cantidad de trabajadoras casadas");
		System.out.println("4) suma de todos los sueldos.");
		System.out.printf("Res: ");
		return teclado.nextInt();
	}

	public static void mostrarEmpleados(HashSet<Trabajador> list) {
		LinkedList<Trabajador> lista = new LinkedList<Trabajador>(list);

		Collections.sort(lista, new SortTrabajador());

		System.out.println("\t\t\tTrabajadores:");

		for (Trabajador i : list) {
			System.out.printf("%s\n", i.toString());

		}

	}

	public static int nHombres(HashSet<Trabajador> list) {

		int contador = 0;

		for (Trabajador i : list) {

			if (i.getSexo().equalsIgnoreCase("masculino")) {

				contador++;

			}
		}

		return contador;
	}

	public static int nCasados(HashSet<Trabajador> list) {
		int contador = 0;

		for (Trabajador i : list) {

			if (i.getEstadoCivil().equalsIgnoreCase("Casad@")) {

				contador++;

			}
		}

		return contador;
	}

	public static double cantidadSueldos(HashSet<Trabajador> list) {
		double sueldos = 0;

		for (Trabajador i : list) {
			sueldos += i.getSueldo();
		}

		return sueldos;
	}
}
