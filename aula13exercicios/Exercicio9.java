package curso_java_basico.aula13exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe a temperatura em Farenheit:");
		Double farenheit = scan.nextDouble();
		Double celsius = (5 *(farenheit-32)/9);
		System.out.println("A temperatura em farenheit de: " + farenheit + " em Celsius é de: " + celsius);
		

	}

}
