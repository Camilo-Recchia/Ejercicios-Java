/*
 *Descripción: Calculo de salario en base a H.
 *Autor: Camilo Villarroel Recchia
 *Fecha: 28/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int horas, salario;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca la cantidad de horas que ha trabajado: ");
		horas = teclado.nextInt();

		if (horas <= 40) {
			salario = horas * 12;
		} else {
			horas = (horas - 40);
			
			salario = (40*12)+(horas*16);
		}
		System.out.println("Su salario es de "+salario);

	}

}
