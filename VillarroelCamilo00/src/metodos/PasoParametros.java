package metodos;

public class PasoParametros {

	public static void main(String[] args) {

		int[] vector = { 5, 10, 15 };

		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+"\t");
		}

		
		iniVector(vector);

		System.out.println("\nDespues de llamar al metodo...");
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+"\t");
		}

	}

//		Metodo de modificacion de un vector.	//
	
	public static void iniVector(int[] paramVector) {

		paramVector[0] = 50;
		paramVector[1] = 100;
	}

}
