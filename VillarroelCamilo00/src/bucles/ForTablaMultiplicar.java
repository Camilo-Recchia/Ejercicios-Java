package bucles;

import java.util.Scanner;

public class ForTablaMultiplicar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int tabla;

		System.out.print("Introduzca el numero de la tabla que quiera saber: ");
		tabla = teclado.nextInt();

		for (int contador = 10; contador > 0; contador--) {

			System.out.println(tabla * (contador));
		}

	}

}
