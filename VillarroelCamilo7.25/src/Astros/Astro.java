package Astros;

public abstract class Astro {

	protected long masaCuerpo;
	protected double diametroCuerpo;
	protected float periodoPorpio; // Periodo de rotacion sobre si mismos
	protected float periodoSobreCuerpo; // Periodo de traslacion sobre el cuerpo que orbitan
	protected long distanciaMedia;

	// Constructor con 5 parametros
	public Astro(long masaCuerpo, double diametroCuerpo, float periodoPorpio, float periodoSobreCuerpo,
			long distanciaMedia) throws IllegalArgumentException {

		if (masaCuerpo < 0) {
			throw new IllegalArgumentException("El cuerpo debe tener masa positiva.");
		}

		if (diametroCuerpo < 0) {
			throw new IllegalArgumentException("El cuerpo debe tener diametro positivo.");
		}

		if (periodoPorpio < 0) {
			throw new IllegalArgumentException("El cuerpo debe tener periodo positivo.");
		}

		if (periodoSobreCuerpo < 0) {
			throw new IllegalArgumentException("El cuerpo debe tener periodo sobre el cuerpo positivo.");
		}

		if (distanciaMedia < 0) {
			throw new IllegalArgumentException("La distancia entre los cuerpos debe ser positiva.");
		}

		this.masaCuerpo = masaCuerpo;
		this.diametroCuerpo = diametroCuerpo;
		this.periodoPorpio = periodoPorpio;
		this.periodoSobreCuerpo = periodoSobreCuerpo;
		this.distanciaMedia = distanciaMedia;
	}

	// Devuelve el nombre del cuerpo
	abstract String getNombre();

	// Establece el nombre del cuerpo
	abstract void setNombre(String nombre);

	// Devuelve la masa del cuerpo
	abstract long getMasaCuerpo();

	// Establece la masa del cuerpo
	abstract void setMasaCuerpo(long masaCuerpo);

	// Devuelve el diametro del cuerpo
	abstract double getDiametroCuerpo();

	// Establece el diametro del cuerpo
	abstract void setDiametroCuerpo(double diametroCuerpo);

	// Devuelve el periodo propio del cuerpo
	abstract float getPeriodoPorpio();

	// Establece el periodo propio del cuerpo
	abstract void setPeriodoPorpio(float periodoPorpio);

	// Devuelve el periodo sobre el cuerpo orbital
	abstract float getPeriodoSobreCuerpo();

	// Establece el periodo sobre el cuerpo orbital
	abstract void setPeriodoSobreCuerpo(float periodoSobreCuerpo);

	// Devuelve la distancia media
	abstract long getDistanciaMedia();

	// Establece la distancia media
	abstract void setDistanciaMedia(long distanciaMedia);

	// Devuelve una frase con la informacion del astro
	@Override
	public String toString() {
		return String.format(
				"Masa del Cuerpo: %d\nDiametro del cuerpo: %.2f\nPeriodo sobre si mismo: %.2f\nPeriodo de Traslacion: %.2f\nDistancia hasta el Cuerpo: %d",
				masaCuerpo, diametroCuerpo, periodoPorpio, periodoSobreCuerpo, distanciaMedia);
	}
}
