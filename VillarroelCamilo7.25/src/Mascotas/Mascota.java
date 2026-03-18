package Mascotas;

import java.time.LocalDate;

public abstract class Mascota {

	enum Estado {
		sano, enfermo, muerto
	};

	protected String nombre;
	protected short edad;
	protected Estado estado;
	protected LocalDate nacimiento;

	public Mascota(String nombre, short edad, String estado, LocalDate nacimiento) throws IllegalArgumentException {
		if (nombre.isEmpty() || nombre == null) {
			throw new IllegalArgumentException("El parametro de nombre debe estar lleno.");
		}

		if (edad < 0) {
			throw new IllegalArgumentException("La edad debe ser mayor a 0.");
		}

		if (!Estado.valueOf(estado.toLowerCase()).equals(Estado.enfermo)
				&& !Estado.valueOf(estado.toLowerCase()).equals(Estado.sano)
				&& !Estado.valueOf(estado.toLowerCase()).equals(Estado.muerto)) {
			throw new IllegalArgumentException("El valor de Estado debe ser o \"sano\" , \"enfermo\" o \"muerto\".");
		}

		if (nacimiento.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("La fecha de nacimiento debe ser en una fecha existente.");
		}

		this.nombre = nombre;
		this.edad = edad;
		this.estado = Estado.valueOf(estado.toLowerCase());
		this.nacimiento = nacimiento;
	}

	public abstract String getNombre();

	public abstract void setNombre(String nombre);

	public abstract short getEdad();

	public abstract void setEdad(short edad);

	public abstract String getEstado();

	public abstract void setEstado(String estado);

	public abstract LocalDate getNacimiento();

	public abstract void setNacimiento(LocalDate nacimiento);

	public abstract void cumpleannos();

	public abstract String morir();

	public abstract String hablar();

	public abstract String toString();
}
