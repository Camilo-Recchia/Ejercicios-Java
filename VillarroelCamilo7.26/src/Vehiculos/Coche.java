package Vehiculos;

public class Coche extends Terrestre {

	protected boolean AC;

	protected Coche(String matricula, String modelo, byte nRuedas, boolean AC) throws IllegalArgumentException {
		super(matricula, modelo, nRuedas);
		this.AC = AC;
	}

}
