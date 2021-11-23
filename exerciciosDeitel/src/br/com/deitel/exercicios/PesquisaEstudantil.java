package br.com.deitel.exercicios;

/*Cap. 7 exerc�cio sobre pesquisa hipot�tica sobre qualidade da alimenta��o em refeit�rios
 da escola com notas entre 1 e 5 com uma resposta fora do Range para gerar Exce��o.
*/
public class PesquisaEstudantil {

	public static void main(String[] args) {
		
		// Array com respostas dos alunos
		int[] respostas = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
		
		int[] frequencia = new int[6]; // contador de frequ�ncia
		
		//seleciona um elemento de Respostas e utiliza esse valor como �ndice de frequencia
		for (int nota = 0; nota < respostas.length; nota++) {
			
			try {
				++frequencia[respostas[nota]];
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e); // invoca o m�todo toString com o erro
				System.out.printf("  respostas[%d] = %d%n%n", nota, respostas[nota]);
			}
			
		}
		
		System.out.printf("%s%12s%n", "Notas", "Frequ�ncia");
		
		// gera sa�da da frequ�ncia das notas
		for(int notas = 1; notas < frequencia.length; notas++) {
			System.out.printf("%6d%10d%n", notas, frequencia[notas]);
		}
	}

}
