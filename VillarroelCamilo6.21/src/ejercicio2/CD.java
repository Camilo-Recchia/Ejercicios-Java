package ejercicio2;

import ejercicio1.*;

public class CD {

//	ATRIBUTOS:
//	ATRIBUTOS FINALES DE CLASE
	private static final byte MAX_CANCIONES = 20;

//	ATRIBUTOS VARIABLES DE OBJETO	
	protected Cancion[] canciones = new Cancion[MAX_CANCIONES];
	protected byte contador;

	public CD() {
		Cancion[] canciones = new Cancion[MAX_CANCIONES];
		this.contador = 0;
	}

	public CD(CD copia) {
	}

	// Devuelve el numero de canciones grabadas dentro del disco
	public int numeroCanciones() {
		return this.contador;
	}

	// Devuelve la cancion de el lugar en cuestion del disco
	public Cancion dameCancion(int lugar) throws IllegalArgumentException {
		if (this.canciones[lugar] == null) {
			throw new IllegalArgumentException("Ese valor del CD esta vacio");
		}
		return this.canciones[lugar];
	}

	// Graba una nueva cancion en un luagar de disco
	public void grabarCancion(int lugar, Cancion cancion) throws IllegalArgumentException {
		if (canciones[lugar] == null) {
			throw new IllegalArgumentException("Ese valor del CD esta vacio");
		} else if (lugar > this.contador || lugar < this.contador) {
			throw new IllegalArgumentException("No existe ese valor dentro del CD");
		}
		canciones[lugar] = cancion;
	}

	// Agrega la cancion determinada en la proxima ubicacion del cd que este vacia
	public void agregaCancion(Cancion cancion) throws IllegalArgumentException {
		if (this.contador >= MAX_CANCIONES) {
			throw new IllegalArgumentException("Maxima cantidad de canciones alcanzada");
		}
		canciones[(this.contador + 1)] = cancion;
		contador++;
	}

	// Elimina la cancion de un lugar predeterminado del CD
	public void eliminar(int lugar) {
		if (lugar >= contador) {
			throw new IllegalArgumentException("");
		}

		for (int i = 0; i < (this.contador - lugar - 1); i++) {
			this.canciones[lugar] = canciones[(lugar + 1)];
		}
		canciones[contador] = null;
		contador--;
	}

	// Clona el contenido de un CD a otro nuevo
	public static CD clon(CD clon) {
		CD b;
		b = new CD(clon);
		return b;
	}

	public String mostrarCD() {
		String frase = "";

		for (int i = 0; i < this.contador; i++) {
			frase = frase + String.format("%s", (i + 1), canciones[i].toString());
		}

//			while (canciones[i].getCantante() != null || canciones[i].getTitulo() != null) {
//				frase = frase + String.format("ID cancion: %d. %s", (i + 1), canciones[i].toString());
//				i++;
//			}

		return frase;
	}

}
