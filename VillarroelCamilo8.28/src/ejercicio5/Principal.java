package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		ArrayList<Persona> list = new ArrayList<Persona>();

		Persona b;

		int cantidad = (int) (Math.random() * 10) + 20;

		for (int i = 0; i < cantidad; i++) {
			b = new Persona();

			list.add(b);

		}

		System.out.println("------------------------MENU DE OPCIONES------------------------");

		int resp = 0;

		do {

			resp = mostrarMenu(teclado);

			switch (resp) {

			case 1:
				System.out.printf("La cantidad es de: %d\n", cantidadSexo(list, teclado));
				break;

			case 2:
				System.out.printf("La cantidad es de: %d\n", cantidadEstado(list, teclado));
				break;

			case 3:
				mostrarPorEpoca(list, teclado);
				break;

			case 4:
				mostrarPorParametros(list, teclado);
				break;

			case 5:
				Collections.sort(list, new SortPesona());
				mostrarLista(list);
				break;

			default:
				System.out.println("Saliendo...");
				break;
			}

		} while (resp <= 5 && resp >= 1);

	}

	public static int mostrarMenu(Scanner teclado) {
		System.out.println("\n\n1) Un sexo determinado solicitado al usuario.");
		System.out.println("2) Un estado civil determinado solicitado al usuario.");
		System.out.println("3) Un rango de edad por epoca.");
		System.out.println("4) Sexo y estado civil determinado solicitado al usuario.");
		System.out.println("5) Mostrar lista.");
		System.out.printf("Opi: ");
		return teclado.nextInt();
	}

	public static void mostrarLista(ArrayList<Persona> list) {

		System.out.println("Lista:");

		for (int i = 0; i < list.size(); i++) {
			System.out.printf("\nTrabajador %d: %s", i, list.get(i).toString());
		}
	}

	public static int cantidadSexo(ArrayList<Persona> list, Scanner teclado) {

		int contador = 0;

		System.out.println("\n\nQue genero deseas buscar?");
		System.out.println("1) Hombre");
		System.out.println("2) Mujer");
		System.out.print("Opcion: ");
		int op = teclado.nextInt();

		String gen;

		if (op == 1) {
			gen = "Masculino";
		} else {
			gen = "Femenino";
		}
		for (Persona i : list) {
			if (i.getSexo() == gen) {
				contador++;
			}
		}

		return contador;
	}

	public static int cantidadEstado(ArrayList<Persona> list, Scanner teclado) {

		int contador = 0;

		System.out.println("\n\nQue estado deseas buscar?");
		System.out.println("1) Casad@");
		System.out.println("2) Solter@");
		System.out.println("3) Viud@");
		System.out.println("4) Divorciad@");
		System.out.println("default) Solter@");
		System.out.print("Opcion: ");
		int op = teclado.nextInt();

		String est = "Solter@";

		switch (op) {
		case 1:
			est = "Casad@";
			break;
		case 2:
			est = "Solter@";
			break;
		case 3:
			est = "Viud@";
			break;
		case 4:
			est = "Divorciad@";
			break;
		}

		for (Persona i : list) {
			if (i.getEstado() == est) {
				contador++;
			}
		}

		return contador;
	}

	public static void mostrarPorEpoca(ArrayList<Persona> list, Scanner teclado) {
		System.out.println("Epoca que buscas: ");

		int anno = teclado.nextInt();

		int resFecha = anno - anno % 10;

		int maxFecha = resFecha + 9;

		for (Persona i : list) {

			int fecha = 2026 - i.getEdad();

			int resFecha1 = fecha - fecha % 10;

			int maxFecha1 = resFecha1 + 9;

			if (resFecha == resFecha1 && maxFecha == maxFecha1) {
				System.out.printf("%s\n", i.toString());
			}

		}

	}

	public static void mostrarPorParametros(ArrayList<Persona> list, Scanner teclado) {

		System.out.println("\n\nQue estado deseas buscar?");
		System.out.println("1) Casad@");
		System.out.println("2) Solter@");
		System.out.println("3) Viud@");
		System.out.println("4) Divorciad@");
		System.out.println("default) Solter@");
		System.out.print("Opcion: ");
		int op = teclado.nextInt();

		String est = "Solter@";

		switch (op) {
		case 1:
			est = "Casad@";
			break;
		case 2:
			est = "Solter@";
			break;
		case 3:
			est = "Viud@";
			break;
		case 4:
			est = "Divorciad@";
			break;
		}

		System.out.println("\n\nQue genero deseas buscar?");
		System.out.println("1) Hombre");
		System.out.println("2) Mujer");
		System.out.print("Opcion: ");
		int opi = teclado.nextInt();

		String gen;

		if (opi == 1) {
			gen = "Masculino";
		} else {
			gen = "Femenino";
		}

		for (Persona i : list) {
			if (i.getEstado() == est && i.getSexo() == gen) {
				System.out.printf("%s\n", i.toString());
			}
		}
	}
}
