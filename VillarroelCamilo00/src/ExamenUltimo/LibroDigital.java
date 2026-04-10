package ExamenUltimo;

import java.time.LocalDate;

public class LibroDigital extends Libro {

	protected static int nDigitales;

	protected double tamanno;
	protected String formato;

	public LibroDigital(String titulo, String autor, LocalDate fecha, String genero, boolean disponibilidad,
			double tamanno, String formato) throws IllegalArgumentException {
		super(titulo, autor, fecha, genero, disponibilidad);

		if (!formato.equalsIgnoreCase("pdf") && !formato.equalsIgnoreCase("epub")
				&& !formato.equalsIgnoreCase("mobi")) {
			throw new IllegalArgumentException("El formato de libro digial debe ser pdf, epub o mobi.");
		}

		this.tamanno = tamanno;
		this.formato = formato;
		nDigitales++;
	}

	@Override
	protected String generadorID() {
		return "D" + super.generadorID();
	}

	@Override
	public String toString() {
		return super.toString() + " [ tamanno=" + tamanno + ", formato=" + formato + "]";
	}

	@Override
	protected double calcularPrecio() {
		double total = tamanno * 0.45;

		if (formato.equalsIgnoreCase("EPUB")) {
			total += 1.5;
		}

		return total;
	}

	public static int getnDigitales() {
		return nDigitales;
	}

}
