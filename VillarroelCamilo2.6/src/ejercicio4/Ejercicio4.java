/*
 *Descripción: Comprobante de Cupon de SuperMercado
 *Autor: Camilo Villarroel Recchia
 *Fecha: 06/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		String nombre,apellidos; //inicialización de las variables String
		int gasto1,gasto2,gasto3,gasto4,gastomes; //inicialización de las variables int
		
		
		
		System.out.println("----------------------------------------\n      Por favor introduzca sus datos ");
		
		System.out.print("----------------------------------------\nNombre: ");
		nombre = teclado.nextLine();
		
		System.out.print("Apellidos: ");
		apellidos = teclado.nextLine();
		
		System.out.println("----------------------------------------\nIntroduzca sus gastos del mes: ");
		
		System.out.print("Gasto 1: ");
		gasto1 = teclado.nextInt();
		
		System.out.print("Gasto 2: ");
		gasto2 = teclado.nextInt();
		
		System.out.print("Gasto 3: ");
		gasto3 = teclado.nextInt();
	
		System.out.print("Gasto 4: "); 
		gasto4 = teclado.nextInt();
	
		
		gastomes = (gasto1+gasto4+gasto3+gasto2)/4; //Calcular el gasto medio del mes
		
		System.out.println("\nTu gasto medio del mes es de "+gastomes+"€\n");
		
		if(gastomes>=300) //Solo se les provee a los que gastaron una media de 300€
			System.out.print("Genial Sr/a "+nombre+", como tu gasto mensual medio alcanza los 300€ decidimos regalarte un cupon del 50% para tu proxima compra, gracias por elegirnos.");
		else System.out.print("Lo sentimos Sr/a "+nombre+", como tu gasto mensual medio no alcanza los 300€ no te podremos regalar nuestro cupon del 50% para tu proxima compra.");
		
	
	}

}
