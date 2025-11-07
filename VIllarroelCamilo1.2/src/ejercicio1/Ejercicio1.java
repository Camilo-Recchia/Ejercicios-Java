/*
 *Descripción: Datos del Usuario 
 *Autor: Camilo Villarroel Recchia
 *Fecha: 26/09/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String nombre, apellido, direccion;
		byte edad;
		double altura, peso;

		System.out.print("Introducir nombre:");
		nombre = teclado.nextLine();

		System.out.print("Introducir apellido:");
		apellido = teclado.nextLine();

		System.out.print("Introducir edad:");
		edad = teclado.nextByte();

		teclado.nextLine();

		System.out.print("Introducir dirección:");
		direccion = teclado.nextLine();

		System.out.print("Introducir altura:");
		altura = teclado.nextDouble();

		System.out.print("Introducir peso:");
		peso = teclado.nextDouble();

		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Edad: " + edad);
		System.out.println("Dirección: " + direccion);
		System.out.println("Altura: " + altura + "m");
		System.out.println("Peso: " + peso + "g");
	}

}
