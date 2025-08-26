package vetores;

import java.util.*;

public class Atividade06 {

	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		final int qnt_alunos = 3;
		final int qnt_notas = 4;
		
		double notas[][] = new double[qnt_alunos][qnt_notas];
		double media[] = new double[qnt_alunos];
		double soma = 0;
		
		int x = 0, y = 0;
		
		for(y= 0; y < qnt_alunos; y++) {
			System.out.println("Notas do "+ (y+1) +"º aluno:");
			System.out.println("--------------------");
			for(x = 0; x < qnt_notas; x++) {
				System.out.print("Digite a "+ (x+1) +"º nota: ");
				notas[y][x] = scanner.nextInt();
				soma = soma + notas[y][x];
				if(x == (qnt_notas - 1)) {
					media[y] = soma / qnt_notas;
				}
			}
			if(!(y == (qnt_alunos - 1))) {
				System.out.println("Próximo aluno...");
				System.out.println("------------------------------");
			}
		}
		System.out.println("Alunos com média maior que 7.0:");
		for(y = 0; y < qnt_alunos; y++) {
			if(media[y] > 7) {
				System.out.println("Aluno "+ (y+1) +" com média: "+ media[y]);
			}
		}
		
	}
}
