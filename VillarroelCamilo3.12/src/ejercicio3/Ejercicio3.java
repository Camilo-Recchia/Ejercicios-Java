/*
 *Descripción: Formulador de codigo segun tu nombre
 *Autor: Camilo Villarroel Recchia
 *Fecha: 31/10/2025
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
	
	String nombre, apellido_1, apellido_2, codigo;
	
	System.out.print("Digame su nombre: ");
	nombre = teclado.nextLine();
	
	System.out.print("Digame su apellido 1º: ");
	apellido_1 = teclado.nextLine();

	System.out.print("Digame su apellido 2º: ");
	apellido_2 = teclado.nextLine();
	
	nombre = nombre.substring(0,3);
	
	nombre = nombre.toUpperCase();
	
	apellido_1 = apellido_1.substring(0,3);
	
	apellido_1 = apellido_1.toUpperCase();
	
	apellido_2 = apellido_2.substring(0,3);
	
	apellido_2 = apellido_2.toUpperCase();
	
	codigo = nombre+apellido_1+apellido_2;
	
	System.out.println(codigo);
}
}
