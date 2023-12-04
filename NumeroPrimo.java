package Aprendendo;
import java.util.Scanner;
public class NumeroPrimo {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int[] vetor = new int[3];
		int primoCheck = 0;
		
		for(int x =0; x < vetor.length;x++) {
			vetor[x] = sr.nextInt();
		}
		sr.close();
			
		
		for(int y=0; y < vetor.length;y++) {
			
			for(int z =1;z <= vetor[y];z++) {
				if(vetor[y] % z ==0) {
					primoCheck++;
				}
			}
			if(primoCheck == 2) {
				System.out.println(vetor[y]+" é primo!");
			}
			else {
				primoCheck =0;
			}
				
			}

	}

}
