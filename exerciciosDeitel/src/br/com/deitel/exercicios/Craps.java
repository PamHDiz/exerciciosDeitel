package br.com.deitel.exercicios;

import java.security.SecureRandom;

public class Craps {
	
	private static final SecureRandom numeroRandom = new SecureRandom();
	private enum Status{CONTINUE, GANHOU, PERDEU};
	private static final int duque = 2;
	private static final int trinca = 3;
	private static final int sete = 7;
	private static final int onze = 11;
	private static final int doze = 12;
	
	//inicia partida de craps
	public static void main(String[] args) {
		
		int minhaPontuacao = 0; //pontuação se não ganhar na primeira rodada
		Status statusJogo = null; // status do jogo
		
		int somaDosDados = rolarDados(); // primeira rolagem dos dados
		
		switch (somaDosDados) {
			case sete: //ganha com 7 no primeiro lançamento
			case onze: // ganha com 11 no primeiro lançamento
				statusJogo = Status.GANHOU;
				break;
			case duque: // perde com 2 no primero lance
			case trinca: // perde com 3 no primero lance
			case doze: // perde com 12 no primero lance
				statusJogo = Status.PERDEU;
				break;
			default: //não ganhou e nem perdeu. Por tanto, marca pontuação
				statusJogo = statusJogo.CONTINUE; //jogo continua
				minhaPontuacao = somaDosDados; //marca a pontuação
				System.out.printf("A pontuação é %d%n", minhaPontuacao);
				break;
		}
		
		while(statusJogo == Status.CONTINUE) { //não ganhou e nem perdeu
			
			somaDosDados = rolarDados(); // lança dados novamente
			
			//determina estado do jogo
			if(somaDosDados == minhaPontuacao) { // vitoria por pontos
				statusJogo = Status.GANHOU;
			} else {
				if(somaDosDados == sete) {
					statusJogo = Status.PERDEU;
				}
			}
		}
		
		if(statusJogo == Status.GANHOU) {
			System.out.println("Você ganhou!");
		} else {
			System.out.println("Você perdeu!");
		}
			
	}
	
	//lança dados, calcula a soma e exibe os resultados
	private static int rolarDados() {
		
		//gera valores aleatórios dos dados
		int dado1 = 1 + numeroRandom.nextInt(6); // dado 1
		int dado2 = 1 + numeroRandom.nextInt(6); // dado 2
		
		int soma = dado1 + dado2; // soma os valores dos dados
		
		System.out.printf("Jogador marcou %d + %d = %d%n", dado1, dado2, soma);
		return soma;
	}

}
