package metodos;

public class MetodoNumerosAño {

	public static void main(String[] args) {

		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		int[][] temperaturas = new int[12][30];

		temp(40, temperaturas);

		for (int mes = 0; mes < 12; mes++) {
			System.out.printf("\n Mes " + (mes + 1) + ": ");
			for (int dia = 0; dia < 30; dia++) {
				System.out.print("\t " + temperaturas[mes][dia]);
			}
		}
		System.out.println("");
		int temperaturaMax;
		for (int mes = 0; mes < 12; mes++) {
			System.out.println("\nLa temperatura más caliente del mes " + (mes + 1) + " fue de "
					+ tempMax(temperaturas, mes) + "º. La más fria " + "fue de " + tempMin(temperaturas, mes)
					+ "º. Y la amplitud termica fue de "
					+ (tempMax(temperaturas, mes) - tempMin(temperaturas, mes) + "º"));
			

		}
		System.out.println("");
		System.out.println("El día más caluroso del año estuvo a "+diaCalor(temperaturas)+"º");
	}

//	Metodo para inicializar los valores demtro del array //

	public static void temp(int max, int[][] matrizTemp) {

		final int MESES = 12, DIAS = 30;

		for (int mes = 0; mes < 12; mes++) {

			for (int dia = 0; dia < 30; dia++) {
				matrizTemp[mes][dia] = (int) (Math.random() * max);
			}
		}
	}

//	Metodo para localizar la temperatura maxima de un mes //
	public static int tempMax(int[][] matrizTemp, int mes) {

		int max = matrizTemp[mes][0];
		for (int dia = 0; dia < 30; dia++) {
			if (max < matrizTemp[mes][dia]) {
				max = matrizTemp[mes][dia];
			}
		}

		return max;
	}

//	Metodo para localizar la temperatura minima de un mes //
	public static int tempMin(int[][] matrizTemp, int mes) {

		int min = matrizTemp[mes][0];
		for (int dia = 0; dia < 30; dia++) {
			if (min > matrizTemp[mes][dia]) {
				min = matrizTemp[mes][dia];
			}
		}

		return min;
	}

//	Metodo 
	public static int diaCalor(int[][] matrizTemp) {

		int diaCalor = matrizTemp[0][0];

		for (int mes = 0; mes < 12; mes++) {

			for (int dia = 0; dia < 30; dia++) {

				if (diaCalor < matrizTemp[mes][dia]) {
					diaCalor = matrizTemp[mes][dia];
				}

			}
		}
		return diaCalor;
	}

}
