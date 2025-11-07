package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String valor_10 = "No";

		int numero;

		System.out.println("Introduzca todos las notas que quiera hasta que introduzca un -1.");
		System.out.println(
				"Si se encuentra entre todas las notas una igual a 10 se le notificara.\n-----------------------------------------------------------------------");

		System.out.print("	Numero: ");
		numero = teclado.nextInt();

		while (numero != -1) {
			System.out.print("	Numero: ");
			numero = teclado.nextInt();
			if (numero == 10) {
				valor_10 = "Si";
			}
			if(numero<-1) {
				while(numero<-1) {
				System.out.print("	Ese numero no esta permitido. Introduzca otro: ");
				numero = teclado.nextInt();
				}
			}
		}

		System.out.println("---------------------------------------------------\n" + valor_10
				+ " se ha encontrado un valor de 10 entre sus notas.");

	}

}
