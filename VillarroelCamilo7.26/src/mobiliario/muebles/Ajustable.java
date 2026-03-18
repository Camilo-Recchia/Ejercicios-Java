package mobiliario.muebles;

public interface Ajustable {

	public byte obtenerPosicion();

	public byte subirPosicion() throws IllegalStateException;

	public byte bajarPosicion() throws IllegalStateException;
}
