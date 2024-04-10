package Aprendendo;
import java.util.Scanner;
public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int number = sr.nextInt();
					
		int check = 1;
		int countCheck = 0;
		
		while(!(check > number)){
			check*=2;
			countCheck++;
		}
		
	
		
		for(int x = 0;x < countCheck;x++) {
			check = check/2;
		
			if(number >= check) {
				number-=check;
				System.out.print(1);
			}
			else {
			
				System.out.print(0);
				
				
			}
			
	
			
		
			
				
		}
		
			
		

	}

}
