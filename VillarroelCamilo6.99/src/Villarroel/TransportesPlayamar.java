package Villarroel;

import java.time.LocalDate;

public class TransportesPlayamar {

	// Atributos:
	// Atributos constantes de clase
	public static final short MAX_ID = 999;
	public static final float MIN_TONELADAS = (float) 0.5;
	public static final float MAX_TONELADAS = 20;
	public static final LocalDate MIN_FECHA = LocalDate.of(2000, 01, 01);
	public static final LocalDate DEFAULT_FECHA = LocalDate.now();
	public static final boolean ITV_DEFAULT = false;

	// Atributos variables de clase
	private static short numeroId;

	// Atributos constantes de objeto
	private final String id;

	// Atributos variables de objeto
	private byte tipo;

	private String matricula;
	private LocalDate fechaMatriculacion;
	private boolean itv;
	private double precio;
	private double km;
	private double tarifaBase;

	// Atributos camion
	private float toneladas;

	// Atributos furgoneta
	private short volumenCarga; // en m3
	private boolean refrigeracion;

	// Atributos motocicleta
	private short cilinrada;
	private boolean cajon;

	// Constructor con 5 parametros
	public TransportesPlayamar(String matricula, LocalDate fechaMatriculacion, boolean itv, double tarifaBase,
			double km) throws IllegalArgumentException {
		if (numeroId >= MAX_ID) {
			throw new IllegalArgumentException("Maximo numero de vehiculos alcanzado.");
		}

		if (fechaMatriculacion.isBefore(MIN_FECHA)) {
			throw new IllegalArgumentException("La fecha de matriculacion debio realizarse despue del año 2000.");
		}
		numeroId++;
		this.fechaMatriculacion = fechaMatriculacion;
		this.id = generadorId();
		this.matricula = matricula;
		this.itv = itv;
		this.tarifaBase = tarifaBase;
		this.km = km;

	}

	// Constructor de camion
	public TransportesPlayamar(String matricula, LocalDate fechaMatriculacion, boolean itv, double tarifaBase,
			double km, float toneladas) throws IllegalArgumentException {
		this(matricula, fechaMatriculacion, itv, tarifaBase, km);
		this.toneladas = toneladas;
		this.tipo = 1;
	}

	// Constructor de furgoneta
	public TransportesPlayamar(String matricula, LocalDate fechaMatriculacion, boolean itv, double tarifaBase,
			double km, boolean refrigeracion, short volumenCarga) throws IllegalArgumentException {
		this(matricula, fechaMatriculacion, itv, tarifaBase, km);
		this.volumenCarga = volumenCarga;
		this.tipo = 2;
		this.refrigeracion = refrigeracion;
	}

	// Constructor de Moto
	public TransportesPlayamar(String matricula, LocalDate fechaMatriculacion, boolean itv, double tarifaBase,
			double km, short cilindrada, boolean cajon) throws IllegalArgumentException {
		this(matricula, fechaMatriculacion, itv, tarifaBase, km);
		this.cilinrada = cilindrada;
		this.cajon = cajon;
		this.tipo = 3;
	}

	// Establece el precio a pagar por kilometro
	public void setTarifabase(double tarifaBase) {
		this.tarifaBase = tarifaBase;
	}

	// Establece los kilometros a recorrer
	public void setKm(double km) {
		this.km = km;
	}

	// Establece el valor de la itv
	public void setItv(boolean itv) {
		this.itv = itv;
	}

	// Devuelve si la moto tiene cajon
	public boolean getCajon() throws IllegalArgumentException {
		if (tipo != 3) {
			throw new IllegalArgumentException("Este tipo de vehiculo no tiene cajon. Intentalo con una moto.");
		}
		return cajon;
	}

	// Devuele la cantiad total de vehiclos que hay en la compania
	public static short getTotalVehiculos() {
		return numeroId;
	}

	// Calcula el precio de transporte por cada tipo de vehiculo
	public double calcularPrecioDeTransporte() {
		double precioTransporte;
		if (tipo == 1) {
			precioTransporte = tarifaBase * km * 5;
		} else if (tipo == 2) {
			if (refrigeracion == true) {
				precioTransporte = tarifaBase * km * 3 * 13;
			} else {
				precioTransporte = tarifaBase * km * 3;
			}
		} else {
			if (cajon == true) {
				precioTransporte = (tarifaBase * km) + 13;
			} else {
				precioTransporte = (tarifaBase * km);
			}
		}
		return precioTransporte;
	}

	@Override
	public String toString() {
		String frase = "";
		if (tipo == 1) {
			frase = "TransportesPlayamar [id=" + id + ", tipo=" + tipo + ", matricula=" + matricula
					+ ", fechaMatriculacion=" + fechaMatriculacion + ", itv=" + itv + ", km=" + km + ", tarifaBase="
					+ tarifaBase + ", toneladas=" + toneladas + "]";

		} else if (tipo == 2) {
			frase = "TransportesPlayamar [id=" + id + ", tipo=" + tipo + ", matricula=" + matricula
					+ ", fechaMatriculacion=" + fechaMatriculacion + ", itv=" + itv + ", km=" + km + ", tarifaBase="
					+ tarifaBase + ", volumenCarga=" + volumenCarga + ",Tiene Refrigeracion?=" + refrigeracion + "]";
		} else {
			frase = "TransportesPlayamar [id=" + id + ", tipo=" + tipo + ", matricula=" + matricula
					+ ", fechaMatriculacion=" + fechaMatriculacion + ", itv=" + itv + ", km=" + km + ", tarifaBase="
					+ tarifaBase + ", Cilindrada=" + cilinrada + ", Tiene Cajon?=" + cajon + "]";
		}

		return frase;
	}

	// Genera una id para cada vehiculo creado
	private String generadorId() {
		return String.format("%02d-%03d", this.fechaMatriculacion.getYear() - 2000, numeroId);
	}

}
