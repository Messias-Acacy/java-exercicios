package aprender;

import java.util.Scanner;
public class ListaCheck {

	public static void main(String[] args) {
		Integer[] vetor = {null,null,null,null,null};
		Scanner sr = new Scanner(System.in);
		int numero;
		
		
		
		
		
		for(int y = 0;y < vetor.length;y++) {
			
			System.out.print("Digite um número: ");
			numero = sr.nextInt();
			vetor[y] = numero;
				
			for(int h =0;h < vetor.length;h++) {
					for(int x= 0;x < vetor.length;x++) {
						if(vetor[x]!= null) {
							if(x+1 < vetor.length && vetor[x+1] != null) {
						
									if(vetor[x] > vetor[x+1]) {
										int cash = vetor[x];
										vetor[x] = vetor[x+1];
										vetor[x+1] = cash;
									}
								
							}
							
						}
						else {
							break;
						}
					}
				}
			
			for(int i =0;i<vetor.length;i++) {
				if(vetor[i] != null) {
					if(numero == vetor[i]) {
						
						if(vetor[i+1] == null) {
							System.out.println("Número adicionado ao final da lista...");
						}else {
							System.out.println("Número adicionado na posicao "+i+" da lista...");
						}
						
					}
				}
			}
				

		}
		sr.close();
		
		System.out.print("=-=-=-=-=-=-=-=-=-==\nOs valores digitados em ordem foram [");
		for (int i = 0; i < vetor.length; i++) {
			if(i == vetor.length-1) {
				System.out.print(vetor[i]+"");
			}else {
				System.out.print(vetor[i]+", ");
			}
			
		}
		System.out.println("]");
		
		
		

		

	}

}
