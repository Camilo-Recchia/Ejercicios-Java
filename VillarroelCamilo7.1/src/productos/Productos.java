/*
 *Descripción: Clase para crear Objeto Productos
 *Autor: Camilo Villarroel Recchia
 *Fecha: 11/02/2026
 */
package productos;

import java.time.LocalDate;

public class Productos {

	// Atributos finales de clase
	public static final int MAX_NUM_ID = 9999;

	// Atributos variables de clase
	protected static int contador = 0;

	// Atributos variables de objeto
	protected final String id;
	protected String nombreProducto;
	protected LocalDate fechaCaducidad;
	private LocalDate fechaCreacion;
	protected int numLote;

	// Constructor con 3 parametros
	Productos(String nombreProducto, LocalDate fechaCaducidad, int numLote) throws IllegalArgumentException {
		if (nombreProducto.isBlank() || nombreProducto == null) {
			throw new IllegalArgumentException("El nombre del producto debe de estar lleno y no ser null");
		} else if (fechaCaducidad.isBefore(LocalDate.now())) {
			throw new IllegalArgumentException("La fecha de caducidad debe ser una fecha en el futuro.");
		} else if (numLote <= 0) {
			throw new IllegalArgumentException("El numero de lote tiene que ser mayor que 0");
		}

		this.nombreProducto = nombreProducto;
		this.fechaCaducidad = fechaCaducidad;
		this.numLote = numLote;
		this.fechaCreacion = LocalDate.now();
		id = generadorID();
	}

	// Devuelve el nombre del producto

	public String getNombreProducto() {
		return nombreProducto;
	}

	// Establece el nombre del producto

	public void setNombreProducto(String nombreProducto) throws IllegalArgumentException {
		if (nombreProducto.isBlank() || nombreProducto == null) {
			throw new IllegalArgumentException("El nombre del producto debe de estar lleno y no ser null");
		}
		this.nombreProducto = nombreProducto;
	}

	// Devuelve el numero de lote

	public int getNumLote() {
		return numLote;
	}

	// Establece el numero de lote

	public void setNumLote(int numLote) throws IllegalArgumentException {
		if (numLote <= 0) {
			throw new IllegalArgumentException("El numero de lote tiene que ser mayor que 0");
		}
		this.numLote = numLote;
	}

	// Devuelve el ID del producto

	public String getID() {
		return id;
	}

	// Devuelve la fecha de caducidad

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	// Devuelve cuantos dias faltan para su caducidad

	public int diasHastaCaducar() {
		int dias_anio_actual = LocalDate.now().getDayOfYear() - fechaCreacion.getDayOfYear();
		int dias_anios = 0;
		for (int i = 0; i < fechaCaducidad.getYear() - fechaCreacion.getYear(); i++) {
			dias_anios = dias_anios + 365;
		}
		return dias_anio_actual + dias_anios;
	}

	// Dice si un producto esta caducado o no

	public boolean isCaducado() {

		return fechaCaducidad.isAfter(LocalDate.now());
	}

	// Devuelve una frase con la informacion del producto

	public String toString() {
		String frase = String.format("ID: %04d - Nombre: %s - Fecha de Cafucidad: %02d/%02d/%04d - Numero lote: %d",
				id, nombreProducto, fechaCaducidad.getDayOfMonth(), fechaCaducidad.getMonthValue(),
				fechaCaducidad.getYear(), numLote);
		return frase;
	}

	private String generadorID() {
		if (contador >= MAX_NUM_ID) {
			throw new IllegalArgumentException("Maxima cantidad de productos creados");
		}
		return String.format("%04d", id + contador++);
	}

}
