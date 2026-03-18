/*
 * Descripción: 
 * Autor: Alexis Balboteo González
 * Fecha: 18/02/2026
 */

package pruebasCamilo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DocumentacionClase {

	public enum Meses {
		ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE
	}

	// Atributos de clase constantes
	public static final int MAX_NUM_IDENTIFICADOR = 99999999;

	// Atributos de clase variables
	private static short anno;
	private static int secuencia;

	// Atributos de objeto inmutables
	private final String identificador;
	private final LocalDate fecha;

	// Atributos de objeto variables
	private LocalTime uso;
	private Meses meses;

	// constructor un parametro
	public DocumentacionClase(LocalDate fecha) throws IllegalStateException {

		if (secuencia == MAX_NUM_IDENTIFICADOR) {
			throw new IllegalStateException("Maximo numero de tickets creados este año");

		}

		this.uso = null;
		this.fecha = fecha;
		short añoActual = (short) LocalDateTime.now().getYear();

		if (anno != añoActual) {
			anno = añoActual;
			secuencia = 1;
		}

		this.identificador = String.format("%04d-%08d", (int) anno, secuencia++);

		this.meses = Meses.ENERO;

	}

	// constructor sin parametros
	public DocumentacionClase() {
		this(LocalDate.now());
	}

	// GETTERS
	// get id
	public String getIdentificador() {
		return this.identificador;
	}

	// get usado
	public boolean isUsado() {
		boolean usado;

		if (this.uso == null) {
			usado = false;
		} else {
			usado = true;
		}
		return usado;
	}

	// get fecha
	public LocalDate getFecha() {
		return this.fecha;
	}

	// get fin de semana, indica si es fin de semana
	public boolean isFinSemana() {

		boolean finde = false;

		if (this.fecha.getDayOfWeek() == DayOfWeek.SATURDAY || this.fecha.getDayOfWeek() == DayOfWeek.SUNDAY) {

			finde = true;
		}
		return finde;
	}

	// metodo usar
	public void usar() {

		if (isUsado()) {
			throw new IllegalStateException("Este ticket ha sido usado");

		}

		if (LocalDate.now().getYear() != this.fecha.getYear()
				|| LocalDateTime.now().getDayOfYear() != this.fecha.getDayOfYear()) {

			throw new IllegalStateException("Fecha erronea");

		}
		this.uso = LocalTime.now();

	}

	public String toString() {

		return String.format("{ID: %s, Fecha:%02d/%02d/%02d, Usado: %s}", this.identificador, this.fecha.getYear(),
				this.fecha.getMonthValue(), this.fecha.getDayOfMonth(),
				isUsado() == false ? "no" : String.format("%02d:%02d", uso.getHour(), uso.getMinute()));

	}

	public DocumentacionClase[] vector(int tamanhoArray) {

		DocumentacionClase[] vector = new DocumentacionClase[tamanhoArray];
		for (int i = 0; i < 10; i++) {

			vector[i] = new DocumentacionClase();

		}

		return vector;
	}

	private static boolean validarMatricula(String matricula) {

		boolean valida = false;

		matricula = matricula.toUpperCase();
		Pattern patron = Pattern.compile("[0-9]{4}[A-Z]{3}");
		Matcher texto = patron.matcher(matricula);

		if (!texto.matches()) {
			throw new IllegalStateException("Formato de matricula erroneo");
		} else {
			valida = true;

		}

		return valida;
	}

}