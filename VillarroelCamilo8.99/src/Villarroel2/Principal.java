package Villarroel2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {

		// 1. Crear una lista con 10 empleados

		ArrayList<Empleado> list = new ArrayList<Empleado>();

		for (int i = 0; i < 10; i++) {
			list.add(Empleado.generarAleatorio());
		}

		for (Empleado empleado : list) {
			System.out.printf("%s\n", empleado.toString());
		}

		System.out.printf("\nHay %d empleados en la lista\n\n", list.size());

		// 2. Añadir un empleado a la mitad de la lista

		list.add((int) (list.size() / 2), Empleado.generarAleatorio());

		for (Empleado empleado : list) {
			System.out.printf("%s\n", empleado.toString());
		}

		System.out.printf("\nHay %d empleados en la lista\n\n", list.size());

		// 3. Ordenamos la lista por dni desendiente

		Collections.sort(list, new OrdenadorPorDNIDescendiente());

		for (Empleado empleado : list) {
			System.out.printf("%s\n", empleado.toString());
		}

		System.out.printf("\nHay %d empleados en la lista\n\n", list.size());

		// 4. Mostrar si el empleado con el dni 101010101Z esta en la lista

		Empleado empleadoEjemplo = new Empleado("101010101Z", null, 0, null);

		if (list.contains(empleadoEjemplo)) {
			System.out.printf("%s", list.get(list.indexOf(empleadoEjemplo)));
		}

		// 5. Mostrar cuantos empleados tienen el nombre Ana

		int cantidadAnas = 0;

		for (Empleado empleado : list) {
			if (empleado.getNombre().equalsIgnoreCase("ana")) {
				cantidadAnas++;
			}
		}

		System.out.printf("\nHay %d %s Ana\n\n", cantidadAnas,
				cantidadAnas > 1 ? "empleadas llamadas" : "solo empleada llamada");

		String nombre = "luis";

		for (Iterator<Empleado> iterator = list.iterator(); iterator.hasNext();) {
			Empleado registro = iterator.next();

			if (registro.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println(registro.toString());
				iterator.remove();
				nombre = "";
			}
		}
		if (nombre == "luis") {

			System.out.println("\n\nNo se ha encontrado a ningun empleado con el nombre Luis\n\n");
		} else {

			System.out.println("\n\nSe ha eliminado al empleado con el nombre Luis\n\n");
		}

		for (Empleado empleado : list) {
			System.out.printf("%s\n", empleado.toString());
		}

		System.out.printf("\nHay %d empleados en la lista\n\n", list.size());

	}

}
