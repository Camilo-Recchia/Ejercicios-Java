package condicionIf;

import java.util.Scanner;

public class CondicionIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int edad;
		
		System.out.print("Introduzca su edad: ");
		edad = teclado.nextInt();
		
		if (edad>=18) {
			
			System.out.print("Usted es mayor de edad y esta capacitado para conducir");	
			
		}
		
			else {
			
				System.out.print("Usted es menor de edad y no esta capacitado para conducir");
			
				}
		}

}
