package curso_java_basico.aula15exercicios_1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		System.out.println("informe o numero");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		if (num >= 0 ) {
			System.out.println("o numero  " + num +" é positivo");
		} else {
			System.out.println("o numero  " +num+" é negativo");
		}
		

	}

}
