package mobiliario.muebles;

public class Sofa extends Asiento {

	private String composicion;

	public Sofa(float precio, String descripcion, byte plazas, String tapiceria, String color, String composicion) {
		super(precio, descripcion, plazas, tapiceria, color);
		this.composicion = composicion;
	}

	public String getComposicion() {
		return composicion;
	}

	@Override
	public String toString() {
		return super.toString() + String.format(" - Composición:%s", composicion);
	}
}