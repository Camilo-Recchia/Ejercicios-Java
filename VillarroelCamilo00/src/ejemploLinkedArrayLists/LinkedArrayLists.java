package ejemploLinkedArrayLists;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedArrayLists {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		LinkedList<Integer> lList;

		int des = menu(teclado);

		while (des != 1 && des != 2 && des != 3) {
			System.out.println("DATO ERRONEO.");

			menu(teclado);

		}

		lList = gen(des, teclado);

		System.out.printf("\nTu nueva lista se ve asi: \nTamaño: %d.\nPatron: %s", lList.size(), lList.toString());

		lList = opciones(menu2(teclado), teclado);
		
	}

	public static LinkedList<Integer> gen(int des, Scanner teclado) {

		LinkedList<Integer> lList = new LinkedList<Integer>();

		if (des == 1) {
			System.out.print("Dime la cantidad de valores: ");
			int cant = teclado.nextInt();
			System.out.print("Dime el minimo de valores: ");
			int min = teclado.nextInt();
			System.out.print("Dime el maximo de valores: ");
			int max = teclado.nextInt();

			for (int i = 0; i < cant; i++) {
				lList.offer(Integer.valueOf(numeroR(max) + min));
			}

		} else if (des == 2) {
			System.out.println("Cuando te quieras detener escribe \"no\": ");
			teclado.nextLine();
			String d = teclado.nextLine();
			while (!d.toLowerCase().equals("no")) {
				lList.offer(Integer.valueOf(d));
				d = teclado.nextLine();
			}
		} else {
			for (int i = 0; i < numeroR(100); i++) {
				lList.offer(Integer.valueOf(numeroR(numeroR(100)) + numeroR(100)));
			}
		}

		return lList;
	}

	public static LinkedList<Integer> opciones(int des, Scanner teclado) {

		LinkedList<Integer> lList = new LinkedList<Integer>();

		if (des == 1) {

			System.out.printf("Que numero queres añadir: ");
			int n = teclado.nextInt();

			lList.offer(Integer.valueOf(n));
		} else if (des == 2) {
			System.out.printf("El primer dato era: %d", lList.poll());
		} else {
			System.out.printf("El primer dato es: %d", lList.peek());
		}

		return lList;
	}

	public static int menu(Scanner teclado) {
		System.out.printf(
				"Como deseas instanciar tu nueva lista: \n1) Valores aleatorios en un rango. \n2) Tus propios valores. \n3) Valores aleatorios.\n\nResp: ");
		return teclado.nextInt();
	}

	public static int menu2(Scanner teclado) {
		System.out.print("\n\nAhora que deceas hacer?"
				+ "\n\n1) Agregar dato. \n2) Ver y eliminar el primer dato. \n3) Solo ver el primer dato. \n\nResp: ");
		return teclado.nextInt();
	}

	public static int numeroR(int n) {
		return (int) ((Math.random() * n));
	}

}
