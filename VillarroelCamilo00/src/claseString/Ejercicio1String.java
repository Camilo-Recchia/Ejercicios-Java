package claseString;

import java.util.Scanner;

public class Ejercicio1String {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String letra, resto, nombreMayuscula;

		System.out.print("Dime tu nombre: ");
		String nombre = teclado.nextLine();

		int tamaño = nombre.length();

		letra = nombre.substring(0, 1);

		resto = nombre.substring(1, nombre.length());

		letra = letra.toUpperCase();
		
		resto = resto.toLowerCase();

		nombreMayuscula = letra + resto;

		System.out.println("Numero de caracteres del nombre: " + tamaño);

		System.out.println(nombreMayuscula);

	}

}
