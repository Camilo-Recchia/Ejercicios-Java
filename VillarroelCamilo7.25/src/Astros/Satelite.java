package Astros;

public class Satelite extends Astro {
	protected String nombreSatelite;
	protected String nombrePlaneta;

	public Satelite(String nombreSatelite, long masaSatelite, double diametroSatelite, float periodoPorpio,
			float periodoSobrePlaneta, long distanciaMedia) throws IllegalArgumentException {
		super(masaSatelite, diametroSatelite, periodoPorpio, periodoSobrePlaneta, distanciaMedia);
		if (nombreSatelite.isEmpty() || nombreSatelite == null) {
			throw new IllegalArgumentException("El nombre del satelite debe estar lleno.");
		}
		this.nombreSatelite = nombreSatelite;
	}

	@Override
	// Devuelve el nombre del satelite
	public String getNombre() {
		return nombreSatelite;
	}

	@Override
	// Establece el nombre del satelite
	public void setNombre(String nombreSatelite) {
		this.nombreSatelite = nombreSatelite;
	}

	// Devuelve la masa del cuerpo
	@Override
	public long getMasaCuerpo() {
		return this.masaCuerpo;
	}

	@Override
	public void setMasaCuerpo(long masaCuerpo) {
		if (masaCuerpo < 0) {
			throw new IllegalArgumentException("El cuerpo debe tener masa positiva.");
		}
		this.masaCuerpo = masaCuerpo;
	}

	@Override
	public double getDiametroCuerpo() {
		return this.diametroCuerpo;
	}

	@Override
	public void setDiametroCuerpo(double diametroCuerpo) {
		if (diametroCuerpo < 0) {
			throw new IllegalArgumentException("El cuerpo debe tener diametro positivo.");
		}
		this.diametroCuerpo = diametroCuerpo;
	}

	@Override
	public float getPeriodoPorpio() {
		return this.periodoPorpio;
	}

	@Override
	public void setPeriodoPorpio(float periodoPorpio) {
		if (periodoPorpio < 0) {
			throw new IllegalArgumentException("El cuerpo debe tener periodo positivo.");
		}
		this.periodoPorpio = periodoPorpio;
	}

	@Override
	public float getPeriodoSobreCuerpo() {
		return this.periodoSobreCuerpo;
	}

	@Override
	public void setPeriodoSobreCuerpo(float periodoSobreCuerpo) {
		if (periodoSobreCuerpo < 0) {
			throw new IllegalArgumentException("El cuerpo debe tener periodo sobre el cuerpo positivo.");
		}
		this.periodoSobreCuerpo = periodoSobreCuerpo;
	}

	@Override
	public long getDistanciaMedia() {
		return this.distanciaMedia;
	}

	@Override
	public void setDistanciaMedia(long distanciaMedia) {
		if (distanciaMedia < 0) {
			throw new IllegalArgumentException("La distancia entre los cuerpos debe ser positiva.");
		}
		this.distanciaMedia = distanciaMedia;
	}

	public void agregarPlaneta(String n) {
		this.nombrePlaneta = n;
	}

	@Override
	public String toString() {
		return String.format("Nombre: %s\n", nombreSatelite) + super.toString()
				+ String.format("\nPlaneta: %s", nombrePlaneta);
	}

}
