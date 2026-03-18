/*
 *Descripción: Mostrar "Hola Mundo!" al usuario 
 *Autor: Camilo Villarroel Recchia
 *Fecha: 14/11/2025
 */
package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int comprobador = menu(teclado);

		while (comprobador != 0) {
			switch (comprobador) {
			case 1: {
				System.out.println("El valor del perimetro es de " + circunferencia(pideRadio(teclado)));
				break;
			}
			case 2: {
				System.out.println("El valor del area es de " + area(pideRadio(teclado)));
				break;
			}
			case 3: {
				System.out.println("El valor del arevolumen es de " + volumen(pideRadio(teclado)));
				break;
			}
			default:
				System.out.println("Ese valor no figura en la tabla.");
				System.out.println("Por favor intentelo de nuevo.");
				break;
			}

			System.out.println("\n");
			comprobador = menu(teclado);
		}
		
		System.out.println("--------------------------\nSaliendo del programa...");

	}

	// Muestra el menú y devuelve el número elegido //

	public static int menu(Scanner teclado) {

		int valor;
		System.out.println("\tCalculos.\n--------------------------");
		System.out.println("0. Salir");
		System.out.println("1. Circunferencia");
		System.out.println("2. Área");
		System.out.println("3. Volumen");
		System.out.print("Elección: ");
		return valor = teclado.nextInt();
	}

	// Pide que se introduzca el radio y lo devuelve //

	public static double pideRadio(Scanner teclado) {
		double r;
		System.out.print("Dime el valor del radio: ");
		return r = teclado.nextDouble();
	}

	// Calucula el perimetro de la circunferencia //

	public static double circunferencia(double r) {
		double perimetro;
		return perimetro = (2 * Math.PI * r);
	}

	// Calcula el Area de la circunferencia //

	public static double area(double r) {
		double area;
		return area = (Math.PI * r * r);
	}

	public static double volumen(double r) {
		double volumen;
		return volumen = ((4 / 3) * Math.PI * r * r * r);
	}

}
