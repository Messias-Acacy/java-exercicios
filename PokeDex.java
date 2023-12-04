package Aprendendo;

import java.util.Scanner;

public class PokeDex {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);

		String[] inimigoPokemon = sr.nextLine().split(" ");
		
		String quantidaAsh = sr.next();
		
		
		String[][] pokemons = new String[Integer.parseInt(quantidaAsh)+1][];
		
		
		for(int x =0;x < pokemons.length;x++) {
			pokemons[x] = sr.nextLine().split(" "); 
		}
		
		
	sr.close();
			if(inimigoPokemon[1].equals("agua")) {
				for(int x =1;x < pokemons.length;x++) {
					if(pokemons[x][1].equals("grama")) {
						System.out.println(pokemons[x][0]);
					}
				}
		
				for(int x =1;x < pokemons.length;x++) {
					if(pokemons[x][1].equals("fogo")) {
						System.out.println(pokemons[x][0]);
					}
				}
				
			}
			
			else if(inimigoPokemon[1].equals("fogo")) {
				for(int x =1;x < pokemons.length;x++) {
					if(pokemons[x][1].equals("agua")) {
						System.out.println(pokemons[x][0]);
					}
				}
		
				for(int x =1;x < pokemons.length;x++) {
					if(pokemons[x][1].equals("grama")) {
						System.out.println(pokemons[x][0]);
					}
				}
				
			}
			
			else {
				for(int x =1;x < pokemons.length;x++) {
					if(pokemons[x][1].equals("fogo")) {
						System.out.println(pokemons[x][0]);
					}
				}
		
				for(int x =1;x < pokemons.length;x++) {
					if(pokemons[x][1].equals("agua")) {
						System.out.println(pokemons[x][0]);
					}
				}
			}
				
		
			
	}
}
