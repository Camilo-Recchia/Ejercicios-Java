package arraysMultidimencionales;

import java.util.Arrays;

public class Arrayexamen {

	public static void main(String[] args) {

		int[][] matriz = new int[10][10];
		
		Arrays.fill(matriz[1], 1);
		
		for(int i = 0; i<matriz.length;i++) {
			System.out.println("");
			for(int j = 0; j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]+" ");
			}
		}
		
	}

}
