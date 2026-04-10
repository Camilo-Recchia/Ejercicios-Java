package ExamenUltimo;

import java.time.LocalDate;

public class LibroFisico extends Libro {

	protected static int nFisicos;

	protected int nPaginas;
	protected String tapa;

	public LibroFisico(String titulo, String autor, LocalDate fecha, String genero, boolean disponibilidad,
			int nPaginas, String tapa) throws IllegalArgumentException {
		super(titulo, autor, fecha, genero, disponibilidad);
		if (nPaginas <= 0) {
			throw new IllegalArgumentException("Los libros deben tener 1 pagina como minimo.");
		}

		if (!tapa.equalsIgnoreCase("dura") && !tapa.equalsIgnoreCase("blanda")) {
			throw new IllegalArgumentException("La tapa del libro fisico debe ser o dura o blanda");
		}

		this.nPaginas = nPaginas;
		this.tapa = tapa;

		nFisicos++;
	}

	@Override
	protected String generadorID() {
		return "F" + super.generadorID();
	}

	public static int getnFisicos() {
		return nFisicos;
	}

	@Override
	protected double calcularPrecio() {
		double total = nPaginas * 0.75;

		if (tapa.equalsIgnoreCase("dura")) {
			total += 3;
		}

		return total;
	}

	@Override
	public String toString() {
		return super.toString() + " nPaginas=" + nPaginas + ", tapa=" + tapa + "]";
	}
}
