package Aprendendo;
import java.util.Random;
import java.util.Scanner;
public class SenhaAleatoria2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sr = new Scanner(System.in);
		String letra = "AabBcCdDeEfFgGhHiJjKkLlMmNnOoPpQqRrSsTtUuVvXxWwZyz";
		String numero ="1234567890";
		String simbolo = "!@#$%&*()_+-*/|?:\"";
		
		
		System.out.print("Digite o tamanho da senha: ");
		int tamanhoSenha = sr.nextInt();
		System.out.print("Digite a quantidade de senhas: ");
		int quantidaeSenha = sr.nextInt();
		sr.close();
		
		System.out.println("senha(s): ");
		for(int y =0;y < quantidaeSenha;y++) {
			for (int x =0;x < tamanhoSenha;x++) {
				if(random.nextInt(3)+1 == 3) {
					System.out.print(letra.charAt(random.nextInt(letra.length())));
				}
				else if(random.nextInt(3)+1 == 2) {
					System.out.print(numero.charAt(random.nextInt(numero.length())));
				}
				else {
					System.out.print(simbolo.charAt(random.nextInt(simbolo.length())));
				}
			}
			System.out.println();
			
		}
		
		

	}

}
