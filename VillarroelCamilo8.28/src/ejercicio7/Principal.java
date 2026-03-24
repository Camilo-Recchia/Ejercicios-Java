package ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import ejercicio7.*;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		LinkedHashSet<Venta> list = new LinkedHashSet<Venta>();

		System.out.println("------------------------MENU DE OPCIONES------------------------");

		int resp = 0;

		do {

			resp = mostrarMenu(teclado);

			switch (resp) {

			case 1:
				list = setVentas(teclado);
				break;

			case 2:
				mostrarLista(list);
				break;

			case 3:
				System.out.printf("\nLas ventas de este año son de: %d", ventasAnno(list));
				break;

			case 4:
				System.out.printf("\nLas ventas de los meses que empiezan por \"A\" son de: %d", ventasA(list));
				break;

			case 5:
				System.out.printf("\nEl mes con mayores ventas fue: %s", mesMayor(list));
				break;

			case 6:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.print("\nElija una opcion existente.");
				break;

			}

		} while (resp != 6);

	}

	public static int mostrarMenu(Scanner teclado) {
		System.out.println("\n\n1) Introducir la venta de coches de cada uno de los meses del año.");
		System.out.println("2) Mostrar las ventas introducidas en el punto anterior.");
		System.out.println("3) Mostrar la suma total de ventas de coches del año.");
		System.out.println("4) Mostrar las ventas totales de los meses que empiezan por la letra A.");
		System.out.println("5) Mostrar el nombre del mes con más ventas. ");
		System.out.println("6) Salir.");
		System.out.printf("Opicion: ");
		return teclado.nextInt();
	}

	public static void mostrarLista(LinkedHashSet<Venta> lista) {

		ArrayList<Venta> list = new ArrayList<Venta>(lista);

		System.out.println("Lista:");

		for (int i = 0; i < list.size(); i++) {
			System.out.printf("\nVenta %d: %s", (i + 1), list.get(i).toString());
		}
	}

	public static LinkedHashSet<Venta> setVentas(Scanner teclado) {

		LinkedHashSet<Venta> list = new LinkedHashSet<Venta>(12);

		Venta a;

		for (int i = 0; i < 12; i++) {
			System.out.printf("\nDime las ventas de mes %d: ", (i + 1));
			int v = teclado.nextInt();

			a = new Venta(Venta.meses[i], v);

			list.add(a);
		}

		return list;
	}

	public static int ventasAnno(LinkedHashSet<Venta> list) {

		int total = 0;

		for (Venta i : list) {
			total += i.getVenta();
		}
		return total;
	}

	public static int ventasA(LinkedHashSet<Venta> list) {
		int total = 0;
		for (Venta i : list) {
			if ((i.getMes().toLowerCase().subSequence(0, 1).equals("a"))) {
				total += i.getVenta();
			}
		}
		return total;
	}

	public static String mesMayor(LinkedHashSet<Venta> list) {

		int ventaMayor = list.getFirst().getVenta();

		String mesMayor = "";

		for (Venta i : list) {
			if (i.getVenta() > ventaMayor) {
				ventaMayor = i.getVenta();
				mesMayor = i.getMes();
			}
		}

		return mesMayor.toUpperCase();
	}

}
