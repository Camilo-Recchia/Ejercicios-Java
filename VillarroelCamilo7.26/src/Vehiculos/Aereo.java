package Vehiculos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aereo extends Vehiculo {

	protected final int nAsientos;

	protected Aereo(String matricula, String modelo, int nAsientos) throws IllegalArgumentException {
		super(matricula, modelo);
		if (!validarMatricula(matricula)) {
			throw new IllegalArgumentException("La matricula es erronea.");
		}

		if (nAsientos < 0) {
			throw new IllegalArgumentException("El vehiculo aereo debe tener una cantidad de asientos mayor que 0.");
		}
		this.nAsientos = nAsientos;

	}

	@Override
	protected String getMatricula() {
		return this.matricula;
	}

	@Override
	protected String getModelo() {
		return this.modelo;
	}

	protected int getEslora() {
		return this.nAsientos;
	}

	@Override
	public String toString() {
		String frase = String.format("Tipo: Aereo \nMatricula: %s \nModelo: %s \nNº Asientos: %d m", matricula, modelo,
				nAsientos);
		return frase;
	}

	// Valida el patron de la matricula entregada
	private static boolean validarMatricula(String matricula) {

		Pattern patron = Pattern.compile("[TRWAGMYFPDXBNJZSQVHLCKE]{4}[0-9]{6}");

		boolean comprobado;

		matricula = matricula.toUpperCase();

		Matcher texto = patron.matcher(matricula);

		if (texto.matches()) {
			comprobado = true;
		} else {
			comprobado = false;
		}

		return comprobado;
	}

}
