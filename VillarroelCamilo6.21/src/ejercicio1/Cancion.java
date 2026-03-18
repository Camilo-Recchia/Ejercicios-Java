package ejercicio1;

public class Cancion {

	// ATRIBUTOS
	// ATTIBUTOS CONTANTES DE CLASE
	public final static String TITULODEFAULT = "DEFAULT";
	public final static String CANTANTEDEFAULT = "DEFAULT";

	// ATRIBUTOS VARIABLES DE OBJETO
	protected String titulo;
	protected String cantante;

	public Cancion(String titulo, String cantante) throws IllegalArgumentException {
		if (titulo.isEmpty() || titulo == null) {
			throw new IllegalArgumentException("El valor de titulo nunca puede ser null o estar vacio");
		} else if (cantante.isEmpty() || cantante == null) {
			throw new IllegalArgumentException("El valor de cantante nunca puede ser null o estar vacio");
		}
		this.titulo = titulo;
		this.cantante = cantante;
	}

	public Cancion() {
		this(TITULODEFAULT, CANTANTEDEFAULT);
	}

	public Cancion(Cancion copia) {
		this(copia.titulo, copia.cantante);
	}

	// GETTERS

	public String getTitulo() {
		return titulo;
	}

	public String getCantante() {
		return cantante;
	}

	// SETTERS

	public void setTitulo(String titulo) throws IllegalArgumentException {
		if (titulo.isEmpty() || titulo == null) {
			throw new IllegalArgumentException("El valor de titulo nunca puede ser null o estar vacio");
		}
		this.titulo = titulo;
	}

	public void setCantante(String cantante) throws IllegalArgumentException {
		if (cantante.isEmpty() || cantante == null) {
			throw new IllegalArgumentException("El valor de cantante nunca puede ser null o estar vacio");
		}
		this.cantante = cantante;
	}

	public static Cancion clon(Cancion a) {
		Cancion b;
		b = new Cancion(a);
		return b;
	}

	@Override
	public String toString() {

		String frase = String.format("Cantante: %s. Titulo: %s\n", cantante, titulo);

		return frase;

	}

}
