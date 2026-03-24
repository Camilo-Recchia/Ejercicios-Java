package ejercicio7;

import java.util.Objects;

public class Venta {

	public static String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
			"Septiembre", "Octubre", "Noviembre", "Diciembre" };

	protected String mes;
	protected int venta;

	public Venta(String mes, int venta) {
		this.mes = mes;
		this.venta = venta;
	}

	public Venta() {
		this(meses[(int) (Math.random() * 12)], (int) (Math.random() * 10500));
	}

	@Override
	public String toString() {
		return "Venta [mes=" + mes + ", venta=" + venta + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(mes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venta other = (Venta) obj;
		return Objects.equals(mes, other.mes);
	}

	/**
	 * @return the mes
	 */
	public String getMes() {
		return mes;
	}

	/**
	 * @return the venta
	 */
	public int getVenta() {
		return venta;
	}

	/**
	 * @param mes the mes to set
	 */
	public void setMes(String mes) {
		this.mes = mes;
	}

	/**
	 * @param venta the venta to set
	 */
	public void setVenta(int venta) {
		this.venta = venta;
	}

}
