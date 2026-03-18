package Mascotas;

import java.time.LocalDate;

public class Gato extends Mascota {

	enum Color {
		negro, rojo, blanco, marron, gris, crema
	}

	protected Color color;
	protected boolean peloLargo;

	public Gato(String nombre, short edad, String estado, LocalDate nacimiento, String color, boolean peloLargo)
			throws IllegalArgumentException {
		super(nombre, edad, estado, nacimiento);
		if (!Color.valueOf(color.toLowerCase()).equals(Color.negro)
				&& (!Color.valueOf(color.toLowerCase()).equals(Color.rojo))
				&& (!Color.valueOf(color.toLowerCase()).equals(Color.blanco))
				&& (!Color.valueOf(color.toLowerCase()).equals(Color.marron))
				&& (!Color.valueOf(color.toLowerCase()).equals(Color.gris))
				&& (!Color.valueOf(color.toLowerCase()).equals(Color.crema))) {
			throw new IllegalArgumentException("El color del gato debe estar entro del enum Color.");
		}
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public void setNombre(String nombre) {
		if (nombre.isEmpty() || nombre == null) {
			throw new IllegalArgumentException("El parametro de nombre debe estar lleno.");
		}
		this.nombre = nombre;
	}

	@Override
	public short getEdad() {
		return this.edad;
	}

	@Override
	public void setEdad(short edad) {
		if (edad < 0) {
			throw new IllegalArgumentException("La edad debe ser mayor a 0.");
		}
		this.edad = edad;
	}

	@Override
	public String getEstado() {
		return String.valueOf(color);
	}

	@Override
	public void setEstado(String estado) {
		if (!Estado.valueOf(estado.toLowerCase()).equals(Estado.enfermo)
				|| !Estado.valueOf(estado.toLowerCase()).equals(Estado.sano)
				|| !Estado.valueOf(estado.toLowerCase()).equals(Estado.muerto)) {
			throw new IllegalArgumentException("El valor de Estado debe ser o \"sano\" o \"enfermo\".");
		}
		this.estado = Estado.valueOf(estado.toLowerCase());
	}

	@Override
	public LocalDate getNacimiento() {
		return this.nacimiento;
	}

	@Override
	public void setNacimiento(LocalDate nacimiento) {
		if (nacimiento.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("La fecha de nacimiento debe ser en una fecha existente.");
		}
		this.nacimiento = nacimiento;
	}

	public String getColor() {
		return String.valueOf(color);
	}

	public void setColor(String color) {
		if (!Color.valueOf(color.toLowerCase()).equals(Color.negro)
				|| (!Color.valueOf(color.toLowerCase()).equals(Color.rojo))
				|| (!Color.valueOf(color.toLowerCase()).equals(Color.blanco))
				|| (!Color.valueOf(color.toLowerCase()).equals(Color.marron))
				|| (!Color.valueOf(color.toLowerCase()).equals(Color.gris))
				|| (!Color.valueOf(color.toLowerCase()).equals(Color.crema))) {
			throw new IllegalArgumentException("El color del gato debe estar entro del enum Color." + Color.values());
		}
		this.color = Color.valueOf(color.toLowerCase());
	}

	public boolean isPeloLargo() {
		return this.peloLargo;
	}

	public void setPeloLargo(boolean peloLargo) {
		this.peloLargo = peloLargo;
	}

	@Override
	public void cumpleannos() {
		edad++;
	}

	@Override
	public String morir() {

		return String.format("El gato %s ha muerto.", nombre);
	}

	@Override
	public String hablar() {
		return String.format("Soy el gato %s. Miau Miau.", nombre);
	}

	@Override
	public String toString() {
		String frase = String.format(
				"Nombre: %s - Edad: %d - Estado: %s - Nacimiento: %s - Color: %s - - Tiene pelo largo: %b", nombre,
				edad, getEstado(), nacimiento.toString(), getColor(), peloLargo);
		return frase;
	}

}
