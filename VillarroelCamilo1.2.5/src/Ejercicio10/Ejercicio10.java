package Ejercicio10;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int base,altura,area;
		System.out.println("--------------------------------\n    Calcular area Triangulo\n--------------------------------\n");
		
		System.out.print("Introduzca la base del triangulo: ");
		base = teclado.nextInt();
		System.out.print("Introduzca la altura del triangulo: ");
		altura = teclado.nextInt();
		
		area = (base*altura)/2;
		
		System.out.print("--------------------------------\nEl area del triangulo es "+area );

	}

}
