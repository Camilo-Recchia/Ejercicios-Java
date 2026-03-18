package empleado;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Empleado {

	// ATRIBUTOS DE CLASE:
	// Atributos finales de clase
	private static final int SUELDO_MINIMO = 1100;
	private static final float HORAS_EXTRA_PAGO_MINIMO = (float) 9.6;

	// Atributos de variable de clase
	private static int numeroEmpleados;
	// ATRIBUTOS DE OBJETO
	// Atributos finales de objeto

	// Atributos variables de objeto
	private String nif;
	private String nombre;
	private String apellidos;
	private int sueldo_base;
	private short horasExtra;
	private float pagoHorasExtra;
	private short porcentajeIRPF;
	private boolean casado;
	private short numeroHijos;

	// Constuctor con todos los parametros
	public Empleado(String nif, String nombre, String apellidos, int sueldo_base, short horasExtra,
			float pagoHorasExtra, short porcentajeIRPF, boolean casado, short numeroHijos)
			throws IllegalArgumentException {

		if (nif.isBlank() || nif.isEmpty() || nif == null) {
			throw new IllegalArgumentException("Los datos del NIF no pueden tener esos valores");
		} else if (!validarDNI(nif)) {
			throw new IllegalArgumentException("El formato del NIF es erroneo");
		} else if (nombre.isBlank() || nombre.isEmpty() || nombre == null) {
			throw new IllegalArgumentException("Los datos del nombre no pueden tener esos valores");
		} else if (apellidos.isBlank() || apellidos.isEmpty() || apellidos == null) {
			throw new IllegalArgumentException("Los datos del apellidos no pueden tener esos valores");
		} else if (sueldo_base < SUELDO_MINIMO) {
			throw new IllegalArgumentException("El sueldo debe ser mayor que 1100");
		} else if (horasExtra < 0) {
			throw new IllegalArgumentException("Las horas extra tiene que ser mayores que 0");
		} else if (pagoHorasExtra < HORAS_EXTRA_PAGO_MINIMO) {
			throw new IllegalArgumentException("El pago de horas extra tiene que ser minimo de 9,6€");
		} else if (porcentajeIRPF < 0 || porcentajeIRPF > 100) {
			throw new IllegalArgumentException("El porcentaje de IRPF tiene que estar entre 0% y 100%");
		} else if (numeroHijos < 0) {
			throw new IllegalArgumentException("No se pueden tener hijos negativos");
		}

		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldo_base = sueldo_base;
		this.horasExtra = horasExtra;
		this.pagoHorasExtra = pagoHorasExtra;
		this.porcentajeIRPF = porcentajeIRPF;
		this.casado = casado;
		this.numeroHijos = numeroHijos;
	}

	public Empleado(String nif, String nombre, String apellidos) {
		this(nif, nombre, apellidos, SUELDO_MINIMO, (short) 0, HORAS_EXTRA_PAGO_MINIMO, (short) 50, false, (short) 0);
	}

	// Devuelve la cantida de dinero que se le va a
	// ingresar al empleado por sus horas extra
	public float calculoPagoHorasExtra() {
		return this.horasExtra * this.pagoHorasExtra;
	}

	// Devuelve el salario en bruto del empleado
	public int calculoSueldoBruto() {
		return this.sueldo_base + this.sueldo_base * porcentajeIRPF;
	}

	// Muestra los datos basicos del empleado
	public void verEmpleado() {
		System.out.printf("Nombre: %s. Apellidos: %s. NIF: %s", nombre, apellidos, nif);
	}

	// Crea una copia de un empleado
	public void copia(Empleado e) {

	}

	// SETTERS

	public void setHorasExtra(short horasExtra) {
		if (horasExtra < 0) {
			throw new IllegalArgumentException("Las horas extra tiene que ser mayores que 0");
		}
		this.horasExtra = horasExtra;
	}

	public void setPagoHorasExtra(float pagoHorasExtra) {
		if (pagoHorasExtra < HORAS_EXTRA_PAGO_MINIMO) {
			throw new IllegalArgumentException("El pago de horas extra tiene que ser minimo de 9,6€");
		}
		this.pagoHorasExtra = pagoHorasExtra;
	}

	// GETTERS
	public int getSueldo_base() {
		return sueldo_base;
	}

	public short getHorasExtra() {
		return horasExtra;
	}

	public float getPagoHorasExtra() {
		return pagoHorasExtra;
	}

	public short getPorcentajeIRPF() {
		return porcentajeIRPF;
	}

	@Override
	public String toString() {
		String frase = String.format(
				"Nombre: %s. Apellidos: %s. NIF: %s. Sueldo Base: %d. Horas Extra Trabajadas: %d. \n"
						+ "Pago por Horas Extra: %f. Porcentaje IRPF: %d. Casado: %b. NºHijos: %d ",
				nombre, apellidos, nif, sueldo_base, horasExtra, pagoHorasExtra, porcentajeIRPF, casado, numeroHijos);

		return frase;
	}

	public static boolean validarDNI(String dni) {

		dni = dni.trim().toUpperCase();

		if (!dni.matches("[0-9]{8}[A-Z]")) {
			return false;
		}

		int numero = Integer.parseInt(dni.substring(0, 8));
		char letra = dni.charAt(8);

		char correcta = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(numero % 23);

		return letra == correcta;
	}

}
