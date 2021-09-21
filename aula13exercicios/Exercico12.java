package curso_java_basico.aula13exercicios;

import java.util.Scanner;

public class Exercico12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a altura");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("O peso ideal é de: " + pesoIdeal);
		

	}

}
