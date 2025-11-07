package ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double hora,minutos;
		
		System.out.println("Introduzca las horas y minutos que tardaban los camiones en llegar a su destino: ");
	
		System.out.print("Horas: ");
		hora = teclado.nextInt();
		System.out.print("Minutos: ");
		minutos = teclado.nextInt();
		
		hora = (int)hora - (int)hora*0.15;
		
		System.out.println(hora);
	}

}
