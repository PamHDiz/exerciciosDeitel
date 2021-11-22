package br.com.deitel.exercicios;

public class SomaArray {

	public static void main(String[] args) {
		
		int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		int total = 0;
		
		for( int contador = 0; contador < array.length; contador++) {
			total += array[contador];
		}
		
		System.out.printf("O total dos elementos do array é: %d%n", total);

	}

}
