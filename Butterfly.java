package Aprendendo;
import java.util.Scanner;
public class Butterfly {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int tamanho = sr.nextInt();
		
		sr.close();
		
		//upper
		for(int x= 1; x <=tamanho;x++) {
			
			for (int asterisk =1;asterisk <=x;asterisk++) {
				System.out.print("*");		
			}
			
			for(int y = x; y <(tamanho*2)-x;y++) {
				System.out.print(" ");
				
			}
			
			for (int asterisk2 =1;asterisk2 <= x;asterisk2++) {
				System.out.print("*");
			}
			System.out.println();
				
		}
		//lower
		for(int x =tamanho*2; x >1;x--) {
			
			for(int y=1; y <= x-tamanho-1;y++) {
				System.out.print("*");
			}
			
			for(int space = 0;space <tamanho*2-(x-tamanho-1)*2;space++) {
				System.out.print(" ");
				
			}
			
			
			for(int z = 1;z<=x-tamanho-1;z++) {
				System.out.print("*");
			}
			
			
			System.out.println();
			
		}
		
	
		
		
		
		
		
		
		
	}

}
