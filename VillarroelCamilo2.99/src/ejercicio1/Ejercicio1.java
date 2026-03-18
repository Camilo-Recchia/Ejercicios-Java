/*
 *Descripción: Progrma de Decenas
 *Autor: Camilo Villarroel Recchia
 *Fecha: 12/11/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int contador = 0, decenas = 0, decena1 = 0, decena2 = 0, decena3 = 0, decena4 = 0, decena5 = 0, decena6 = 0,
				decena7 = 0, decena8 = 0, decena9 = 0, decena10 = 0, media1 = 0, media2 = 0, media3 = 0, media4 = 0,
				media5 = 0, media6 = 0, media7 = 0, media8 = 0, media9 = 0, media10 = 0;

		System.out.println("Introduzca todos los valores que quiera entre 1 y 100.");
		System.out.println("Cuando no quiera introducir más, introduzca un 0.");
		System.out.print("Valor 1: ");
		int valores = teclado.nextInt();

		while (valores != 0) {
			contador++;
			System.out.print("Valor " + (contador + 1) + ":");
			valores = teclado.nextInt();

			switch (valores) {
			case 1, 2, 3, 4, 5, 6, 7, 8, 9:
				media1 = media1 + valores;
				decena1++;
				break;
			case 10, 11, 12, 13, 14, 15, 16, 17, 18, 19:
				media2 = media2 + valores;
				decena2++;
				break;
			case 20, 21, 22, 23, 24, 25, 26, 27, 28, 29:
				media3 = media3 + valores;
				decena3++;
				break;
			case 30, 31, 32, 33, 34, 35, 36, 37, 38, 39:
				media4 = media4 + valores;
				decena4++;
				break;
			case 40, 41, 42, 43, 44, 45, 46, 47, 48, 49:
				media5 = media5 + valores;
				decena5++;
				break;
			case 50, 51, 52, 53, 54, 55, 56, 57, 58, 59:
				media6 = media6 + valores;
				decena6++;
				break;
			case 60, 61, 62, 63, 64, 65, 66, 67, 68, 69:
				media7 = media7 + valores;
				decena7++;
				break;
			case 70, 71, 72, 73, 74, 75, 76, 77, 78, 79:
				media8 = media8 + valores;
				decena8++;
				break;
			case 80, 81, 82, 83, 84, 85, 86, 87, 88, 89:
				media9 = media9 + valores;
				decena9++;
				break;
			case 90, 91, 92, 93, 94, 95, 96, 97, 98, 99:
				media10 = media10 + valores;
				decena10++;
				break;
			default:
				contador--;
			}

		}

		System.out.println("\n\nLa cantidad de numeros pertenecientes a la primer decena es de " + decena1);
		System.out.println("La cantidad de numeros pertenecientes a la segunda decena es de " + decena2);
		System.out.println("La cantidad de numeros pertenecientes a la tercera decena es de " + decena3);
		System.out.println("La cantidad de numeros pertenecientes a la cuarta decena es de " + decena4);
		System.out.println("La cantidad de numeros pertenecientes a la quinta decena es de " + decena5);
		System.out.println("La cantidad de numeros pertenecientes a la sexta decena es de " + decena6);
		System.out.println("La cantidad de numeros pertenecientes a la septima decena es de " + decena7);
		System.out.println("La cantidad de numeros pertenecientes a la octava decena es de " + decena8);
		System.out.println("La cantidad de numeros pertenecientes a la novena decena es de " + decena9);
		System.out.println("La cantidad de numeros pertenecientes a la decima decena es de " + decena10);

		System.out.println("\nY la media aritmetica de las decenas es:");

		if (decena1 > 0) {

			System.out.println("1ª: " + media1 / decena1);
		}
		if (decena2 > 0) {
			System.out.println("2ª: " + media2 / decena2);
		}
		if (decena3 > 0) {
			System.out.println("3ª: " + media3 / decena3);
		}
		if (decena4 > 0) {
			System.out.println("4ª: " + media4 / decena4);
		}
		if (decena5 > 0) {
			System.out.println("5ª: " + media5 / decena5);
		}
		if (decena6 > 0) {
			System.out.println("6ª: " + media6 / decena6);
		}
		if (decena7 > 0) {
			System.out.println("7ª: " + media7 / decena7);
		}
		if (decena8 > 0) {
			System.out.println("8ª: " + media8 / decena8);
		}
		if (decena9 > 0) {
			System.out.println("9ª: " + media9 / decena9);
		}
		if (decena10 > 0) {
			System.out.println("10ª: " + media10 / decena10);
		}
	}
}
