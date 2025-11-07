/*
 *Descripción: Imprimir nota 
 *Autor: Camilo Villarroel Recchia
 *Fecha: 08/10/2025
 */
package ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int nota;
		
		System.out.print("Introduzca su nota: ");
		nota = teclado.nextInt();
		
		switch(nota){
		
		case 0,1,2,3,4:
			System.out.print("Tu nota es Insuficiente");
			break;
		case 5:
			System.out.print("Tu nota es Suficiente");
			break;
		case 6,7:
			System.out.print("Tu nota esta Bien");
			break;
		case 8,9:
			System.out.print("Tu nota es Notable");
			break;
		case 10:
			System.out.print("Tu nota es Exelente, felicidades");
			break;
		default:
			System.out.print("La nota introducida ha sido incorrecta. Por favor intentelo de nuevo"); System.exit(0);
			break;
		}

	}
}
