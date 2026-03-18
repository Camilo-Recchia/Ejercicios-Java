/*
 *Descripción: Dias Meses
 *Autor: Camilo Villarroel Recchia
 *Fecha: 19/11/2025
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca el numero de mes del que quiera saber sus dias: ");
		int mes = teclado.nextInt();
		indicaMesDias(mes, teclado);

		teclado.close();
	}

	// Metodo para indicar los dias de un mes //

	public static void indicaMesDias(int mes, Scanner teclado) {

		while (mes < 1 || mes > 12) {
			System.out.print("Ese numero no es correcto inroduzca otro: ");
			mes = teclado.nextInt();

		}

		switch (mes) {
		case 1:
			System.out.print("Enero, 31 dias");
			break;
		case 2:
			System.out.println("Febrero, 28 dias");
			break;
		case 3:
			System.out.print("Marzo, 31 dias");
			break;
		case 4:
			System.out.print("Abril, 30 dias");
			break;
		case 5:
			System.out.print("Mayo, 31 dias");
			break;
		case 6:
			System.out.print("Junio, 30 dias");
			break;
		case 7:
			System.out.print("Julio, 31 dias");
			break;
		case 8:
			System.out.print("Agosto, 31 dias");
			break;
		case 10:
			System.out.print("Octubre, 31 dias");
			break;
		case 11:
			System.out.print("Noviembre, 30 dias");
			break;
		case 12:
			System.out.print("Diciembre, 31 dias");
			break;

		}
	}

}
