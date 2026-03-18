/*
 *Descripción: Clase para crear Objeto Productos Refrijerados
 *Autor: Camilo Villarroel Recchia
 *Fecha: 11/02/2026
 */
package productos;

import java.time.LocalDate;

public class ProductosRefrigerados extends Productos {

	protected final static short TEMPERATURA_MINIMA_CONS = 3;
	protected short temperaturaMinimaConservacion;
	protected String codigoSupervisora;
	protected LocalDate fechaConsumo;

	ProductosRefrigerados(String nombreProducto, LocalDate fechaCaducidad, int numLote, String codigoSupervisora,
			LocalDate fechaConsumo, short temperaturaMinima) throws IllegalArgumentException {
		super(nombreProducto, fechaCaducidad, numLote);
		if (temperaturaMinima > TEMPERATURA_MINIMA_CONS) {
			throw new IllegalArgumentException("La temperatura de conservacion tiene que ser minimamente de 3º.");
		} else if (codigoSupervisora.isEmpty() || codigoSupervisora.isBlank()) {
			throw new IllegalArgumentException("El codigo de la supervisora debe estar lleno.");
		} else if (fechaConsumo.isBefore(LocalDate.now())) {
			throw new IllegalArgumentException("La fecha de consumo preferente debe ser un dia en el futuro.");
		}

		this.codigoSupervisora = codigoSupervisora;
		this.fechaConsumo = fechaConsumo;
		this.temperaturaMinimaConservacion = temperaturaMinima;
	}

	// Devuelve la temperatura minima de corservacion

	public short getTemperaturaMinimaConservacion() {
		return temperaturaMinimaConservacion;
	}

	// Establece la temperatura minima de corservacion

	public void setTemperaturaMinimaConservacion(short temperaturaMinimaConservacion) {
		if (this.temperaturaMinimaConservacion > TEMPERATURA_MINIMA_CONS) {
			throw new IllegalArgumentException("La temperatura de conservacion tiene que ser minimamente de 3º.");
		}
		this.temperaturaMinimaConservacion = temperaturaMinimaConservacion;
	}

	// Devuelve el codigo de la supervisora

	public String getCodigoSupervisora() {
		return codigoSupervisora;
	}

	// Establece el codigo de la supervisora

	public void setCodigoSupervisora(String codigoSupervisora) {
		if (codigoSupervisora.isEmpty() || codigoSupervisora.isBlank()) {
			throw new IllegalArgumentException("El codigo de la supervisora debe estar lleno.");
		}
		this.codigoSupervisora = codigoSupervisora;
	}

	// Devuelve la fecha de consumo recomendable

	public LocalDate getFechaConsumo() {
		return fechaConsumo;
	}

	// Establece la fecha de consumo recomendable

	public void setFechaConsumo(LocalDate fechaConsumo) {
		if (fechaConsumo.isBefore(LocalDate.now())) {
			throw new IllegalArgumentException("La fecha de consumo preferente debe ser un dia en el futuro.");
		}
		this.fechaConsumo = fechaConsumo;
	}

	@Override
	public String toString() {
		String frase = super.toString() + String.format(
				" - Codigo Supervisora: %s - Fecha de Consumo: %02d/%02d/%04d - Temperatura de Conservacion: %d",
				codigoSupervisora, fechaConsumo.getDayOfMonth(), fechaConsumo.getMonthValue(), fechaConsumo.getYear(),
				temperaturaMinimaConservacion);
		return frase;
	}
}
