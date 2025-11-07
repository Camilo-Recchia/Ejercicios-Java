/*
 *Descripción: Valores dentro de la clase "Math"
 *Autor: Camilo Villarroel Recchia
 *Fecha: 1/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		double var;
		
		System.out.print("Introduzca el valor de la variable: ");
		var = teclado.nextDouble();
		
		System.out.print("El valor de la variable aplicandole el Math.celi es: "+Math.ceil(var)+". Porque Math.ceil redondea a un numero mayor o igual al dado");		
		System.out.print("\nEl valor de la variable aplicandole el Math.round es: "+Math.round(var)+". Porque Math.round redondea al siguiente numero entero");		
		System.out.print("\nEl valor de la variable aplicandole el Math.floor es: "+Math.floor(var)+". Porqque Math.floor redondea a un numero menor o igual al dado");		
	}

}
