package Aprendendo;
import java.util.Scanner;
public class PrimosGemeos {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int numero = sr.nextInt();
		sr.close();
		
		int contPrimo =0;
		int ant = 0;
		int prox = 0;
		
		int cont = 1;
		int i = 1;
		
		float calc = 0.0F;
		
		while (cont <= numero) {
			contPrimo =0;
			for(int x =1;x <=i;x++) {
				if(i % x == 0) {
					contPrimo++;
				}
			}
			if(contPrimo == 2 && i > 2) {
				ant = i;
				contPrimo = 0;
				for (int y = 1;y <= i+2;y++) {
					if((i+2) % y == 0) {
						contPrimo++;
					}
				}
				
				if(contPrimo == 2) {
					prox = i+2;
				
				calc = ((float) (1.0/ant)+ (float) (1.0/prox))+calc;
			
					cont++;
				}
			}
			
			i++;
		}
		
		System.out.println(calc);
		
	}

}
