package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] numeros = new int[100];

		int numero,contador;
		
		for (int i = 0; i < 100; i++) {
			numeros[i] = (int)(1 + Math.random()*10);
		}
		System.out.print("Introduzca el valor que quiere encontrar dentro del array: ");
		numero = teclado.nextInt();
		
		System.out.print("El valor "+numero+" se encuentra en las posiciones: ");
		for(int i = 0; i < 100; i++) {
			
			if(numero==numeros[i]) {
				
				contador = i;
				System.out.print(" "+contador);
			}
		}
	}

}