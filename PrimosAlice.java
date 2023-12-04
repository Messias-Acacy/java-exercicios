package Aprendendo;

import java.util.Scanner;
public class PrimosAlice {
	
	public static void main(String[] args) {
	Scanner sr = new Scanner(System.in);
	int numeroSenhaNumero = sr.nextInt();
	int [][] matriz = new int[numeroSenhaNumero][numeroSenhaNumero];
	int countPrimo = 0;
	int tamanhoVetorPrimo =0;
	int[] matrizPrimo;
	
	for(int x = 0;x < matriz.length;x++) {
		for(int y=0; y< matriz[x].length;y++) {
			matriz[x][y] = sr.nextInt();
			countPrimo =0;
			for(int z =1; z <=matriz[x][y];z++) {
				if(matriz[x][y] % z == 0) {
					countPrimo++;
				}
			}
			if(countPrimo == 2) {
				tamanhoVetorPrimo++;	
			}
		}
	}
	
	sr.close();
	
	matrizPrimo = new int[tamanhoVetorPrimo];
	int contadorMatriz = matrizPrimo.length-1;
	
	for(int x = 0;x < matriz.length;x++) {
		for(int y=0; y <matriz[x].length;y++) {
			countPrimo =0;
			for(int z =1;z <= matriz[x][y];z++) {
				if(matriz[x][y] % z == 0) {
					countPrimo++;
				}
			}
			if(countPrimo == 2) {
				matrizPrimo[contadorMatriz] = matriz[x][y];
				contadorMatriz--;}
			
			}

		}
	
	
	
	System.out.println();
	for(int y =0;y < matrizPrimo.length;y++) {
		for(int x =0;x < matrizPrimo.length;x++) {
			if(x+1 <= matrizPrimo.length-1) {
				if(matrizPrimo[x] > matrizPrimo[x+1]) {
					int cash = matrizPrimo[x+1];
					matrizPrimo[x+1] = matrizPrimo[x];
					matrizPrimo[x] = cash;
				}
			}
		}
	}
	
	
	for(int x: matrizPrimo) {
		System.out.print(x+" ");
	}
	
	
	
	
	
	


	}

}
