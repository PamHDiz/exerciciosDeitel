package br.com.deitel.exercicios;

import java.security.SecureRandom;
//Programa utilizando Arrays ao inves de switch

public class RoletaRussa {

	public static void main(String[] args) {

		SecureRandom numeroRandom = new SecureRandom();
		int[] frequencia = new int[7]; // array para contar a frenquencia
		
		//para lançar o dado 6.000.000 de vezes e usa o valor do dado como indice da frequencia
		for(int rolar = 1; rolar <= 6000000; rolar++) {
			++frequencia[1 + numeroRandom.nextInt(6)];
		}
		
		System.out.printf("%s%12s%n", "Face", "Frequencia");
		
		// gera saída do valor de cada elemento do Array
		for(int face = 1; face < frequencia.length; face++) {
			System.out.printf("%4d%10d%n", face, frequencia[face]);
		}
		
		/*int frequencia1 = 0;
		int frequencia2 = 0;
		int frequencia3 = 0;
		int frequencia4 = 0;
		int frequencia5 = 0;
		int frequencia6 = 0;

		// lançamento dos dados
		for (int i = 1; i <= 6000000; i++) {

			int face = 1 + numeroRandom.nextInt(6); // número entre 1 e 6

			switch (face) { 
			
			// incrementa os contadores das faces
				case 1:
					++frequencia1;
					break;
				case 2:
					++frequencia2;
					break;
				case 3:
					++frequencia3;
					break;
				case 4:
					++frequencia4;
					break;
				case 5:
					++frequencia5;
					break;
				case 6:
					++frequencia6;
					break;
			}

		}
		
		System.out.println("face\tFrequência"); // cabeçalho	
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", 
				frequencia1, frequencia2, frequencia3, frequencia4, 
				frequencia5, frequencia6);
	*/
		
		
	}
}
