/*
 *Descripción: Mostrar " Hola + nombre usuario"
 *Autor: Camilo Villarroel Recchia
 *Fecha: 07/10/2025
 */
package ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		
		System.out.print("Introduzca su nombre: ");
		nombre = teclado.nextLine();
		
		System.out.print("Hola "+nombre);
		
		
	}

}
