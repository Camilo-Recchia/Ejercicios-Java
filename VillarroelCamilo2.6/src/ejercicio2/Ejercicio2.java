/*
 *Descripción: Requerimientos para entrar en un curso
 *Autor: Camilo Villarroel Recchia
 *Fecha: 03/10/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		int nota,edad;
		//Creamos la varibales con las que vamos a trabajar
		
		System.out.println("Prueba de requerimientos para entrar al curso. Por favor Introduzca los siguientes datos: ");
		
		System.out.print("Nombre: ");
		nombre = teclado.next();
		
		System.out.print("Edad: ");			//Peticion de datos al usuario
		edad = teclado.nextInt();
		
		System.out.print("Nota Académica: ");
		nota = teclado.nextInt();
		

		if (edad>=18)
		if (nota>=7)
		System.out.print(nombre+", usted ha sido admitido en el curso, cumple las condiciones requeridas.");
		else System.out.print(nombre+">, lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos");
	}

}
