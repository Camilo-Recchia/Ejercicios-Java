package arrays;

import java.util.Iterator;

public class Vectores {

	public static void main(String[] args) {

		final int TOTAL_NUM = 20;

		int[] numeros = new int[TOTAL_NUM];

		for (int i = 0; i < TOTAL_NUM; i++) {

			numeros[i] = (int)((Math.random())*50);
			numeros[3] = 5;
			System.out.println("El valor que hay en la posicion " + i + " es " + numeros[i]);
		}

	}
}
