/*
 *Descripción: Clase para crear Objeto Productos Frescos
 *Autor: Camilo Villarroel Recchia
 *Fecha: 11/02/2026
 */
package productos;

import java.time.LocalDate;

public class ProductosFrescos extends Productos {

	protected LocalDate fechaEnvasado;
	protected String paisOrigen;

	// Comstructor con 5 parametros
	ProductosFrescos(String nombreProducto, LocalDate fechaCaducidad, int numLote, LocalDate fechaEnvasado,
			String paisOrigen) throws IllegalArgumentException {
		super(nombreProducto, fechaCaducidad, numLote);
		if (fechaEnvasado.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("La fecha de envasado debio ser anterior o igual al dia actual");
		} else if (paisOrigen.isBlank() || paisOrigen.isEmpty()) {
			throw new IllegalArgumentException("El pais de origen debe estar lleno");
		}

		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}

	// Devuelve el pais de origen

	public String getPaisOrigen() {
		return paisOrigen;
	}

	// Establece el pais de origen

	public void setPaisOrigen(String paisOrigen) {
		if (paisOrigen.isBlank() || paisOrigen.isEmpty()) {
			throw new IllegalArgumentException("El pais de origen debe estar lleno");
		}
		this.paisOrigen = paisOrigen;
	}

	// Fevuelve la fecha de Envasado

	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}

	// Devuelve una frase con la informacion del producto

	@Override
	public String toString() {
		String frase = super.toString() + String.format(" - Fecha de Envasado: %02d/%02d/%04d - Pais de Origen: %s",
				fechaEnvasado.getDayOfMonth(), fechaEnvasado.getMonthValue(), fechaEnvasado.getYear(), paisOrigen);
		return frase;
	}

}
