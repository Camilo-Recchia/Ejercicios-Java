package metodos;

import java.util.Scanner;

public class FactorialNumero {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Indique el numero del que quiera saber su factorial: ");
		long numero = Factorial(teclado.nextInt());

		System.out.printf("El factorial de ese numero es %d", numero);

	}

//	Metodo que calcula el Factorial de un Numero

	public static long Factorial(int a) {

		long factorial = 1;

		if (a == 0) {

		} else {

			while (a > 0) {

				factorial = factorial * a;
				a--;
			}
		}
		return factorial;
	}

}
