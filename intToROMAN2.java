package Aprendendo;
import java.util.Scanner;
public class intToROMAN2 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		 int number = sr.nextInt();
		 int div = 1;
		 int count=0;
		 int num =0;
		 sr.close();
		 
		 String [] roman = {"I","V","X", "L",  "C",     "D",   "M"};
		 int [] algarismo = {1,5, 10,      50,  100,     500,  1000};
			
		 
		 for (int i = 0; i < Integer.toString(number).length()-1; i++) {
			div*=10;
			count++;
		 }
		 int inteiro = number;
		 
		 for (int i = 0; i <count+1; i++) {
			inteiro = number -(int)(number%div);
			number= (number%div);
			div/=10;
			
			
			
			//faz pra pegar casos de j-2 e j-1 (4 e 9 e seus multiplos de casas de 10
			while(inteiro != 0) {
				boolean checkUm = false;
				for (int j = 0; j < algarismo.length; j++) {
					if(inteiro == algarismo[j]) {
						System.out.print(roman[j]);
						inteiro=0;
						break;
					}
				}
				
				
				
				for (int j = 0; j < algarismo.length; j++) {
					if(j+1 < algarismo.length) {
						if(inteiro>=algarismo[j] && inteiro <= algarismo[j+1]) {
							for (int k = 1; k <= 3; k++) {
								if(inteiro==algarismo[j]*k) {
									for (int k2 = 1; k2 <= k; k2++) {
										System.out.print(roman[j]);}
										inteiro=0;
										break;
										}
									}
								}
							}
						}
				
				
				
				for (int j = 0; j < algarismo.length; j++) {
					if(j+1 < algarismo.length) {
						if(inteiro>=algarismo[j] && inteiro <= algarismo[j+1]) {
							
						
							
							num = j-2 >1? j-2:0;
							
							if(num == 0 && algarismo[j]==1) {
								break;
							}
							
							for (int k = 1; k <= 3; k++) {
								
								if(inteiro==algarismo[j]+(k*algarismo[num])) {
									System.out.print(roman[j]);
									
									for (int k2 = 1; k2 <= k; k2++) {
										System.out.print(roman[num]);}
										inteiro=0;
										break;
										
										}
									}
							
							
							
							num = j-1 >1? j-1:0;
							
							if(num == 0 && algarismo[j]==1) {
								break;
							}
							
							for (int k = 1; k <= 3; k++) {
								
								if(inteiro==algarismo[j]+(k*algarismo[num])) {
									System.out.print(roman[j]);
									
									for (int k2 = 1; k2 <= k; k2++) {
										System.out.print(roman[num]);}
										inteiro=0;
										break;
										
										}
									}
							
							
							
								}
							}
						}
				
				
				
				
				
				for (int j = 0; j < algarismo.length; j++) {
					if(j+1 < algarismo.length) {
						if(inteiro>=algarismo[j] && inteiro <= algarismo[j+1]) {
							if(algarismo[j+1]-algarismo[j] == inteiro) {
							
								System.out.print(roman[j]+roman[j+1]);
								inteiro=0;
								break;
							}
							else if(algarismo[j+1]-algarismo[j-1] == inteiro) {
								System.out.print(roman[j-1]+roman[j+1]);
								inteiro=0;
								break;
							}
							
							}
						}
					}
							
						
								
								
				
				
				

				
			}
			
			
			
			
			
			
			
		}
		 
		 
		 
		 
	}

}
