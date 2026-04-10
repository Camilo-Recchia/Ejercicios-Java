/*
 *Descripción: Clase abstracta Vivienda. Padre de Apartamento y Unifamiliar
 *Autor: Camilo Villarroel Recchia
 *Fecha: 25/03/2026
 */

package Villarroel;

import java.time.LocalDate;

public abstract class Vivienda {

	// Metodos constantes de clase
	public static final int MAX_VIVIENDAS = 999;
	public static final LocalDate FECHA_CONSTRUCCION_DEFAULT = LocalDate.now();
	public static final String DIRECCION_DEFAULT = "DEFAULT";
	public static final boolean DISPONIBLE_DEFAULT = true;

	// Metodos variables de clase
	protected static int contadorViviendas;

	// Metodos constantes de objeto
	protected final String identificador;

	// Metodos variables de objeto
	protected LocalDate fechaCostruccion;
	protected String direccion;
	protected boolean disponible;

	// Constructor con 3 parametros
	public Vivienda(LocalDate fechaCostruccion, String direccion, boolean disponible) throws IllegalArgumentException {

		if (contadorViviendas >= MAX_VIVIENDAS) {
			throw new IllegalArgumentException("No se pueden crear mas viviendas.");
		}

		this.fechaCostruccion = fechaCostruccion;
		this.direccion = direccion;
		this.disponible = disponible;
		this.identificador = generadorID();
		contadorViviendas++;
	}

	/**
	 * @return the contadorViviendas
	 */
	public static int getContadorViviendas() {
		return contadorViviendas;
	}

	/**
	 * @param disponible the disponible to set
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	// Devuelve el precio de la vivienda segun unas caracteristicas
	public abstract double getPrecio(double precio);

	@Override
	// Genera una cadena con la informacion de la vivienda
	public String toString() {
		return "Vivienda [identificador=" + identificador + ", fechaCostruccion=" + fechaCostruccion + ", direccion="
				+ direccion + ", disponible=" + disponible + "]";
	}

	// Genera un valor valido para el identificador siendo: "AA-XXX"
	private String generadorID() {

		double fecha = (double) fechaCostruccion.getYear() / 100;

		int fechaReal = (int) ((fecha - Math.round(fechaCostruccion.getYear()) / 100) * 100);

		return String.format("%d-%03d", fechaReal, contadorViviendas);
	}

}
