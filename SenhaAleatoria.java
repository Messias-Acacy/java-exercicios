package Aprendendo;

import java.util.Random;
import java.util.Scanner;
public class SenhaAleatoria {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner sr = new Scanner(System.in);
		String alfanumerico = "AabBcCdDeEfFgGhHiJjKkLlMmNnOoPpQqRrSsTtUuVvXxWwZyYz1234567890!@#<=[]>{}$%&*()_+-/|?:";
		
		System.out.print("Digite o tamanho da senha: ");
		int tamanhoSenha = sr.nextInt();
		System.out.print("Quantas senhas você quer gerar? -> ");
		int quantidadeSenhas = sr.nextInt();
		sr.close();
		System.out.println("Senha(s): ");
		for(int y = 0; y < quantidadeSenhas;y++) {
			for(int x = 0;x < tamanhoSenha;x++) {
				System.out.print(alfanumerico.charAt(random.nextInt(alfanumerico.length())));
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
