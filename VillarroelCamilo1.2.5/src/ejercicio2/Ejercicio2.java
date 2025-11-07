/*
 *Descripción: Carta a usuario
 *Autor: Camilo Villarroel Recchia
 *Fecha: 07/10/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre, direccion;
		int telefono;
		
		System.out.print("Intoduzca su nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Intoduzca su dirección: ");
		direccion = teclado.nextLine();
		System.out.print("Intoduzca su telefono: ");
		telefono = teclado.nextInt();
		
		System.out.print("Estimad@ Sr/a "+nombre+", con direccion "+direccion+" y telefono " + telefono+ " nos pesa informale que...");
		
		
	}

}
