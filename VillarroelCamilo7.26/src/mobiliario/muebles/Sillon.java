package mobiliario.muebles;

public class Sillon extends Asiento implements Ajustable {

	public static final byte MIN_POSICION = 0;
	public static final byte MAX_POSICION = 1;

	private boolean piesSubidos = false;

	public Sillon(float precio, String descripcion, String tapiceria, String color) {
		super(precio, descripcion, (byte) 1, tapiceria, color);
	}

	@Override
	public byte obtenerPosicion() {
		return (byte) (this.piesSubidos ? 1 : 0);
	}

	@Override
	public byte subirPosicion() {
		if (piesSubidos) {
			throw new IllegalStateException("Error: no se pueden subir los pies del sillón. Ya están subidos");
		}
		this.piesSubidos = true;
		return MAX_POSICION;
	}

	@Override
	public byte bajarPosicion() {
		if (!piesSubidos) {
			throw new IllegalStateException("Error: no se pueden bajar los pies del sillón. Ya están bajados");
		}
		this.piesSubidos = false;
		return MIN_POSICION;
	}
}