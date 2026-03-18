/*
 *Descripción: Mostrar "Hola Mundo!" al usuario
 *Autor: Camilo Villarroel Recchia
 *Fecha: 07/01/2026
 */
package cafetera;

public class Cafetera {

//	ATRIBUTOS:

//	ATRIBUTOS DE CLASE:

	// Atributos de clase constantes:
	private float capacidadMaxima; // Capacidad maxima de cafe en la cafetera
	private float cantidadActual; // Cantidad de cafe en la cafetera

	// Constructor con la capacidad maxima y la cantidad inicial
	public Cafetera(float capacidadMaxima, float cantidadActual) throws IllegalArgumentException {
		if (cantidadActual < 0) {
			throw new IllegalArgumentException("La cantidad actual no puede ser negativa");
		} else if (cantidadActual > capacidadMaxima) {
			throw new IllegalArgumentException("La cantidad actual no puede superar la capacidad maxima");
		}

		this.cantidadActual = cantidadActual;
		this.capacidadMaxima = capacidadMaxima;
	}

	// Constructor con la capacidad maxima
	public Cafetera(float capacidadMaxima) {
		this(capacidadMaxima, capacidadMaxima);
	}

	// Constructor sin valores
	public Cafetera() {
		this(1000, 0);
	}

	// Agrefa una cantidad especifica a la cafetera
	// Si se supera la cantidad maxima entonces se dira el sobrante

	public void llenarCafetera(float cantidad) throws IllegalArgumentException {
		if (cantidad < 0) {
			throw new IllegalArgumentException("La cantidad a agregar debe ser positiva");
		}
		if (cantidad + this.cantidadActual > this.capacidadMaxima) {
			int valor = (int) (this.capacidadMaxima - this.cantidadActual + cantidad);
			this.cantidadActual = this.capacidadMaxima;
			throw new IllegalArgumentException("Si se llena esa cantidad la cafetera desborda."
					+ String.format("El cafe sobrante es de %d cc", valor));
		}

		this.cantidadActual = this.cantidadActual + cantidad;
	}

	// Sirve una determinada cantidad de cafe dentro de una taza
	// Si se supera la cantidad de cafe en la cafetera entonces se
	// servira lo que hay y se dira lo que se sirvio

	public void servirTaza(int cantidad) throws IllegalArgumentException {
		if (cantidad < 0) {
			throw new IllegalArgumentException("La cantidad a agregar debe ser positiva");
		} else if (cantidad > this.cantidadActual) {
			int valor = (int) (cantidad - this.cantidadActual);
			this.cantidadActual = 0;
			throw new IllegalArgumentException(
					" La cantidad de cafe en la cafetera no alcanza por lo que se sirven solo "
							+ String.format("%d cc", valor));
		}
		this.cantidadActual = this.cantidadActual - cantidad;
	}

	// Establece el valor cantidadActual a 0
	public void vaciarCafetera() {
		this.cantidadActual = 0;
	}

	// GETTERS

	public float getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public float getCantidadActual() {
		return cantidadActual;
	}

	// SETTERS

	public void setCapacidadMaxima(float capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public void setCantidadActual(float cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	public String toString() {

		String frase = String.format("Capacidad maxima de cafe: %.3fcc. Cantidad de cafe actual: %.3fcc",
				this.capacidadMaxima, this.cantidadActual);

		return frase;
	}

}
