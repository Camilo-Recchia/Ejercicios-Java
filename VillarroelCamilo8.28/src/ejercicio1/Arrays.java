package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays {

	public static void main(String[] args) {

		Atleta a;

		ArrayList<Atleta> list = new ArrayList<Atleta>();

		String[] media;

		for (int i = 0; i < 10; i++) {

			a = new Atleta();

			list.add(a);

		}

		Collections.sort(list, new ComparadorAtletas());

		System.out.println("----------------------Lista----------------------");

		for (int j = 0; j < list.size(); j++) {

			System.out.printf("\nValor %d: \t%s", j, list.get(j).toString());
		}

		System.out.printf("\n\n----------------------Medias----------------------\nMedia edades: %d", mediaEdad(list));
		System.out.printf("\nMedia alturas: %.2f", mediaAltura(list));
		System.out.printf("\nCantidad de menores: %d", menores(list));
		System.out.printf("\nCantidad de mayores: %d", list.size() - menores(list));

		System.out.printf("\nAtletas por encima de la media: ");

		media = atletasDotados(list, mediaAltura(list));

		for (int i = 0; i < media.length; i++) {
			System.out.printf(" %s", media[i]);
		}
	}

	public static int mediaEdad(ArrayList<Atleta> list) {

		int edades = 0;

		int contador = 0;

		for (Atleta i : list) {
			edades += i.getEdad();

			contador++;

		}

		return edades / contador;

	}

	public static double mediaAltura(ArrayList<Atleta> list) {

		double altura = 0;

		int contador = 0;

		for (Atleta i : list) {
			altura = +i.getAltura();

			contador++;
		}

		return altura / contador;

	}

	public static int menores(ArrayList<Atleta> list) {

		int menores = 0;

		for (Atleta i : list) {
			if (i.menor()) {
				menores++;
			}

		}

		return menores;
	}

	public static String[] atletasDotados(ArrayList<Atleta> list, double mediaAltura) {

		String[] media = new String[list.size()];

		int contador = 0;

		for (Atleta i : list) {
			if (mediaAltura < i.getAltura()) {
				media[contador] = i.getNombre();

				contador++;
			}
		}

		return media;
	}

}
