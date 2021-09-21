package curso_java_basico.aula15exercicios_1;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a nota do 1° BI");
		double nota1bi = scan.nextDouble();

		System.out.println("Entre com a nota do 2° BI");
		double nota2bi = scan.nextDouble();

		System.out.println("Entre com a nota do 3° BI");
		double nota3bi = scan.nextDouble();

		System.out.println("Entre com a nota do 4° BI");
		double nota4bi = scan.nextDouble();

		double media = (nota1bi + nota2bi + nota3bi + nota4bi) / 4;

		String aproveitamento = "";

		if (media >= 9.0 && media <= 10.0) {
			aproveitamento = "A";

		} else if (media >= 7.5 && media < 9.0) {
			aproveitamento = "B";

		} else if (media >= 6.0 && media < 7.5) {
			aproveitamento = "C";

		} else if (media >= 4.0 && media < 6.0) {
			aproveitamento = "D";

		} else if (media >= 0.0 && media < 4.0) {
			aproveitamento = "E";

		}

		System.out.println("As suas notas foram");
		System.out.println("1 BI: " + nota1bi);
		System.out.println("2 BI: " + nota2bi);
		System.out.println("3 BI: " + nota3bi);
		System.out.println("4 BI: " + nota4bi);
		System.out.println("A sua média foi: " + media);
		System.out.println("O seu conceito foi: " + aproveitamento);

		switch (aproveitamento) {
		case "A":
		case "B":
		case "C":
			System.out.println("APROVADO");
			break;
		case "D":
		case "E":
			System.out.println("REPROVADO");
			break;

		default:
			break;
		}

	}

}
