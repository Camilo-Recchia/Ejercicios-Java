package mobiliario.muebles;

import mobiliario.pruebas.Modulo;

public abstract class Almacenaje extends Mueble implements Personalizable {

	public static final int MIN_MODULOS = 1;
	public static final int MAX_MODULOS = 20;

	protected double anchura;
	protected double altura;
	protected final int numeroModulos;
	Modulo[] modulos;
	protected int numeroModulosAnyadidos;

	public Almacenaje(float precio, String descripcion, double anchura, double altura, int numeroModulos)
			throws IllegalArgumentException {
		super(precio, descripcion);
		if (numeroModulos < MIN_MODULOS || numeroModulos > MAX_MODULOS) {
			throw new IllegalArgumentException(String.format("ERROR: No se puede crear el mueble de Almacenaje. "
					+ "\nEl número de módulos no está en el rango permitido: %d", numeroModulos));
		}

		this.anchura = anchura;
		this.altura = altura;
		this.numeroModulos = numeroModulos;
		modulos = new Modulo[numeroModulos];

		// Inicializamos módulos por defecto (BALDA)
		for (int i = 0; i < numeroModulos; i++) {
			modulos[i] = Modulo.BALDA;
		}
	}

	@Override
	public Modulo[] obtenerModulos() {
		Modulo[] copia = new Modulo[numeroModulosAnyadidos];
		for (int i = 0; i < numeroModulosAnyadidos; i++) {
			copia[i] = modulos[i];
		}
		return copia;
	}

	@Override
	public void anyadirModulo(Modulo modulo) {
		if (modulo == null) {
			throw new NullPointerException("Error: el módulo a añadir no puede ser nulo");

		}

		if (numeroModulosAnyadidos >= numeroModulos) {
			throw new IllegalArgumentException(String.format(
					"Error: no se puede añadir el módulo %d. El número de módulos no puede superar el máximo permitido: %d",
					numeroModulosAnyadidos++, numeroModulos));
		}
	}

	public void extraerModulo() throws IllegalStateException {
		if (numeroModulosAnyadidos <= MIN_MODULOS) {
			throw new IllegalArgumentException(String.format(
					"Error: no se puede quitar el módulo. El número de módulos no puede ser inferior a %d",
					MIN_MODULOS));
		}
	}

	public String toString() {
		return super.toString() + String.format(" - Anchura: %.2f - Altura: %.2f - Numero de Modulos maximos: %d",
				anchura, altura, numeroModulos);
	}
}
