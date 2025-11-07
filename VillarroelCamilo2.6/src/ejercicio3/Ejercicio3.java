/*
 *Descripción: Programa de admición para mayores de 18 años
 *Autor: Camilo Villarroel Recchia
 *Fecha: 06/10/2025
 */
package ejercicio3;
	
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int edad;	//Inicialización de variables int
		String nombre, apellidos;	//inicialización de las variables String
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Por favor introduzca su edad: ");
		edad = teclado.nextInt();
		
		if (edad>=18) { //Admición solo para +18
		System.out.println("Intoduzca su nombre y apellidos: ");
		
		System.out.print("Nombre: ");
		teclado.nextLine();
		nombre = teclado.nextLine();

		System.out.print("Apellidos: ");
		apellidos = teclado.nextLine();
		
		
		System.out.println("\nNombre: "+nombre+"\nApellidos: "+apellidos+"\nEdad: "+edad+"\n\nUsted a sido admitido"); //Frase de admición
		
		
		} else {
			System.out.print("No tiene la edad requerida para realizar estos estudios."); //Frase de rechazo
		}
	}

}
