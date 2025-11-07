/*
 *Descripción: Calculadora de pesetas a euros
 *Autor: Camilo Villarroel Recchia
 *Fecha: 1/10/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		double pesetas, euro;
		
		System.out.print("-------------------------------------------------\nIntroducir cantidad de euros a pasar a pesetas: ");
		euro = teclado.nextInt();
		
		
		pesetas = euro*166386;
		
		System.out.println("Estos "+euro+"€ en pesetas son "+pesetas+"pst");
		
		System.out.println("-------------------------------------------------\nIntroducir cantidad de pesetas a pasa a euros: ");
		pesetas = teclado.nextInt();
		
		euro = pesetas/166386;
		
		System.out.print("Estas "+pesetas+"pst en euros son "+euro+"€\n-------------------------------------------------");
		
	}

}
