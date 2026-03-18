package Vehiculos;

public class Moto extends Terrestre {

	protected enum Color {
		rojo, amarillo, marron, azul, negro, balnco, gris, morado, dorado
	}

	protected String color;

	protected Moto(String matricula, String modelo, byte nRuedas, String color) throws IllegalArgumentException {
		super(matricula, modelo, nRuedas);
		this.color = color;
	}

}
