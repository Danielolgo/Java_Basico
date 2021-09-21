package curso_java_basico.aula15exercicios_1;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o numero para verificação");
		int numero = scan.nextInt(); 
		
		if (numero %  2 == 0) {
			System.out.println("É par");
			
		}else {
			System.out.println("É impar");
		} 
				

	}

}
