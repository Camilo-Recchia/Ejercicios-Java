package ejercicio3;

import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

import ejercicio2.AegndaOrdenador;
import ejercicio2.Alumno;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Alumno c;

		LinkedHashSet<Alumno> list = new LinkedHashSet<Alumno>();

		int cantidad = (int) (Math.random() * 11) + 20;

		for (int i = 0; i < cantidad; i++) {
			c = new Alumno();

			list.add(c);
		}
		int res = 0;

		do {
			res = menu(teclado);
			switch (res) {
			case 1:
				ingresarContacto(list, teclado);
				break;
			case 2:
				System.out.printf("%s", consultarContacto(list, teclado));
				break;
			case 3:
				mostrarDatos(list);
				break;
			case 4:
				mostrarFecha(list, teclado);
				break;
			default:
				System.out.println("Saliendo...");
				break;
			}
		} while (res != 5);

	}

	public static int menu(Scanner teclado) {
		System.out.println("\n\n1) Ingresar nuevo contacto");
		System.out.println("2) Consultar contacto");
		System.out.println("3) Mostrar todos los datos ordenados por nombre");
		System.out.println("4) Mostrar contactos de un año");
		System.out.println("5) Salir");
		System.out.print("Res: ");
		return teclado.nextInt();
	}

	public static void ingresarContacto(LinkedHashSet<Alumno> lista, Scanner teclado) {
		System.out.print("\n\nIngresando nuevo contacto:");
		System.out.print("\nNombre: ");
		teclado.nextLine();
		String nombre = teclado.nextLine();
		System.out.print("\nTelefono: ");
		String telefono = teclado.nextLine();
		System.out.print("\nEmail: ");
		String email = teclado.nextLine();
		System.out.print("\nAño de nacimiento:  ");
		int anno = teclado.nextInt();
		System.out.print("\nMes de nacimiento:  ");
		int mes = teclado.nextInt();
		System.out.print("\nDia de nacimiento:  ");
		int dia = teclado.nextInt();

		LocalDate naci = LocalDate.of(anno, mes, dia);

		Alumno c = new Alumno(nombre, telefono, email, naci);

		lista.add(c);
	}

	public static String consultarContacto(LinkedHashSet<Alumno> lista, Scanner teclado) {
		System.out.print("\n\nIngrese el nombre del contacto: ");
		teclado.nextLine();
		String nomb = teclado.nextLine();

		for (Alumno i : lista) {
			if (nomb.equalsIgnoreCase(i.getNombre())) {
				return i.toString();
			}
		}

		return "Contacto no encontrado";
	}

	public static void mostrarDatos(LinkedHashSet<Alumno> list) {

		LinkedList<Alumno> lista = new LinkedList<Alumno>(list);

		Collections.sort(lista, new AegndaOrdenador());

		for (Alumno c : lista) {
			System.out.println(c);
		}
	}

	public static void mostrarFecha(LinkedHashSet<Alumno> list, Scanner teclado) {
		System.out.print("\nAño de nacimiento:  ");
		int anno = teclado.nextInt();
		for (Alumno i : list) {
			if (i.getNacimiento().getYear() == anno) {
				System.out.printf("\n%s", i.toString());
			}
		}
	}

}