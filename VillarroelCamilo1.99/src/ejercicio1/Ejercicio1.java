package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public enum Operaciones {
		OPERACION, FUERZA_PESO, NUMERO_VUELTAS, AREA_CIRCULO
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Operaciones operacion = Operaciones.OPERACION;
		Operaciones fuerza_Peso = Operaciones.FUERZA_PESO;
		Operaciones numero_Vueltas = Operaciones.NUMERO_VUELTAS;
		Operaciones area_Circulo = Operaciones.AREA_CIRCULO;

		System.out.println("CÁLCULO EXPRESIONES FÍSICAS/MATEMÁTICAS\n-----------------------------------");

		System.out.print("Introduce el valor de X: ");
		double x = teclado.nextInt();

		System.out.print("Introduce la masa (kg): ");
		int masa = teclado.nextInt();

		System.out.print("Introduce el tiempo (s): ");
		int tiempo = teclado.nextInt();

		System.out.print("Introduce la frecuencia (hz): ");
		double frecuencia = teclado.nextDouble();

		System.out.print("Introduce el radio del círculo (m): ");
		double radio = teclado.nextDouble();

		// Calculo de la Operación de Primer Grado
		double valorOperacion = (((x + (x / 4))) / ((6 - (x / 2))));

		// Calculo de la Fuerza Peso
		double valorFuerzaPeso = masa * Math.PI;

		// Calculo del Numero de Vueltas
		double valorVueltas = (int) (frecuencia * tiempo); // Aqui utilice un casting para transformar el resultado de
															// un
		// double a un int

		// Calculo Area
		double areaCirculo = Math.PI * radio * radio;

		System.out.println("\nRESULTADOS\n----------");
		System.out.println(operacion + ": " + valorOperacion);
		System.out.println(fuerza_Peso + ": " + valorFuerzaPeso);
		System.out.println(numero_Vueltas + ": " + valorVueltas);
		System.out.println(area_Circulo + ": " + areaCirculo);

		teclado.close();

	}

}
