package vetores;

import java.util.*;

public class Atividade03 {

	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		final int qnt = 4;
		double[] notas = new double[qnt];
		double soma = 0;
		
		for(int x = 0; x < qnt; x++) {
			System.out.print("Digite a "+ (x+1) +"º nota: ");
			notas[x] = scanner.nextInt();
			soma = soma + notas[x];
		}
		System.out.println("A média é: "+soma/qnt);
	}
}
