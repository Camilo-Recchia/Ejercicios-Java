package Villarroel;

import java.time.LocalDate;

public class PrincipalVivienda {

	public static void main(String[] args) {

		// 1. Apartamento por defecto
		Apartamento a1 = new Apartamento(Vivienda.FECHA_CONSTRUCCION_DEFAULT, Vivienda.DIRECCION_DEFAULT,
				Vivienda.DISPONIBLE_DEFAULT, Apartamento.M2_DEFAULT, Apartamento.DISTANCIA_CENTRO_DEFAULT,
				Apartamento.FECHA_REFORMA_DEFAULT);

		System.out.printf("\n%s", a1.toString());
		// 2. Precio 1500€/m2
		System.out.printf("\n\nEl precio de la vivienda es de: %.2f", a1.getPrecio(1500));
		// 3. Apartamento con datos usuario

		System.out.print("\n\nDime la distancia al centro: ");
		double distancia = Entrada.real();

		System.out.print("Dime el año de la ultima reforma: ");
		int anno = Entrada.entero();

		System.out.print("Dime el mes de la ultima reforma: ");
		int mes = Entrada.entero();

		System.out.print("Dime el dia de la ultima reforma: ");
		int dia = Entrada.entero();

		LocalDate fecha = LocalDate.of(anno, mes, dia);

		Apartamento a2 = new Apartamento(Vivienda.FECHA_CONSTRUCCION_DEFAULT, Vivienda.DIRECCION_DEFAULT,
				Vivienda.DISPONIBLE_DEFAULT, Apartamento.M2_DEFAULT, distancia, fecha);

		System.out.printf("\n%s", a2.toString());

		// 4. Precio 800€/m2

		System.out.printf("\n\nEl precio de la vivienda es de: %.2f", a2.getPrecio(800));

		// 5. Unifamiliar por defecto

		Unifamiliar u1 = new Unifamiliar(Vivienda.FECHA_CONSTRUCCION_DEFAULT, Vivienda.DIRECCION_DEFAULT,
				Vivienda.DISPONIBLE_DEFAULT, Unifamiliar.M2_DEFAULT, Unifamiliar.PATIO_DEFAULT);

		System.out.printf("\n%s", u1.toString());

		// 6. Unifamiliar con m2 usuario

		System.out.print("\n\nDime los metros cuadrados de la vivienda: ");
		double m2 = Entrada.real();

		Unifamiliar u2 = new Unifamiliar(Vivienda.FECHA_CONSTRUCCION_DEFAULT, Vivienda.DIRECCION_DEFAULT,
				Vivienda.DISPONIBLE_DEFAULT, m2, Unifamiliar.PATIO_DEFAULT);

		System.out.printf("\n%s", u2.toString());

		// 7. Es grande?

		System.out.printf("\n\nEs la vivienda unifamilar 2 grande?: %s", u2.isGrande() ? "si" : "no");

		// 8. Modifica el valor de disponible a "no".

		u2.setDisponible(false);

		System.out.printf("\n%s", u2.toString());

		// 9. Calcular el precio de venta para 1100€/m2

		System.out.printf("\n\nEl precio de la vivienda es de: %.2f", u2.getPrecio(1100));

		// 10. Modifica el valor de patio de la ultima casa a "si".

		u2.setPatio(true);

		System.out.printf("\n%s", u2.toString());

		// 11. Total viviendas

		System.out.printf("\n\nHay %d viviendas en total", Vivienda.getContadorViviendas());

	}

}