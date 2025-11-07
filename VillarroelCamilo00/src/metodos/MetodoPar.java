package metodos;

import java.util.Scanner;

public class MetodoPar {

	public static void main(String[] args) {

		int a;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Intoduzca un numero: ");
		boolean comprobador = esPar(a = teclado.nextInt());

		if (comprobador == true) {
			System.out.println("Su numero es par");
		} else {
			System.out.println("Su numero es impar");
		}

	}

//	Metodo que calcula si un numero es Par
	
	public static boolean esPar (int a) {

		boolean comprobador;

		if (a % 2 == 0) {
			comprobador = true;
		} else {
			comprobador = false;
		}

		return comprobador;
	}
	
//	Metodo que calcula si un numero es ImPar
	
	public static boolean esImpar (int a) {
		
		return !esPar(a);
	}

}
