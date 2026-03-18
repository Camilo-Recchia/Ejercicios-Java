package Vehiculos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Terrestre extends Vehiculo {

	protected final byte nRuedas;

	protected Terrestre(String matricula, String modelo, byte nRuedas) throws IllegalArgumentException {
		super(matricula, modelo);
		if (!validarMatricula(matricula)) {
			throw new IllegalArgumentException("La matricula es erronea.");
		}

		if (nRuedas < 0) {
			throw new IllegalArgumentException("El vehiculo terrestre debe tener mas de 0 ruedas.");
		}
		this.nRuedas = nRuedas;

	}

	@Override
	protected String getMatricula() {
		return this.matricula;
	}

	@Override
	protected String getModelo() {
		return this.modelo;
	}

	protected byte getNumeroRuedas() {
		return this.nRuedas;
	}

	@Override
	public String toString() {
		String frase = String.format("Tipo: Terrestre \nMatricula: %s \nModelo: %s \nNº Ruedas: %d", matricula, modelo,
				nRuedas);
		return frase;
	}

	// Valida el patron de la matricula entregada
	private static boolean validarMatricula(String matricula) {

		Pattern patron = Pattern.compile("[0-9]{4}-[TRWAGMYFPDXBNJZSQVHLCKE]{3}");

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
