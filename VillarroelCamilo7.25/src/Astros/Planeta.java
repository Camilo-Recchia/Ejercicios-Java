package Astros;

import java.util.ArrayList;

public class Planeta extends Astro {
	protected String nombrePlanta;
	protected ArrayList<Satelite> satelites;

	public Planeta(String nombrePlaneta, long masaPlaneta, double diametroPlaneta, float periodoPorpio,
			float periodoSobreSol, long distanciaMedia) throws IllegalArgumentException {
		super(masaPlaneta, diametroPlaneta, periodoPorpio, periodoSobreSol, distanciaMedia);
		if (nombrePlaneta.isEmpty() || nombrePlaneta == null) {
			throw new IllegalArgumentException("El nombre del planeta debe estar lleno.");
		}
		this.nombrePlanta = nombrePlaneta;
		satelites = new ArrayList<>();
	}

	// Devuelve si el Planeta tiene satelites o no.
	public boolean tieneSatelites() {
		boolean comp;
		if (satelites.isEmpty()) {
			comp = false;
		} else {
			comp = true;
		}
		return comp;
	}

	// Agrega un satelite nuevo a un planeta
	public void agregarSatelites(Satelite s) {
		satelites.add(s);
		s.agregarPlaneta(this.nombrePlanta);
	}

	// Muestra los satelites del planeta
	public String mostrarSatelites() {
		String frase = "Satelites: ";
		if (satelites.isEmpty()) {
			frase += "No tiene.";
		} else {
			for (int i = 0; i < satelites.size(); i++) {
				frase += satelites.get(i).getNombre() + "\t";
			}
		}
		return frase;
	}

	@Override
	public String getNombre() {
		return this.nombrePlanta;
	}

	@Override
	public void setNombre(String nombre) {

	}

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

	// Devuelve una frase con el contenido de los parametros del planeta
	@Override
	public String toString() {

		return String.format("Nombre: %s\n", nombrePlanta) + super.toString()
				+ String.format("\n%s", mostrarSatelites());
	}
}
