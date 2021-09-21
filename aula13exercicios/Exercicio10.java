package curso_java_basico.aula13exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe a temperatura em Celsius:");
		Double celsius = scan.nextDouble();
		Double farenheit = (celsius * 1.8) + 32 ;
		System.out.println("A temperatura em Celsius de: " + celsius + " em farenheit é de: " + farenheit);
		
		
		

	}

}
