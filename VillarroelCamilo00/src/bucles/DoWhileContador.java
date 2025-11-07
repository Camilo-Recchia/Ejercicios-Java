/*
 *Descripción: Contador de numeros con bucle DoWhile 
 *Autor: Camilo Villarroel Recchia
 *Fecha: 10/10/2025
 */
package bucles;
import java.util.Scanner;
public class DoWhileContador {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int inicio,fin;
		
		System.out.print("Introduzca el inicio: ");
		inicio= teclado.nextInt();
		System.out.print("Introduzca el final: ");
		fin= teclado.nextInt();
	
		
		if(inicio<fin+1) {
			System.out.println("\nSecuencia de numeros de "+ inicio +" a "+fin+"\n");
		
			do{
				System.out.print(inicio+" ");
				inicio++;		} 
			while(inicio!=fin); 	//fin+1 porque sino se pierde el utimo valor dr fin
		
		} else {	
			
				System.out.println("\nSecuencia de numeros de "+ inicio +" a "+fin+"\n");
				do {
					System.out.print(+inicio+" ");
					inicio--;		}
				while(inicio!=fin-1);	//fin-1 porque el ultimo valor de fin
				
		
			}
		teclado.close();
	}
} 
	


