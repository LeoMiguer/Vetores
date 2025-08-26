package vetores;

import java.util.*;

public class Atividade04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		final int qnt = 10;
		String leitura[] = new String[qnt];
		int consoante = 0;
		
		for(int x = 0; x < qnt; x++) {
			System.out.print("Insira uma letra: ");
			leitura[x] = scanner.next();
			if(!(leitura[x].equalsIgnoreCase("A")||
				 leitura[x].equalsIgnoreCase("E")||
				 leitura[x].equalsIgnoreCase("I")||
				 leitura[x].equalsIgnoreCase("O")||
				 leitura[x].equalsIgnoreCase("U"))) {
				consoante = consoante + 1;
			}
		}
		System.out.println("Foram inseridas "+ consoante +" consoantes!");
		
	}

}
