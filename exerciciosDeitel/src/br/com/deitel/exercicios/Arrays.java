package br.com.deitel.exercicios;

public class Arrays {

	public static void main(String[] args) {
		
		/*
		 * int[] c = new int[12]; // cria um objeto do tipo Array com 12 elementos int
		 * 
		 * //outro jeito de criar um objeto do tipo Array: int[] c1; c1 = new int[12];
		 */
		
		//int[] array = new int[10]; 
		
		//int[] array = {32, 10, 64, 18, 95, 14,90, 70, 65, 37}; // declaração de uma lista de inicialização
		
		
		final int ARRAY_LENGTH = 10; // declara constante
		int[] array = new int[ARRAY_LENGTH]; // cria array
		
		// calcula cada valor par da lista
		for(int contador = 0; contador < array.length; contador++) {
			array[contador] = 2 + 2 * contador;
		}
			
		System.out.printf("%s%8s%n", "Índice", "Valor");
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%5d%8d%n", i, array[i]);
		}
	}

}
