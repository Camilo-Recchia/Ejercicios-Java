package operadorCondicional;

import java.util.Scanner;

public class OperadorCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int dato1, dato2;
		double dato3;
		String resultado;
		
		System.out.println("Dime el dato 1:");
		dato1 = teclado.nextInt();
		
		resultado = (dato1 > 18) ? "Mayor" : "Menor";
		System.out.print(resultado);
		
		
	}

}
