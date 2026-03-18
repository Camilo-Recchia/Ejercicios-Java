/*
 *Descripción: Clase para crear Objeto Productos Conjelados
 *Autor: Camilo Villarroel Recchia
 *Fecha: 11/02/2026
 */
package productos;

import java.time.LocalDate;

public class ProductosCongelados extends Productos {

	protected short tempRecomendada;
	protected int mesesConjelado;

	ProductosCongelados(String nombreProducto, LocalDate fechaCaducidad, int numLote, short tempRecomendada,
			int mesesConjelado) throws IllegalArgumentException {
		super(nombreProducto, fechaCaducidad, numLote);
		if (tempRecomendada > -18) {
			throw new IllegalArgumentException("La temperatura recomendada debe estar por debajo de -18 por ley.");
		} else if (mesesConjelado < 0) {
			throw new IllegalArgumentException("Los meses de conjelacion deben ser 0 o mayor.");
		}
		this.tempRecomendada = tempRecomendada;
		this.mesesConjelado = mesesConjelado;
	}
	
	

	@Override
	public String toString() {
		String frase = super.toString() + String.format(" - Temperatura Recomendada: %d - Meses Conjelado: %d",
				tempRecomendada, mesesConjelado);
		return frase;
	}
}
