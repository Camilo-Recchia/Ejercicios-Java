package Coche;

import java.time.LocalDate;

public class Deportivo extends Coche {

	public enum TRACCION {
		total, delantera
	};

	protected TRACCION traccion;

	Deportivo(String matricula, String nombrePropietario, LocalDate fechaMatriculacion, short cilindrada,
			short potencia, String traccion) throws IllegalArgumentException {
		super(matricula, nombrePropietario, fechaMatriculacion, cilindrada, potencia);

		if (!TRACCION.valueOf(traccion.toLowerCase()).equals(TRACCION.total)
				&& !TRACCION.valueOf(traccion.toLowerCase()).equals(TRACCION.delantera)) {
			throw new IllegalArgumentException(
					"El valor de el Enum no cuadra, este debe ser o \"total\" o \"delantera\"");
		}

		this.traccion = TRACCION.valueOf(traccion.toLowerCase());
	}

	// Devuelve traccion
	public TRACCION getTraccion() {
		return traccion;
	}

	// Establece traccion
	public void setTraccion(String traccion) {
		if (!TRACCION.valueOf(traccion.toLowerCase()).equals(TRACCION.total)
				&& !TRACCION.valueOf(traccion.toLowerCase()).equals(TRACCION.delantera)) {
			throw new IllegalArgumentException(
					"El valor de el Enum no cuadra, este debe ser o \"total\" o \"delantera\"");
		}
		this.traccion = TRACCION.valueOf(traccion.toLowerCase());
	}

	@Override
	public String toString() {
		return super.toString() + String.format("\nTraccion: %s", traccion);
	}

}
