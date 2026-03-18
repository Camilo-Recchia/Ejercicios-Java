package anexosClases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vehiculo {

	private String matricula;

	public Vehiculo(String matricula) throws IllegalArgumentException {
		if (!ComprobarMatricula(matricula)) {
			throw new IllegalArgumentException("Los datos de la matricula son erroneos");
		}
	}

	private static boolean ComprobarMatricula(String matricula) {
		Pattern patron = Pattern.compile("[A-Z]{4}[-]{1}[0-9]{3}");

		Matcher texto = patron.matcher(matricula);

		return texto.matches();
	}

}
