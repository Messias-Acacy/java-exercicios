package Aprendendo;

import java.util.Scanner;

public class Uninhodopovo {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		double x = sr.nextDouble();
		double y = sr.nextDouble();
		char letra = sr.next().charAt(0);
		
		sr.close();
		
		
		if(letra == 'A') {
			
			if(y-x > 1.0) {
				System.out.println("O uninho passou!");
				
			}
			else {
				System.out.println("Não passou!");
			}
			
		}
		else {
			if(y-x > 0.45) {
				System.out.println("O uninho passou!");
				
			}
			else {
				System.out.println("Não passou!");
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
