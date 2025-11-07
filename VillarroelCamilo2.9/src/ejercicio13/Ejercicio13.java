/*
 *Descripción: Juego de pensar un numero
 *Autor: Camilo Villarroel Recchia
 *Fecha: 28/10/2025
 */
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero, guess, minimo = 0, maximo = 100, contador = 0, previo_1, previo_2;

		String respuesta;

		System.out.print("Piensa un número del 1 al 100 y escribelo. Intentaré adivinarlo: ");
		numero = teclado.nextInt();

		guess = (maximo - minimo + 1)/2;

		System.out.println("Mi número fue el " + guess + ", el tuyo es mayor, menor o igual?\n");
		respuesta = teclado.nextLine();
		respuesta = teclado.nextLine();

		while (guess != numero) {

			contador++;

			
			/*switch (respuesta) {

			case "mayor":
				minimo = guess;
				break;
			case "menor":
				maximo = guess;
				break;
			case "igual":
				if(guess!=numero) {
					
					System.out.println("Ese no es tu numero. Hiciste trampa.");
					System.exit(0);
				}
				break;

			}*/
			
			if()
			guess =  (maximo - minimo + 1)/2;
			

			System.out.println("Mi numero fue el " + guess + ", el tuyo es mayor, menor o igual?\n");
			respuesta = teclado.nextLine();
		}
		System.out.println("------------------------------\nTu numero era el " + guess + "!!!");
		System.out.println("Hice " + (contador + 1) + " intentos hasta encontrar tu numero.");
	}

}
