/*
 * Objetivo: mostrar el desarrollo de las clases creadas
 * Fecha: 18/02/2026
 * Autor: Camilo
 */
package Villarroel;

import java.time.LocalDate;
import java.util.Scanner;

public class PrincipalTransportes {

	public static void main(String[] args) {

		Scanner tecaldo = new Scanner(System.in);

		System.out.println("Un camion se interpreta como tipo 1, una furgoneta como 2 y una motocileta como 3.");

		// 1. Crea un camión con 20 tn de carga máxima.
		// Evidencia. El valor de cada uno de los atributos
		System.out.println(" 1 ============");
		TransportesPlayamar p = new TransportesPlayamar(null, LocalDate.now(), false, 0, 0, 20);

		System.out.printf("%s", p.toString());

		System.out.println();
		// 2. Calcula el precio para un transporte de 200 kms.
		// Evidencia: el precio del transporte.
		System.out.println(" 2 ============");
		p.setKm(200);
		p.setTarifabase(100);
		System.out.printf("%.2f", p.calcularPrecioDeTransporte());
		System.out.println();

		// 3. Crea una furgoneta con el volumen máximo permitido (valor solicitado al
		// usuario) y refrigerado (solicitado al usuario). Resto de valores por defecto.
		// Evidencia. El valor de cada uno de los atributos
		System.out.println(" 3 ============");
		System.out.print("Dame el volumen maximo de transporte de la furgoneta: ");
		short volumen = tecaldo.nextShort();
		System.out.print("DIme si la furgoneta tiene refrigeracion: ");
		boolean refri = tecaldo.nextBoolean();

		TransportesPlayamar f = new TransportesPlayamar(null, LocalDate.now(), false, 0, 0, refri, volumen);

		System.out.printf("%s", f.toString());
		System.out.println();

		// 4. Calcula el precio del transporte para 50 kms.
		// Evidencia: el precio del transporte.
		System.out.println(" 4 ============");
		f.setKm(50);
		f.setTarifabase(100);
		System.out.printf("%.2f", f.calcularPrecioDeTransporte());
		System.out.println();

		// 5. Crea una motocicleta con valores por defecto.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println(" 5 ============");

		TransportesPlayamar m = new TransportesPlayamar(null, LocalDate.now(), false, (double) 0, (double) 0, (short) 0,
				false);

		System.out.printf("%s", m.toString());

		System.out.println();

		// 6. Calcula el precio de un transporte para 20 kms.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println(" 6 ============");

		m.setKm(20);
		m.setTarifabase(100);
		System.out.printf("%.2f", m.calcularPrecioDeTransporte());

		System.out.println();
		// 7. Modifica el valor de ITV de la motocicleta a sí.
		// Evidencia: El valor de cada uno de los atributos.
		System.out.println(" 7 ============");
		m.setItv(true);

		System.out.printf("%s", m.toString());

		System.out.println();
		// 8. Indica si la motocicleta tiene cajón de transporte.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println(" 8 ============");
		System.out.printf("La moto tiene cajon? = %b", m.getCajon());

		System.out.println();
		System.out.printf("%s", m.toString());
		System.out.println();
		// 9. Modifica el valor de la tarifa base a la motocicleta.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println(" 9 ============");

		m.setTarifabase(15);

		System.out.printf("%s", m.toString());
		System.out.println();

		// 10. Crea un camión con todos los valores solicitados al usuario (el objeto
		// debe ser creado por un método).
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println(" 10 ============");

		// 11. Calcula el número de vehículos creados.
		// Evidencia. El número de vehículos creados.
		System.out.println(" 11 ============");

		System.out.printf("La cantidad de vehiculos creados es de: %d", TransportesPlayamar.getTotalVehiculos());

	}

	public static TransportesPlayamar crearCamion() {
		TransportesPlayamar p = null;
		return p;
	}

}
