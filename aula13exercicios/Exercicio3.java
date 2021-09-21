package curso_java_basico.aula13exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Digite o segundo numero");
		int segundoNumero = scan.nextInt();
		
		System.out.println("A soma entre os numeros informados é: " + (primeiroNumero + segundoNumero));
		

	}

}
