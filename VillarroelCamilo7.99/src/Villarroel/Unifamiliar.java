/*
 *Descripción: Clase Unifamiliar. Hija de Vivienda, representa una vivienda unifamiliar comun.
 *Autor: Camilo Villarroel Recchia
 *Fecha: 12/02/2026
 */
package Villarroel;

import java.time.LocalDate;

public class Unifamiliar extends Vivienda {

	// Metodos constantes de clase
	public static final double M2_DEFAULT = 40;
	public static final boolean PATIO_DEFAULT = false;

	// Metodo variables de objeto
	protected double m2;
	protected boolean patio;

	// Constructor hijo con 2 parametros extra
	public Unifamiliar(LocalDate fechaCostruccion, String direccion, boolean disponible, double m2, boolean patio)
			throws IllegalArgumentException {
		super(fechaCostruccion, direccion, disponible);

		if (m2 < 0) {
			throw new IllegalArgumentException("Los metros cuadrados no pueden ser negativos.");
		}

		this.m2 = m2;
		this.patio = patio;
	}

	// Devuelve si la vivienda es grande o no.
	public boolean isGrande() {
		boolean t = false;

		if (m2 > 100 && patio) {
			t = true;
		}

		return t;
	}

	/**
	 * @param patio the patio to set
	 */
	public void setPatio(boolean patio) {
		this.patio = patio;
	}

	@Override
	// Devuelve el precio de la vivienda dependiendo de si tiene patio o no
	public double getPrecio(double precio) {

		if (disponible) {
			precio = precio * m2 * m2 * 1.5;
		}

		if (patio) {
			precio += precio * 0.25;
		}

		return 0;
	}

	@Override
	// Devuelve una cadena de carateres con los valores de la vivienda unifamiliar
	public String toString() {
		return super.toString() + " m2=" + m2 + ", patio=" + patio + "]";
	}

}
