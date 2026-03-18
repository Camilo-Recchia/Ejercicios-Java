package ejercicio1;

public class Atleta {

	protected String nombre;
	protected int edad;
	protected float altura;

	protected String[] nombres = { "Pepe", "Juan", "Lucas", "Mateo", "Santiago", "Valentino", "Thiago", "Benjamin",
			"Joaquin", "Tomas", "Martin", "Nicolas", "Facundo", "Franco", "Agustin", "Lautaro", "Maximo", "Bruno",
			"Dylan", "Kevin", "Axel", "Enzo", "Ezequiel", "Ramiro", "Alan", "Matias", "Emiliano", "Nahuel", "Alexis",
			"Rafita", "Leandro", "Diego", "Fernando", "Gabriel", "Hernan", "Adrian", "Esteban", "Cristian", "Oscar",
			"Ricardo", "Raul", "Cesar", "Alberto", "Andres", "Pablo", "Daniel", "Eduardo", "Gonzalo", "Iván", "Javier",
			"Karen", "Lucia", "Sofia", "Martina", "Valentina", "Camilo", "Julieta", "Paula", "Daniela", "Carla",
			"Florencia", "Rocio", "Agustina", "Micaela", "Antonella", "Milagros", "Bianca", "Ariana", "Zoe", "Luna",
			"Emma", "Olivia", "Isabella", "Mia", "Victoria", "Clara", "Elena", "Sara", "Noa", "Alma", "Carmen", "Laura",
			"Irene", "Patricia", "Silvia", "Monica", "Beatriz", "Natalia", "Veronica", "Alicia" };

	public Atleta(String nombre, int edad, float altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}

	public Atleta() {
		nombre = nombres[(int) (Math.random() * nombres.length)];
		edad = (int) (Math.random() * 50) + 5;
		altura = (float) ((Math.random() * 100));
	}

	@Override
	public String toString() {
		return String.format("Nombre: %s | Edad: %d | Altura: %.2f", this.nombre, this.edad, this.altura);
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @return the altura
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}

	// Devuelve si el atleta es menor o no
	public boolean menor() {
		boolean comp;

		if (edad < 18) {
			comp = true;
		} else {
			comp = false;
		}

		return comp;
	}

}
