package curso_java_basico.aula15exercicios_1;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o primeiro numero");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("O primeiro numero informado: " + num1 + "é maior que o segundo numero informado: " + num2);
			
		} else {
			System.out.println("O segundo numero informado: " + num2 + "é maior que o primeiro numero informado: " + num1);
			
			
		}
		

	}
	

}
