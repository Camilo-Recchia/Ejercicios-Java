package Vehiculos;

public abstract class Vehiculo {
	protected final String matricula;
	protected final String modelo;

	protected Vehiculo(String matricula, String modelo) throws IllegalArgumentException {
		if (matricula == null || matricula.isEmpty()) {
			throw new IllegalArgumentException("El parametro matricula debe estar lleno.");
		}

		if (modelo == null || modelo.isEmpty()) {
			throw new IllegalArgumentException("El parametro modelo debe estar lleno.");
		}

		this.matricula = matricula;
		this.modelo = modelo;
	}

	protected abstract String getMatricula();

	protected abstract String getModelo();

	public abstract String toString();

}
