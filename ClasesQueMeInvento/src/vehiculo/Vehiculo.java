package vehiculo;

public class Vehiculo {

	// Atributos

	// ATRIBUTOS DE CLASE
	// Atributos constantes de clase
	private static final double CONSUMO_MINIMO = 2.0;
	private static final double CONSUMO_MEDIO = 20.0;
	private static final double MINIMA_CANTIDAD_DEPOSITO = 10;
	private static final double MAXIMA_CANTIDAD_DEPOSITO = 120;
	private static final double CONSUMO_ARRANCAR = 0.02;
	private static final double VALOR_POR_OMISION_CONSUMO_MEDIO = 5.0;
	private static final double VALOR_POR_OMISION_CAPACIDAD_DEPOSITO = 50.0;
	private static final boolean ESTADO_DEFAULT = false;
	// Atributos variables de calse
	private static long km_recorridos_totales;
	private static long consumo_total;
	private static int total_encendidos;
	// ATRIBUTOS DE OBJETO
	// ATRIBUTOS DE OBJETO FINALES

	// ATRIBUTOS DE OBJETO VARIABLES
	private int capacidad_deposito;
	private int consumo_medio_vehiculo;
	private boolean estado;
	private int cantidad_deposito;
	private int km_recorridos_ultima;
	private int km_recorridos;
	private int consumo_vehiculo;

	
	// Constructor con parametros de capacidad del deposito y el consumo medio del vehiculo
	public Vehiculo(int capacidad_depisito, int consumo_medio_vehiculo) throws IllegalArgumentException {
		if (capacidad_deposito < MINIMA_CANTIDAD_DEPOSITO || capacidad_deposito > MAXIMA_CANTIDAD_DEPOSITO) {
			throw new IllegalArgumentException("Valores del deposito fuera de rango");
		} else if (consumo_medio_vehiculo < CONSUMO_MINIMO || consumo_medio_vehiculo > CONSUMO_MEDIO) {
			throw new IllegalArgumentException("Valores del deposito fuera de rango");
		}
		this.capacidad_deposito = capacidad_depisito;
		this.consumo_medio_vehiculo = consumo_medio_vehiculo;
		this.estado = ESTADO_DEFAULT;
		this.km_recorridos = 0;
		this.consumo_vehiculo = 0;
		this.km_recorridos = 0;
		this.cantidad_deposito = 25;

	}

	// Constructor sin parametros
	public Vehiculo() {
		this(50, 5);
	}

	// GETTERS
	
	public static long getKm_recorridos_totales() {
		return km_recorridos_totales;
	}

	public static long getConsumo_total() {
		return consumo_total;
	}

	public int getCapacidad_deposito() {
		return capacidad_deposito;
	}

	public int getConsumo_medio_vehiculo() {
		return consumo_medio_vehiculo;
	}

	public boolean isEstado() {
		return estado;
	}

	public int getCantidad_deposito() {
		return cantidad_deposito;
	}

	public int getKm_recorridos_ultima() {
		return km_recorridos_ultima;
	}

	public int getKm_recorridos() {
		return km_recorridos;
	}

	public int getConsumo_vehiculo() {
		return consumo_vehiculo;
	}
	
	
}
