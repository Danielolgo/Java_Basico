package curso_java_basico.aula13exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scanEntrada = new Scanner(System.in);
		
		System.out.println("Calcula a área do quadrado");
		System.out.println("Entre com o valor do lado do quadrado");
		Double lado = scanEntrada.nextDouble();
		
		/*System.out.println("A área do quadrado é " + lado * lado);
		System.out.println("O dobro da área é: " + 2* (lado * lado));*/
		double area = Math.pow(lado, 2);
		
		System.out.println("A área do quadrado é" + area);
		System.out.println("O dobro da área do quadrado é: " + area * 2);

	}

}
