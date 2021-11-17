package br.com.deitel.exercicios;
import java.util.Scanner;


public class MaximumFinder {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		
		System.out.println("Digite o primeiro número: ");
		double num1 = ler.nextDouble();
		System.out.println("Digite o segundo número: ");
		double num2 = ler.nextDouble();
		System.out.println("Digite o terceiro número: ");
		double num3 = ler.nextDouble();
		
		
		double resultado = maximum(num1, num2, num3);
		System.out.println("O valor máximo é: " + resultado);
	}

	public static double maximum(double x, double y, double z) {
			
		double valorMaximo = x;
		
		if(valorMaximo < y) {
			valorMaximo = y;
		}
		
		if(valorMaximo < z) {
			valorMaximo = z;
		}
		return valorMaximo;
	}
	

}

