package ejercicio2;

import ejercicio1.Cancion;

public class CDMain {

	public static void main(String[] args) {

		CD unCD = new CD();

		Cancion c = new Cancion("Bohemian-Rapsodia", "Queen");
		Cancion c2 = new Cancion("Nueva-Era", "Duki");
		Cancion c3 = new Cancion("StarMan", "Davi Bowiee");

		unCD.agregaCancion(c);
		unCD.agregaCancion(c2);
		unCD.agregaCancion(c3);

		System.out.printf("El CD: %d Tiene %d canciones guardadas", 1, unCD.numeroCanciones());

		System.out.println(unCD.dameCancion(0));

		unCD.eliminar(1);

		CD otroCD = new CD(unCD);

		otroCD.agregaCancion(c2);

		System.out.printf("%s", otroCD.mostrarCD());

	}

}
