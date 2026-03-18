package pelicula;

import java.time.LocalDate;
import java.util.Scanner;

public class MainPelicula {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Pelicula[] pelis = new Pelicula[100];

		Pelicula pelicula1 = new Pelicula("Zaza el Italiano", (short) 128, LocalDate.now(), 7.5, "ACCION");

		int annos = LocalDate.now().getYear() - pelicula1.getRealizacion().getYear();
		System.out.printf("La pelicula fue creada hace %d %s", annos, annos == 1 ? "año" : "años");
		System.out.println("");

		try {
			pelicula1.setCalificacion((double) (Math.random() * 10) + 5);
		} catch (Exception ex1) {
			System.out.printf("No se pudo modificar la calificacion porque: %s", ex1.getMessage());
		}
		
		for(int i = 0; i <100;i++) {

			pelicula1.peliculasDeSuspenseAleatorias(100)[i].toString();
			
		}
		
		
		
	}

}
