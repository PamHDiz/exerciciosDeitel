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
		
		int minhaPontuacao = 0; //pontua��o se n�o ganhar na primeira rodada
		Status statusJogo = null; // status do jogo
		
		int somaDosDados = rolarDados(); // primeira rolagem dos dados
		
		switch (somaDosDados) {
			case sete: //ganha com 7 no primeiro lan�amento
			case onze: // ganha com 11 no primeiro lan�amento
				statusJogo = Status.GANHOU;
				break;
			case duque: // perde com 2 no primero lance
			case trinca: // perde com 3 no primero lance
			case doze: // perde com 12 no primero lance
				statusJogo = Status.PERDEU;
				break;
			default: //n�o ganhou e nem perdeu. Por tanto, marca pontua��o
				statusJogo = statusJogo.CONTINUE; //jogo continua
				minhaPontuacao = somaDosDados; //marca a pontua��o
				System.out.printf("A pontua��o � %d%n", minhaPontuacao);
				break;
		}
		
		while(statusJogo == Status.CONTINUE) { //n�o ganhou e nem perdeu
			
			somaDosDados = rolarDados(); // lan�a dados novamente
			
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
			System.out.println("Voc� ganhou!");
		} else {
			System.out.println("Voc� perdeu!");
		}
			
	}
	
	//lan�a dados, calcula a soma e exibe os resultados
	private static int rolarDados() {
		
		//gera valores aleat�rios dos dados
		int dado1 = 1 + numeroRandom.nextInt(6); // dado 1
		int dado2 = 1 + numeroRandom.nextInt(6); // dado 2
		
		int soma = dado1 + dado2; // soma os valores dos dados
		
		System.out.printf("Jogador marcou %d + %d = %d%n", dado1, dado2, soma);
		return soma;
	}

}
