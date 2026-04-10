/*
 *Descripción: Clase Apartamento. Hija de Vivienda, representa una apartamento comun.
 *Autor: Camilo Villarroel Recchia
 *Fecha: 25/03/2026
 */

package Villarroel;

import java.time.LocalDate;

public class Apartamento extends Vivienda {

	// Metodos constantes de clase
	public static final double M2_DEFAULT = 80;
	public static final double DISTANCIA_CENTRO_DEFAULT = 80;
	public static final LocalDate FECHA_REFORMA_DEFAULT = LocalDate.now();

	// Metodo variables de objeto
	protected double m2;
	protected double distanciaCentro;
	protected LocalDate fechaReforma;

	// Constructor hijo con 3 parametros extra
	public Apartamento(LocalDate fechaCostruccion, String direccion, boolean disponible, double m2,
			double distanciaCentro, LocalDate fechaReforma) throws IllegalArgumentException {
		super(fechaCostruccion, direccion, disponible);

		if (fechaReforma.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("La fecha de la ultima reforma debe ser antes de la actualidad");
		}

		this.m2 = m2;
		this.distanciaCentro = distanciaCentro;
		this.fechaReforma = fechaReforma;
	}

	// Devuelve si un apartamento es modesto o no segun la fecha de remodelacion
	public boolean isModesto() {
		boolean t = false;

		if (fechaReforma.getYear() > LocalDate.now().getYear() - 5) {
			t = true;
		}

		return t;
	}

	@Override
	// Devuelve el precio del apartamento segun su distancia del centro
	public double getPrecio(double precio) {

		if (disponible) {
			precio = precio * m2 * m2;
		}

		if (distanciaCentro < 2) {
			precio += precio * 0.15;
		}
		return precio;
	}

	@Override
	// Genera una cadeba con los valores de el apartamento
	public String toString() {
		return super.toString() + " m2=" + m2 + ", distanciaCentro=" + distanciaCentro + ", fechaReforma="
				+ fechaReforma + "]";
	}

}
