/**
 * @author Camilo Villarroel Recchia
 */
package ejercicio1;

import java.time.LocalDate;

public class PlayamarBank {

	/**
	 * Clase que representa una cuenta bancaria.
	 */

	/**
	 * Los objetos de esta clase contienen atributos que permiten almacenar
	 * información sobre:
	 * 
	 * Identificador de la cuenta. Este valor se establecerá al crear la cuenta y ya
	 * no podrá cambiar. Es un valor constante. Fecha de creacion de la cuenta. Es
	 * también un valor constante. Se establecerá al crear la cuenta y ya no podrá
	 * cambiar su valor. Porcentaje de embargo de la cuenta. Saldo actual de la
	 * cuenta. Saldo máximo que ha tenido la cuenta a lo largo de su historia.
	 * Ingresos totales que ha tenido la cuenta a lo largo de su historia.
	 */

	/**
	 * La clase también dispone de información general independiente de los objetos
	 * concretos que se hayan creado. Es el caso de:
	 * 
	 * Saldo global entre todas las cuentas en el momento actual. Número de cuentas
	 * embargadas en el momento actual. Fecha de creación de la cuenta más moderna
	 * creada hasta el momento actual.
	 * 
	 */

	/** Límite de descubierto por omisión para una cuenta: 0.0 euros. */
	public final static double DEFAULT_MAX_DESCUBIERTO = 0.0;
	/** Saldo inicial por omisión para una cuenta: 0.0 euros. */
	public final static double DEFAULT_SALDO = 0.0;
	/** Descubierto máximo permitido al crear una cuenta : -2000.0 euros. */
	public final static double MAX_DESCUBIERTO = -2000;
	/** Embargo máximo de una cuenta: 100.0 %. */
	public final static double MAX_EMBARGO = 100;
	/** Saldo máximo para una cuenta: 5.0E7 euros. */
	public final static double MIN_EMBARGO = 0;
	/** Embargo mínimo de una cuenta : 0.0%. */
	public final static double MAX_SALDO = 50000000;
	/** Año mínimo para la creación de una cuenta: 1900. */
	public final static int MIN_YEAR = 1900;
	/** Cantidad maxima de cuentas. */
	public final static int MAX_CANT_CUENTAS = 9999;

// ATRIBUTO VARIABLE DE CLASE
	private static int cantidadCuentas;
	private static double totalSaldoCuentas;
	private static LocalDate fechaModerna = LocalDate.of(1900, 01, 01);
	private static int NumCuentasEmbargadas;
	private static int contadorAnual = 0;
	private static int ultimoAnio = -1;

//	ATRIBUTPS DE OBJETO
//	ATRIBUTOS VARIABLES DE OBJETO
	private double saldo;
	private LocalDate fechaCreacion;
	private double limiteDescubierto;
	private String ID;
	private double porcentajeEmbargo;
	private double saldoMaximo;
	private double totalIngresado;
	private double saldoEmbargado;

	/** Constructor con tres parámetros. */
	public PlayamarBank(double saldoInicial, LocalDate fechaCreacion, double limiteDescubierto)
			throws IllegalArgumentException {
		if (saldoInicial < 0) {
			throw new IllegalArgumentException("El saldo inicial no puede ser menor que 0.");
		} else if (fechaCreacion.getYear() < MIN_YEAR) {
			throw new IllegalArgumentException("El año de creacion debe de ser mayor que 1900.");
		} else if (fechaCreacion.getYear() > LocalDate.now().getYear()) {
			throw new IllegalArgumentException("El año de creacion debe de ser menor que el año actual.");
		} else if (fechaCreacion.getYear() == LocalDate.now().getYear()
				&& fechaCreacion.getDayOfYear() > LocalDate.now().getDayOfYear()) {
			throw new IllegalArgumentException("La fecha de creacion no puede superar el dia actual del año.");
		} else if (limiteDescubierto < MAX_DESCUBIERTO) {
			throw new IllegalArgumentException("El limite de descubierto debe ser mayor a -2000.");
		} else if (cantidadCuentas == MAX_CANT_CUENTAS) {
			throw new IllegalArgumentException("El limite de cuentas fue alcanzado en este año.");
		}

		cantidadCuentas++;
		this.saldo = saldoInicial;
		this.fechaCreacion = fechaCreacion;
		this.limiteDescubierto = limiteDescubierto;
		this.ID = generadorID();
		this.porcentajeEmbargo = MIN_EMBARGO;
		this.saldoMaximo = saldoInicial;
		totalSaldoCuentas += saldoMaximo;
		if (fechaCreacion.isAfter(fechaModerna)) {
			fechaModerna = fechaCreacion;
		}

	}

	/** Constructor con dos parámetros. */
	public PlayamarBank(double saldoInicial, LocalDate fechaCreacion) {
		this(saldoInicial, fechaCreacion, 0);

	}

	/** Constructor con un parámetro. */
	public PlayamarBank(double saldoInicial) {
		this(saldoInicial, LocalDate.now(), DEFAULT_MAX_DESCUBIERTO);

	}

	/** Constructor con cero parámetros. */
	public PlayamarBank() {
		this(DEFAULT_SALDO, LocalDate.now(), DEFAULT_MAX_DESCUBIERTO);

	}

	private String generadorID() {
		int anioActual = fechaCreacion.getYear();

		if (anioActual != ultimoAnio) {
			contadorAnual = 0;
			ultimoAnio = anioActual;
		}

		if (contadorAnual >= MAX_CANT_CUENTAS) {
			throw new IllegalStateException("Se alcanzó el máximo de 9999 cuentas para el año " + anioActual);
		}

		String id = String.format("%d-%04d", anioActual, contadorAnual);

		contadorAnual++;

		return id;
	}

	/**
	 * Devuelve el ID de la cuenta.
	 * 
	 * @return
	 */

	public String getID() {
		return ID;
	}

	/**
	 * Devuelve el saldo actua lde la cuenta.
	 * 
	 * @return
	 */

	public double getSaldo() {
		return saldo;
	}

	/**
	 * Devuelve la fecha de creacion de la cuenta.
	 * 
	 * @return
	 */
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * Devuelve el Limite de descubierto.
	 * 
	 * @return
	 */

	public double getLimiteDescubierto() {
		return limiteDescubierto;
	}

	/**
	 * Devuelve el porcentaje de embargo de la cuenta.
	 * 
	 * @return
	 */

	public double getPorcentajeEmbargo() {
		return porcentajeEmbargo;
	}

	/**
	 * Devuelve si la cuenta esta descubierta o no.
	 * 
	 * @return
	 */

	public boolean isDescubierta() {
		return saldo < 0;
	}

	/**
	 * Devuelve si la cuenta esta embargada o no.
	 * 
	 * @return
	 */

	public boolean isEmbargada() {
		return saldoEmbargado > 0;
	}

	/**
	 * Devuelve la cantidad de dias que lleva la cuenta activa.
	 * 
	 * @return
	 */

	public long getDiasCuenta() {
		int dias_anio_actual = LocalDate.now().getDayOfYear() - fechaCreacion.getDayOfYear();
		int dias_anios = 0;
		for (int i = 0; i < LocalDate.now().getYear() - fechaCreacion.getYear(); i++) {
			dias_anios = dias_anios + 365;
		}
		return dias_anio_actual + dias_anios;
	}

	/**
	 * Devuelve el saldo maximo que haya tenido la cuenta.
	 * 
	 * @return
	 */

	public double getSaldoMaximo() {
		return saldoMaximo;
	}

	/**
	 * Devuelve el total de saldo ingresado en la cuenta.
	 * 
	 * @return
	 */

	public double getTotalIngresado() {
		return totalIngresado;
	}

	/**
	 * Devuelve el saldo global de todas las cuentas.
	 * 
	 * @return
	 */

	public static double getSaldoGlobal() {
		return totalSaldoCuentas;
	}

	/**
	 * Devuvlve la fecha de creacion de cuenta más moderna.
	 * 
	 * @return
	 */

	public static LocalDate getFechaMasModerna() {
		return fechaModerna;
	}

	/**
	 * Devuelve el numero de cuentas embargadas hasta el momento.
	 * 
	 * @return
	 */

	public static int getNumCuentasEmbargadas() {
		return NumCuentasEmbargadas;
	}

	/**
	 * Embarga la cuenta, por lo que esta no podra usar ese el porcentaje de embargo
	 * dentro de su saldo actual, y no podra tener su cuenta en numero rojos
	 * 
	 * @param porcentaje
	 * @throws IllegalArgumentException
	 * @throws IllegalStateException
	 */
	public void embargar(double porcentaje) throws IllegalArgumentException, IllegalStateException {
		if (porcentajeEmbargo > 0) {
			throw new IllegalStateException("La cuenta ya se encontraba embargada");
		} else if (porcentaje > 100 || porcentaje < 0) {
			throw new IllegalArgumentException("Los valores de porcentaje de embargo deben estar entre 0 y 100");
		} else if (saldo < 0) {
			throw new IllegalStateException("La cuenta se encuenta en numeros rojos");
		}

		saldoEmbargado = (saldo * porcentaje) / 100;

		porcentajeEmbargo = porcentaje;

		NumCuentasEmbargadas++;

	}

	/**
	 * Desembarga la cuenta devolviendole la posibilidad de acceder a todo su saldo.
	 * Devolvera un true si la cuenta estaba embargada y un false si no
	 * 
	 * @return
	 */

	public boolean desembargar() {
		boolean desembargo;
		if (porcentajeEmbargo > 0) {
			desembargo = true;
			saldoEmbargado = 0;
			porcentajeEmbargo = 0;
			NumCuentasEmbargadas--;
		} else
			desembargo = false;
		return desembargo;
	}

	/**
	 * Ingresa dinero en la cuenta. Se permiten ingresar 0.0 €.
	 * 
	 * @param cantidad
	 * @throws IllegalArgumentException
	 * @throws IllegalStateException
	 */
	public void ingresar(double cantidad) throws IllegalArgumentException, IllegalStateException {
		if (cantidad < 0) {
			throw new IllegalArgumentException("El saldo a ingresar debe ser mayor o igual a 0€");
		} else if (saldo + cantidad > MAX_SALDO) {
			throw new IllegalStateException("El ingreso supera el saldo maximo de la cuenta");
		}

		if (saldo + cantidad > saldoMaximo) {
			saldoMaximo = saldo + cantidad;
		}

		totalSaldoCuentas += cantidad;
		saldo += cantidad;

	}

	/**
	 * Extrae dinero de una cuenta. No se permitira si la cantidad supera el saldo
	 * en la cuenta. Se podran retirar 0€.
	 * 
	 * @param cantidad
	 * @throws IllegalArgumentException
	 * @throws IllegalStateException
	 */

	public void extraer(double cantidad) throws IllegalArgumentException, IllegalStateException {
		if (cantidad < 0) {
			throw new IllegalArgumentException("La cantida a ingresar debe de ser mayor que 0");
		} else if (saldo - cantidad < limiteDescubierto) {
			throw new IllegalStateException("La cuenta no tiene más dinero");
		} else if (porcentajeEmbargo > 0 && cantidad > (saldo - saldoEmbargado)) {
			throw new IllegalArgumentException("Dinero en la cuenta embargado");
		}

		totalSaldoCuentas -= cantidad;
		saldo -= cantidad;
	}

	/**
	 * Transfiere determinado dinero de una cuenta a otra
	 * 
	 * @param cantidad
	 * @param cuenta
	 * @throws IllegalArgumentException
	 * @throws IllegalStateException
	 */

	public void transferir(double cantidad, PlayamarBank cuenta)
			throws IllegalArgumentException, IllegalStateException {
		if (cantidad < 0) {
			throw new IllegalArgumentException("La cantida a transferir debe de ser mayor que 0");
		} else if (cantidad > saldo + -limiteDescubierto) {
			throw new IllegalStateException("La cuenta no tiene más dinero");
		} else if (porcentajeEmbargo > 0 && cantidad > (saldo - saldoEmbargado)) {
			throw new IllegalArgumentException("Dinero en la cuenta embargado");
		} else if (cuenta == null) {
			throw new IllegalArgumentException("El dinero tiene que estar dirigido a una cuenta valida");
		} else if (cuenta.getSaldo() >= MAX_SALDO) {
			throw new IllegalStateException("Cantida maxima de dinero en la cuenta a transferir");
		}

		cuenta.ingresar(cantidad);
		saldo -= cantidad;

	}

	/**
	 * Transfiere todo el dinero de una cuenta a otra. si la cuenta se encuenta en
	 * descubietrto solo se transferiran 0.0€ si se encientra embargada se
	 * transferira todo menos lo embargado
	 * 
	 * @param cuenta
	 * @throws IllegalArgumentException
	 * @throws IllegalStateException
	 */
	public void transferir(PlayamarBank cuenta) throws IllegalArgumentException, IllegalStateException {
		if (saldo == limiteDescubierto) {
			transferir(0, cuenta);
		} else if (porcentajeEmbargo > 0) {
			transferir(saldo - saldoEmbargado, cuenta);
			throw new IllegalStateException("Al estar la cuenta embargada solo se transferira lo no embargado.");
		} else if (cuenta == null) {
			throw new IllegalArgumentException("El dinero tiene que estar dirigido a una cuenta valida");
		} else if (cuenta.getSaldo() >= MAX_SALDO) {
			throw new IllegalStateException("Cantidad maxima de dinero en la cuenta a transferir");
		}

		transferir(saldo, cuenta);
	}

	/**
	 * Devuelve una cadena que representa el estado actual de la cuenta.
	 */
	public String toString() {
		String frase = String.format("id: %s. - Saldo: %f - Embargada: %s - Saldo Embargado: %.2f", ID, saldo,
				porcentajeEmbargo > 0 ? "si" : "no", porcentajeEmbargo > 0 ? saldoEmbargado : 0);
		return frase;
	}

}
