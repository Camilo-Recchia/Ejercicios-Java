/*
 *Descripción: Numeracion de vocales en una frase
 *Autor: Camilo Villarroel Recchia
 *Fecha: 31/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String frase;

		char letra;

		int aS = 0, eS = 0, iS = 0, oS = 0, uS = 0;

		System.out.print("Escribe una frase de tu gusto: ");
		frase = teclado.nextLine();

		for (int i = 0; i < frase.length(); i++) {

			letra = frase.charAt(i);

			switch (letra) {

			case 'a':
				aS++;
				break;

			case 'e':
				eS++;
				break;

			case 'i':
				iS++;
				break;

			case 'o':
				oS++;
				break;

			case 'u':
				uS++;
				break;
			}

		}
		
		System.out.println("En la frase hay: "+aS+" 'a'");
		System.out.println("En la frase hay: "+eS+" 'e'");
		System.out.println("En la frase hay: "+iS+" 'i'");
		System.out.println("En la frase hay: "+oS+" 'o'");
		System.out.println("En la frase hay: "+uS+" 'u'");
	}
}
