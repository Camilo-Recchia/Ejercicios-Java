package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {

		int[][] numeros = new int[5][5];

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				numeros[i][j] = i*j;
			}
		}

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				System.out.print(numeros[i][j]+" ");
			}
			System.out.println("");

		}

	}

}
