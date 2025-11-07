package pruebasCamilo;

import java.util.Scanner;

public class EntornoDePrubas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numeroFallos, numeroAciertos;
		double nota = 0;
		String notaLetra = "rico";

		System.out.print(
				"____________________________________________\n|                                           |\n|     Calcula el Resultado de tu Examen     |\n|___________________________________________|\n\n");

		System.out.print("Por Favor introduzca su numero de acietos: ");
		numeroAciertos = teclado.nextInt();
		System.out.print("Por Favor introduzca su numero de fallos: ");
		numeroFallos = teclado.nextInt();

		if (numeroFallos + numeroAciertos <= 20 && numeroFallos + numeroAciertos >= 0) {
			nota = (numeroAciertos * 0.5) - (numeroFallos * 0.25); // Calculo de nota del usuario
			if (nota < 5)
				notaLetra = "Insuficiente";
			else if (nota < 6)
				notaLetra = "Suficiente";
			else if (nota < 7)
				notaLetra = "Bien";
			else if (nota < 8)
				notaLetra = "Notable";
			else
				notaLetra = "Sobresaliente";

		} else {
			System.out.print("\nDatos Erróneos.");
			System.exit(0);
		} // Nota Erronea

		System.out.print("\nTu nota en el examen es un " + nota + ". Su nota es " + notaLetra);

	}

}
