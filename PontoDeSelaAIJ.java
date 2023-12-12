package Aprendendo;
import java.util.Scanner;
public class PontoDeSelaAIJ {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		sr.close();
		
		int [][]matriz = {{1,2},{0,3}};
		int menorElemento = matriz[0][0], menorLinha =0, maiorElemento = matriz[0][0], maiorLinha = 0;
	
		
		
		
		for(int i = 0; i < matriz.length;i++) {
			for(int j = 0; j < matriz[i].length;j++) {
		
					if(matriz[i][j] < menorElemento) {
						menorElemento = matriz[i][j];
						menorLinha = j;
					}
				
			}
			
			for(int z =0;z < matriz[i].length;z++) {
			
				if(matriz[z][menorLinha] > maiorElemento) {
					maiorElemento = matriz[z][menorLinha];
					maiorLinha = z;
					System.out.println(maiorElemento);
				}
			}
			
			
			if(maiorElemento == menorElemento) {
				System.out.println("Ponto de sela encontrado!");
				System.out.println("Elemento: "+matriz[maiorLinha][menorLinha]+"\nLinha: "+menorLinha+"\ncoluna: "+maiorLinha);
			}
			
			
			
			
			
			
		}
		
		
		

	}

}
