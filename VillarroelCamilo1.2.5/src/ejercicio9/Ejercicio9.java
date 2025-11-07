package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int base,altura,area;
		
		System.out.println("--------------------------------\n    Calcular area Rectangulo\n--------------------------------\n");
		
		System.out.print("Introduzca la base del rectangulo: ");
		base = teclado.nextInt();

		System.out.print("Introduzca la altura del rectangulo: ");
		altura = teclado.nextInt();
		
		
		area = base*altura;
		
		if(base==altura)
		System.out.print("--------------------------------\nEso es un cuadrado, porque sus lados son iguales, y su area es "+area);
		else System.out.print("--------------------------------\nEl area del rectangulo es "+area );
		
	}

}
