package Aprendendo;
import java.util.Scanner;
public class TrianguloPascal {
	public static void main (String[] args) {
		Scanner sr = new Scanner(System.in);
		int tamanho = sr.nextInt();
		int [][] vetor = new int[tamanho+1][];
		
		for(int x = 0; x < vetor.length;x++) {
			vetor[x]=new int[x];
		}
		sr.close();
		

		for (int x =1; x < vetor.length;x++) {
			
			for(int z = tamanho;z > x;z--) {
				System.out.print(" ");
			}
			
			for(int y=0; y < x;y++) {
				if(y == 0 || y+1 == x) {
					vetor[x][y] = 1;
				}
				else {
					vetor[x][y] = vetor[x-1][y]+vetor[x-1][y-1];
				}
				System.out.print(vetor[x][y]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
	}
}


