package curso_java_basico.aula15exercicios_1;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Entre com o ano: ");
		
		int ano = scan.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("É bisexto");
			
			
			
		}else {
			System.out.println("não é bisexto");
			
		}

	}

}
