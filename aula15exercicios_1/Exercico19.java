package curso_java_basico.aula15exercicios_1;

import java.util.Scanner;

public class Exercico19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informa o primeiro numero");
		int num1 = scan.nextInt();
		System.out.println("Informa o  segundo numero");
		int num2 = scan.nextInt();
		System.out.println("Qual operação aritimética você deseja fazer? (+,-,/ ou *)");
		String operacao = scan.next();

		double resultado = 0;
		boolean valida = true;

		switch (operacao) {
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "*":
			resultado = num1 * num2;
			break;
		case "/":
			resultado = num1 / num2;
			break;

		default:
			System.out.println("operação invalida!");
			valida = false;
			break;
		}
		if (valida) {
			if (resultado>=0) {
				System.out.println("Resultado é positivo: " + resultado);
				
			} else {
				System.out.println("Resultado é negativo: "+ resultado);
			}
			
			if (resultado % 2 == 0) {
				System.out.println("Resultado é par: " + resultado);
				
			} else {
				
			}
			
		}

	}

}
