package curso_java_basico.aula13exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner entradaScan = new Scanner(System.in);
		
		System.out.println("Informe a 1 media");
		Double nota1 = entradaScan.nextDouble();
		
		System.out.println("Informe a 2 media");
		Double nota2 = entradaScan.nextDouble();
		
		System.out.println("Informe a 3 media");
		Double nota3 = entradaScan.nextDouble();
		
		System.out.println("Informe a 4 media");
		Double nota4 = entradaScan.nextDouble();
		
		System.out.println("A sua média é: " + (nota1+nota2+nota3+nota4)/4);
		

	}

}
