package anexosClases;

public class Dado {

	// ATRIBUTOS

	// ATRIBUTOS DE CLASE:
	// Atributos de invariables de clase
	private static final byte MAX_CARA_DADO = 20;
	private static final byte DEFAULT_CARA_DADO = 4;
	// ATRIBUTOS DE OBJETO:
	// Atributos invariables de objeto
	private final byte caras;

	// Atributos variables de objeto
	private long tiradas;
	private long[] numeroCaras;

	public Dado(byte caras) {
		if (caras != 4 || caras != 6 || caras != 8 || caras != 12 || caras != 20) {
			throw new IllegalArgumentException("No existe ese valor para caras de dado: (4,6,8,12,20)");

		}
		this.numeroCaras = new long[caras];
		this.caras = caras;
	}

	public Dado() {
		this(DEFAULT_CARA_DADO);
	}

	public long getTiradas() {
		return tiradas;
	}

	public byte getCaras() {
		return caras;
	}

	public String tirada() {
		String[] numeros = { "UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE", "DIEZ", "ONCE",
				"DOCE", "TRECE", "CATORCE", "QUINCE", "DIESISEIS", "DIESISIETE", "DIESIOCHO", "DIESINUEVE", "VEINTE" };
		tiradas++;

		return numeros[(int) Math.random() * this.caras + 1];
	}

	@Override
	public String toString() {
		return String.format("Número de caras: %d. Numero de lanzamientos: %d", this.caras, this.tiradas);
	}

}
