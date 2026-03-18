package anexosClases;

public class PruebaDado {

	public static void main(String[] args) {
		
		Dado D1 = new Dado((byte)4);
		
		D1.tirada();
		
		System.out.printf("%s",D1.toString());
		
	}
}
