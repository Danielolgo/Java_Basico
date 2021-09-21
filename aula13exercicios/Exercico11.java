package curso_java_basico.aula13exercicios;

import java.util.Scanner;

public class Exercico11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("entre com um numero inteiro");
		int num1 = scan.nextInt();
		
		System.out.println("entre com um numero inteiro");
		int num2 = scan.nextInt();
		
		System.out.println("entre com um numero real");
		Double num3 = scan.nextDouble();
		
		int result1 = (num1*2)*(num2/2);
		double result2 = (num1*3) + num3;
		double result3 = Math.pow(num3, 3);
		
		System.out.println("O resultado 1 é: " + result1);
		System.out.println("O resultado 1 é: " + result2);
		System.out.println("O resultado 1 é: " + result3);
		
		
		
		

	}

}
