package tipoEnumerado;

import java.util.Scanner;

public class TipoEnumerado {

	public enum Estaciones {
		Verano, Primavera, Otoño, Invierno
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Estaciones estacionActual = Estaciones.Verano;
		Estaciones proximaEstacion = Estaciones.Otoño;

		System.out.print("Estamos en la estación de " + estacionActual + " y la siguiente es " + proximaEstacion);

	}

}
