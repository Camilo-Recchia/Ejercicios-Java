package Humano;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ciudadano extends Humano {

	protected final String documento;

	public Ciudadano(String nombre, String apellidos, String documento) throws IllegalArgumentException {
		super(nombre, apellidos);
		if (!comprobadorDni(documento)) {
			throw new IllegalArgumentException("Este documento no es valido.");
		}
		this.documento = documento;
	}

	@Override
	public String toString() {
		return super.toString() + " " + this.documento.toUpperCase();
	}

	private boolean comprobadorDni(String dni) {
		Pattern patron = Pattern.compile("[0-9]{8}[A-Z]");
		boolean comprobado;
		char validacionLetra = ' ';
		dni = dni.toUpperCase();

		Matcher texto = patron.matcher(dni);

		if (texto.matches()) {

			validacionLetra = "TRWAGMYFPDXBNJZSQVHLCKE".charAt((int) (Integer.valueOf(dni.substring(0, 8)) % 23));

			if (validacionLetra == dni.charAt(8)) {
				comprobado = true;
			} else {
				comprobado = false;
			}

		} else {
			comprobado = false;
		}

		return comprobado;
	}
}
