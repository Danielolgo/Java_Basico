package curso_java_basico.aula15exercicios_1;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o numero da semana: ");
		int opcao = scan.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("ter�a");
			break;
		case 4:
			System.out.println("quarta");
			break;
		case 5:
			System.out.println("quinta");
			break;
		case 6:
			System.out.println("sexta");
			break;
		case 7:
			System.out.println("s�bado");
			break;

		default:
			System.out.println("Digite um numero de 1 at� 7");
			break;
		}

	}

}
