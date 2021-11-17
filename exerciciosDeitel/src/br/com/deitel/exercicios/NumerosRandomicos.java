package br.com.deitel.exercicios;
import java.security.SecureRandom;

public class NumerosRandomicos {
	
	public static void main(String[] args) {
		
		SecureRandom numeroRandom = new SecureRandom();
		
		for(int i = 1; i <= 20; i++) {
			
			//seleciona o inteiro aleatório entre 1 e 6
			int face = 1 + numeroRandom.nextInt(6); 
			
			System.out.printf("%d ", face ); // exibe valor gerado
			
			if(i % 5 == 0) {
				System.out.println();
			}
		}
	}

}
