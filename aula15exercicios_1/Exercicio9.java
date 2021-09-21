package curso_java_basico.aula15exercicios_1;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo numero");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com o terceiro numero");
		int num3 = scan.nextInt();
		
		if ((num1<=num2) && (num1<=num3) && num2 <= num3) {
			// significa num1 é menor
			//significa num 3 é maior
			// num1 < num2 < num 3
			System.out.println(num3 + "_ " + num2 + "__" + num1 );
			
		} else if ((num1<=num2) && (num1<=num3) && num3 <= num2) {
			// significa num1 é menor
			//significa num 2 é maior
			// num1 < num3 < num 2
			System.out.println(num2 + "_ " + num3 + "__" + num1 );
			
		} else if ((num2<=num1) && (num2<=num3) && num1 <= num3) {
			// significa num2 é menor
			//significa num 3 é maior
			// num2 < num1 < num 3
			System.out.println(num3 + "_ " + num1 + "__" + num2);

		} else if ((num2<=num1) && (num2<=num3) && num3 <= num1) {
			// significa num2 é menor
			//significa num 1 é maior
			// num2 < num3 < num 1
			System.out.println(num1 + "_ " + num3 + "__" + num2);
			
		} else if ((num3<=num1) && (num3<=num2) && num1 <= num2) {
			// significa num3 é menor
			//significa num 2 é maior
			// num3 < num1 < num2
			System.out.println(num2 + "_ " + num1 + "__" + num3);
		} else if ((num3<=num1) && (num3<=num2) && num2 <= num1) {
			// significa num3 é menor
			//significa num 1 é maior
			// num3 < num2 < num 1
			System.out.println(num1 + "_ " + num2 + "__" + num3);

	}
	}
}
