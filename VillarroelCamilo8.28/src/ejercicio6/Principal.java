package ejercicio6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		ArrayList<Alumno> list = new ArrayList<Alumno>();

		Alumno a;

		int cantidad = (int) (Math.random() * 10) + 20;

		for (int i = 0; i < cantidad; i++) {
			a = new Alumno();

			list.add(a);

		}

		System.out.println("------------------------MENU DE OPCIONES------------------------");

		int resp = 0;

		do {

			resp = mostrarMenu(teclado);

			switch (resp) {

			case 1:
				list.add(addAlumno(teclado));
				break;

			case 2:
				System.out.printf("El alumno es: %s", showAlumno(list, teclado).toString());

				break;

			case 3:
				System.out.print("Dime el nombre del Alumno a eliminar: ");
				teclado.nextLine();
				String nom = teclado.nextLine();

				System.out.print("Dime el apellido del Alumno a eliminar: ");
				teclado.nextLine();
				String sur = teclado.nextLine();

				eliminarAlumno(list, nom, sur);
				break;

			case 4:
				System.out.println("Cual alumno quiere modificar?");
				System.out.print("Introduzca codigo: ");
				int codigo = teclado.nextInt();
				modDatos(list, teclado, codigo);
				break;

			case 5:
				System.out.println("Cual alumno quiere modificar?");
				System.out.print("Introduzca codigo: ");
				int codigo1 = teclado.nextInt();
				changeCarrera(list, teclado, codigo1);
				break;

			case 6:
				Collections.sort(list, new SortAlumno());
				mostrarLista(list);
				break;

			default:
				System.out.println("Saliendo...");
				break;
			}

		} while (resp <= 6 && resp >= 1);

	}

	public static int mostrarMenu(Scanner teclado) {
		System.out.println("\n\n1) Incorporar un nuevo alumno.");
		System.out.println("2) Mostrar en pantalla la información sobre un alumno.");
		System.out.println("3) Dar de baja a un alumno..");
		System.out.println("4) SModificar la dirección y/o teléfono de un alumno.");
		System.out.println("5) Realizar un cambio de curso a un alumno.");
		System.out.println("6) Mostrar lista.");
		System.out.printf("Opicion: ");
		return teclado.nextInt();
	}

	public static void mostrarLista(ArrayList<Alumno> list) {

		System.out.println("Lista:");

		for (int i = 0; i < list.size(); i++) {
			System.out.printf("\nAlumno %d: %s", i, list.get(i).toString());
		}
	}

	public static Alumno addAlumno(Scanner teclado) {

		Alumno a;

		System.out.print("\n\nIngresando nuevo Alumno:");

		System.out.print("\nNombre: ");
		teclado.nextLine();
		String nombre = teclado.nextLine();

		System.out.print("\nApellido: ");
		String apellido = teclado.nextLine();

		System.out.print("\nDireccion: ");
		String direccion = teclado.nextLine();

		System.out.print("\nTelefono: ");
		String Telefono = teclado.nextLine();

		System.out.print("\nCodigo de Ciclo:  ");
		int ciclo = teclado.nextInt();

		System.out.print("\nCantidad de cursos:  ");
		int cursos = teclado.nextInt();

		System.out.print("\nAño de entrada:  ");
		int anno = teclado.nextInt();

		System.out.print("\nMes de entrada:  ");
		int mes = teclado.nextInt();

		System.out.print("\nDia de entrada:  ");
		int dia = teclado.nextInt();

		return a = new Alumno(nombre, apellido, direccion, Telefono, ciclo, cursos, LocalDate.of(anno, mes, dia));
	}

	public static Alumno showAlumno(ArrayList<Alumno> list, Scanner teclado) {

		Alumno a = null;

		System.out.print("\nIntroduzca el codigo del alumno que desee ver: ");
		int codigo = teclado.nextInt();

		for (Alumno i : list) {
			if (i.getCodigoAlumno() == codigo) {
				a = i;
			}
		}

		return a;
	}

	public static void eliminarAlumno(ArrayList<Alumno> list, String nombre, String apellido) {
		Iterator<Alumno> it = list.iterator();

		while (it.hasNext()) {
			Alumno i = it.next();
			if (i.getNombre().equalsIgnoreCase(nombre) && i.getApellido().equalsIgnoreCase(apellido)) {
				it.remove();
			}

		}
	}

	public static void modDatos(ArrayList<Alumno> list, Scanner teclado, int codigo) {

		System.out.print("Direccion: ");
		String dire = teclado.nextLine();

		System.out.print("Telefono: ");
		String tel = teclado.nextLine();

		for (Alumno i : list) {
			if (i.getCodigoAlumno() == codigo) {
				i.setDireccion(dire);
				i.setDireccion(tel);
			}

		}

	}

	public static void changeCarrera(ArrayList<Alumno> list, Scanner teclado, int codigo) {
		System.out.print("Introduzca el nuevo codigo de carrera: ");
		int cod = teclado.nextInt();
		System.out.print("Introduzca los cursos aprobados en esa carrera: ");
		int cur = teclado.nextInt();

		for (Alumno i : list) {
			if (i.getCodigoAlumno() == codigo) {
				i.setCantidadCursos(cur);
				i.setCodigoCiclo(cod);
			}
		}
	}

}
