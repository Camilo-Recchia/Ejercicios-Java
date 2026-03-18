package Coche;

import java.time.LocalDate;

public class CocheMain {

	public static void main(String[] args) {

		System.out.println(Coche.generadorMatriculas());

		Coche c = new Coche();

		System.out.printf("%s", c.toString());
		Deportivo d = new Deportivo(Coche.generadorMatriculas(), "Camilo", LocalDate.now(), (short) 0, (short) 0,
				"total");
		System.out.println();
		System.out.printf("%s", d.toString());

	}

}
