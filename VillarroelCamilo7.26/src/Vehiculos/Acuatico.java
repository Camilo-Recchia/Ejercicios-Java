package Vehiculos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Acuatico extends Vehiculo {

	protected final int eslora;

	protected Acuatico(String matricula, String modelo, int eslora) throws IllegalArgumentException {
		super(matricula, modelo);
		if (!validarMatricula(matricula)) {
			throw new IllegalArgumentException("La matricula es erronea.");
		}

		if (eslora < 0) {
			throw new IllegalArgumentException("El vehiculo acuatico debe tener una eslora de más de 0 metros.");
		}
		this.eslora = eslora;

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
		return this.eslora;
	}

	@Override
	public String toString() {
		String frase = String.format("Tipo: Acuatico \nMatricula: %s \nModelo: %s \nEslora: %d m", matricula, modelo,
				eslora);
		return frase;
	}

	// Valida el patron de la matricula entregada
	private static boolean validarMatricula(String matricula) {

		Pattern patron = Pattern.compile("[TRWAGMYFPDXBNJZSQVHLCKE]{3,10}");

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
