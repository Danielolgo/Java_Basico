package curso_java_basico.aula15exercicios_1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a primeira nota");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a primeira nota");
		double nota2 = scan.nextDouble();
		
		double med = (nota1 + nota2) /2;
		
		if (med == 10) {
			System.out.println("aprovado com distinção");
		}
		if (med >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

	}

}
