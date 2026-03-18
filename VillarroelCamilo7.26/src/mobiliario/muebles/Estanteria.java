package mobiliario.muebles;

import mobiliario.pruebas.Modulo;

public final class Estanteria extends Almacenaje {

	private final String tipo; // "de pared", "de suelo", "de encastre", ...
	private final double anchura;
	private final double altura;

	public Estanteria(double precio, String descripcion, int numModulos, String tipo, double altura, double anchura) {
		super((float) precio, descripcion, altura, anchura, numModulos);
		this.tipo = tipo; // se admite null o ""
		this.anchura = anchura;
		this.altura = altura;
	}

	public String getTipo() {
		return tipo;
	}

	public double getAnchura() {
		return anchura;
	}

	@Override
	public void anyadirModulo(Modulo modulo) {
		if (modulo == null) {
			throw new IllegalArgumentException("El módulo no puede ser null.");
		}

		if (!modulo.equals(Modulo.BALDA)) {
			throw new IllegalArgumentException("Una Estanteria solo admite módulos de tipo BALDA.");
		}

		super.anyadirModulo(modulo);
	}

	@Override
	public String toString() {
		return String.format(super.toString() + " - Tipo Estanteria %s - ", tipo, anchura, altura);
	}
}