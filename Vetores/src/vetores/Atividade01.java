package vetores;

import java.util.*;

public class Atividade01 {

	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		final int num = 5;
		int[] vetor = new int[num];
		
		for(int x = 0; x < num; x++) {
			System.out.print("Digite um valor:");
			vetor[x] = scanner.nextInt();
		}
		for(int x = 0; x < num; x++) {
			System.out.println(vetor[x]);
		}
		
		scanner.close();
	}
	
}
