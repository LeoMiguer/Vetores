package vetores;

import java.util.*;

public class Atividade02 {

	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		final int num = 10;
		int[] vetor = new int[num];
		int x = 0;
		
		for(x = 0; x < num; x++) {
			System.out.print("Digite um valor: ");
			vetor[x] = scanner.nextInt();
		}
		for(x = (num - 1); x >= 0; x--) {
			System.out.println(vetor[x]);
		}
	
		scanner.close();
	}
}
