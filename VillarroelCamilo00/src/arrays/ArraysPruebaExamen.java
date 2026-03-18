package arrays;

public class ArraysPruebaExamen {

	public static void main(String[] args) {

		String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };

		int[][] temperaturas = new int[7][24];
		
		iniciarArray(temperaturas);

		MostrarArray(temperaturas, dias);

		System.out.println(HoraMasFria(temperaturas, dias));

		System.out.println(HoraMasCaliente(temperaturas, dias));

	}

	// Inicializa el array "temeraturas"
	public static void iniciarArray(int[][] array) {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 24; j++) {
				array[i][j] = (int) (Math.random() * 40);
			}
		}
	}

	// Muestra el array "Temperaturas" con el dia correspondiente a cada temperatura
	public static void MostrarArray(int[][] array, String[] dias) {
		for (int i = 0; i < dias.length; i++) {

			System.out.printf("Temperaturas del dia %s:", dias[i]);

			for (int j = 0; j < array[i].length; j++) {

				System.out.printf("\t%d", array[i][j]);

			}
			System.out.println("");
		}
	}

	// Obtiene Los Datos de la hora mas fria
	public static String HoraMasFria(int[][] array, String[] dias) {

		int masFria = array[0][0];
		int hora = 0;
		String dia = "";

		for (int i = 0; i != 7; i++) {
			for (int j = 0; j != 24; j++) {
				if (masFria > array[i][j]) {
					hora = j;
					dia = dias[i];
					masFria = array[i][j];
				}
			}
		}
		String frase = String.format("La temperatura más fria fue de %dº, se dio a las %d %s, el dia %s", masFria,
				hora + 1, hora + 1 <= 12 ? "am" : "pm", dia);
		return frase;
	}

	// Obtiene Los Datos de la hora mas caliente
	public static String HoraMasCaliente(int[][] array, String[] dias) {
		int masCaliente = array[0][0];
		int hora = 0;
		String dia = "";

		for (int i = 0; i != 7; i++) {
			for (int j = 0; j != 24; j++) {
				if (masCaliente < array[i][j]) {
					hora = j;
					dia = dias[i];
					masCaliente = array[i][j];
				}
			}
		}
		String frase = String.format("La temperatura más caliente fue de %dº, se dio a las %d %s, el dia %s",
				masCaliente, hora + 1, hora + 1 <= 12 ? "am" : "pm", dia);
		return frase;
	}
}
