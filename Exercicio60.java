package Aprendendo;
import java.util.Scanner;
public class Exercicio60 {

	public static void main(String[] args) {
		Scanner sr= new Scanner(System.in);
		System.out.print("Digite um número aqui: ");
		double numeroFatorial = sr.nextInt();
		double calcfatorial =1;
		sr.close();
		
		for(int fatorando = 0; fatorando < numeroFatorial;fatorando++) {
			if(fatorando <4) {
				System.out.printf("%.0f x ",numeroFatorial-fatorando);
			}
			else {
				System.out.printf("%.0f = ", numeroFatorial-fatorando);
			}
			calcfatorial*=(int)numeroFatorial-fatorando;
		}
		System.out.printf("%.0f",calcfatorial);

	}

}
