/*
 *Descripción: Constructor Bombilla
 *Autor: Camilo Villarroel Recchia
 *Fecha: 20/01/2026
 */
package anexosClases;

public class Bombilla {

	// Atributos:
	// Atributos de clase:
	private static int bombillasCreadas = 0;
	private static int bombillasEncendidas = 0;

	// Atributos de calse finales:
	public static final boolean ESTADO_INICIAL = false;

	// Atributos variables de Objeto:
	private boolean estado;
	private int vecesEncendida;

	public Bombilla(boolean estado) {
		this.estado = estado;
		bombillasCreadas++;
		if (estado) {
			bombillasEncendidas++;
			vecesEncendida = 1;
		} else {
			vecesEncendida = 0;
		}
	}

	public Bombilla() {
		this(ESTADO_INICIAL);
	}

	// GETTERS:
	// Muestra el valor de Estado
	public boolean getEstado() {
		return this.estado;
	}

	// Muestra la cantida de veces encendida
	public int getEncendidas() {
		return this.vecesEncendida;
	}

	// Muestra la cantidad de bombillas encendidas
	public static int getBombillasEncendidas() {
		return bombillasEncendidas;
	}

	// Muestra la cantidad de bombillas creadas
	public static int getBombillasCreadas() {
		return bombillasCreadas;
	}

	@Override
	public String toString() {
		String frase = String.format("Bombilla %s. Se ha encendido %d %s", this.estado ? "encendida" : "apagada",
				this.vecesEncendida, this.vecesEncendida == 1 ? "vez" : "veces");
		return frase;
	}

	// Cambia el estado de la bombilla a encendida
	public void encender() {
		if (this.estado == true) {
			throw new IllegalArgumentException("La bombilla ya esta encendida");
		}
		this.estado = true;
		vecesEncendida++;
		bombillasEncendidas++;
	}

	// Cambia el estado de la bombilla a apagada
	public void apagar() {
		if (this.estado == false) {
			throw new IllegalArgumentException("La bombilla ya esta apagada");
		}
		this.estado = false;
		bombillasEncendidas--;

	}

	public void conmutar() {
		if (this.estado) {
			apagar();
		} else {
			encender();
		}
	}

}
