package pruebaIf;

import java.util.Scanner;

public class PruebaIF {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int notaNumero;
		
		String notaLetra = "rico";
		
		System.out.print("Introduzca un número entero: ");
		notaNumero = teclado.nextInt();
	
		if(0<=notaNumero &&notaNumero<=10)
		{		
		if ( notaNumero < 5 ) 
			notaLetra= "INSUFICIENTE";
		else  if ( notaNumero < 6  ) 
			notaLetra= "SUFICIENTE";
		else if (  notaNumero < 7  )
			notaLetra= "BIEN";
		else if ( notaNumero < 9 )
			notaLetra= "NOTABLE";
		else notaLetra = "SOBRESALIENTE";
		
		} else {	System.out.print("ERROR!");
		
		System.exit(0);
			}

		System.out.println ("Tu nota es: " + notaLetra);	
		
		
		
		
		
		
		
	
	}
	
}