package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String fraseOG, fraseInversa = "";

		boolean comprobacion;

		System.out.print("Escriba la frase de la que quiere comprobar si tiene un palindromo: ");
		fraseOG = teclado.nextLine();

		String limpia = fraseOG.replace(" ", "");

		for (int i = (limpia.length() - 1); i >= 0; i--) {

			fraseInversa = fraseInversa + limpia.charAt(i);
		}

		comprobacion = limpia.equalsIgnoreCase(fraseInversa);

		if (comprobacion == true) {

			System.out.println("La frase es un palindromo");
		} else {
			System.out.println("La frase no es un palindromo");
		}

	}

}
