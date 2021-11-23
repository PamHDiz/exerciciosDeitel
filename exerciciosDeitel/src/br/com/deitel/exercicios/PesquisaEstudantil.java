package br.com.deitel.exercicios;

/*Cap. 7 exercício sobre pesquisa hipotética sobre qualidade da alimentação em refeitórios
 da escola com notas entre 1 e 5 com uma resposta fora do Range para gerar Exceção.
*/
public class PesquisaEstudantil {

	public static void main(String[] args) {
		
		// Array com respostas dos alunos
		int[] respostas = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
		
		int[] frequencia = new int[6]; // contador de frequência
		
		//seleciona um elemento de Respostas e utiliza esse valor como índice de frequencia
		for (int nota = 0; nota < respostas.length; nota++) {
			
			try {
				++frequencia[respostas[nota]];
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e); // invoca o método toString com o erro
				System.out.printf("  respostas[%d] = %d%n%n", nota, respostas[nota]);
			}
			
		}
		
		System.out.printf("%s%12s%n", "Notas", "Frequência");
		
		// gera saída da frequência das notas
		for(int notas = 1; notas < frequencia.length; notas++) {
			System.out.printf("%6d%10d%n", notas, frequencia[notas]);
		}
	}

}
