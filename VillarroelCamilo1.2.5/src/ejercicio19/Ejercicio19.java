package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double tiempo,minutos,horas;
		
		System.out.print("Introduzca un tiempo en segundos: ");
		tiempo = teclado.nextInt();
	
		horas = tiempo/3600;
		minutos = tiempo/60;
		
		System.out.println("Eso son "+tiempo+" segundos, "+minutos+" minutos y "+horas+" horas");
	}

}
