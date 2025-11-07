package operadorCondicional;

import java.util.Scanner;

public class OperCadenas {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		
		int longitud;
		String name;
		String nombreminuscula;
		
		System.out.print("Dime tu nombre ");
		name = teclado.nextLine();
		
		longitud = name.length();
		System.out.println("Tu nombre tiene "+longitud+" letras");
		
		nombreminuscula = name.toLowerCase();
		System.out.println("Tu nombre en minuscula es: "+nombreminuscula);

		System.out.println("Tu nombre en mayuscula es: "+name.toUpperCase());
		

	}

}
