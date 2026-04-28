package ejercicio2;

import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Alumno c;

		LinkedList<Alumno> list = new LinkedList<Alumno>();

		for (int i = 0; i < Math.random() * 10 + 20; i++) {
			c = new Alumno();

			list.add(c);
		}

		int res = 0;

		do {
			res = menu(teclado);
			switch (res) {
			case 1:
				list.add(ingresarContacto(list, teclado));
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

	public static Alumno ingresarContacto(LinkedList<Alumno> lista, Scanner teclado) {
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

		return c;
	}

	public static String consultarContacto(LinkedList<Alumno> lista, Scanner teclado) {
		System.out.print("\n\nIngrese el nombre del contacto: ");
		teclado.nextLine();
		String nomb = teclado.nextLine();

		Alumno c = null;

		for (Alumno i : lista) {
			if (nomb.toLowerCase().equals(i.getNombre().toLowerCase())) {
				c = i;
			}
		}

		c = lista.get(0);

		return c.toString();
	}

	public static void mostrarDatos(LinkedList<Alumno> list) {

		Collections.sort(list, new AegndaOrdenador());

		System.out.println("Datos: ");

		for (int i = 0; i < list.size(); i++) {
			System.out.printf("\n%s", list.get(i).toString());
		}
	}

	public static void mostrarFecha(LinkedList<Alumno> list, Scanner teclado) {
		System.out.print("\nAño de nacimiento:  ");
		int anno = teclado.nextInt();
		for (Alumno i : list) {
			if (i.getNacimiento().getYear() == anno) {
				System.out.printf("\n%s", i.toString());
			}
		}
	}

}
