package vetores;

import java.util.*;

public class Atividade05 {

	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		final int qnt = 20;
		int geral[] = new int[qnt];
		int pares[] = new int[qnt];
		int impares[] = new int[qnt];
		int x = 0;
		
		for(x = 0; x < qnt; x++) {
			System.out.print("Digite um número: ");
			geral[x] = scanner.nextInt();
			
			if((geral[x] % 2) == 0) {
				pares[x] = geral[x];
			}
			else {
				impares[x] = geral[x];
			}
		}
		System.out.println("\nVetor geral: ");
		for(x = 0; x < qnt; x++) {
			System.out.print(geral[x] +", ");
		}
		System.out.println("\nVetor de pares: ");
		for(x = 0; x < qnt; x++) {
			System.out.print(pares[x] +", ");
		}
		System.out.println("\nVetor de ímpares: ");
		for(x = 0; x < qnt; x++) {
			System.out.print(impares[x] +", ");
		}
		
	}
}
