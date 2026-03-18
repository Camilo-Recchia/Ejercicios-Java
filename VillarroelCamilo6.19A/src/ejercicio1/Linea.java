package ejercicio1;

import a1.Punto;

public class Linea {

	// ATRIBUTOS

	// ATRIBUTOS DE CLASE:
	// Atributos de invariables de clase
	private static byte VALOR_DEFAULT_PUNTO = 0;

	// ATRIBUTOS DE OBJETO:
	// Atributos invariables de objeto

	// Atributos variables de objeto
	protected Punto puntoA;
	protected Punto puntoB;

	public Linea(Punto puntoA, Punto puntoB) throws IllegalArgumentException {
		if (puntoA == null) {
			throw new IllegalArgumentException("Los valores de A no pueden ser null");
		} else if (puntoB == null) {
			throw new IllegalArgumentException("Los valores de B no pueden ser null");
		}

		puntoA = new Punto(this.puntoA.getX(), this.puntoA.getY());
		puntoB = new Punto(this.puntoB.getX(), this.puntoB.getY());
	}
	
	public Linea() {
	}
}
