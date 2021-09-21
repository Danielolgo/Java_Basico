package curso_java_basico.aula15exercicios_1;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor do primeiro produto");
		double num1 = scan.nextDouble();
		
		System.out.println("Entre com o valor do segundo produto");
		double num2 = scan.nextDouble();
		
		System.out.println("Entre com o valor do terceiro produto");
		double num3 = scan.nextDouble();
		
		if ((num1<=num2) && (num1<=num3)) {
			System.out.println("O primeiro produto é o mais barato: " +num1);
			
		} else if ((num2<=num1) && (num2<=num3)) {
			System.out.println("O segundo produto é o mais barato: " +num2);
			
		} else {
			System.out.println("O terceiro produto é o mais barato: " +num3);

		}

	}

}
