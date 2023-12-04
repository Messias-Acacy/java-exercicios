package Aprendendo;
import java.util.Random;
import java.util.Scanner;
public class VetorAleatorioPrimo {
	public static void main (String[] args) {
		Scanner sr = new Scanner(System.in);
		Random number = new Random();
		int[][]vetor = new int[2][3];
		System.out.print("Digite o número máximo dentro do vetor: ");
		int numeroMax = sr.nextInt();
		
		int contPrimo = 0;
		
		
		for (int x =0;x < vetor.length;x++) {
			for(int y =0; y < vetor[x].length;y++) {
				vetor[x][y] =  number.nextInt(numeroMax)+1;
				
				
			}
		}
		
		
		for (int x =0;x < vetor.length;x++) {
			for(int y =0; y < vetor[x].length;y++) {
				contPrimo = 0;
				for(int z = 1; z <=vetor[x][y];z++) {

					if(vetor[x][y] % z == 0) {
						contPrimo++;
					}
				}
				if(contPrimo == 2) {
					System.out.print(vetor[x][y]+" ");
				}
				else {
					contPrimo = 0;
				}
				
			}
		}
		
		System.out.println();
		for (int x =0;x < vetor.length;x++) {
			for(int y =0; y < vetor[x].length;y++) {
				System.out.print(vetor[x][y]+" ");
				
				
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
