package curso_java_basico.aula13exercicios;

import java.util.Scanner;

public class Exercico8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor da hora trabalhada");
		Double valorHora = scan.nextDouble();
		
		System.out.println("Informe o total de horas trabalhadas no mês");
		Integer totalHoraMes = scan.nextInt();
		
		System.out.println("O total do seu salário Horas Trabalhas x valor da Hora é de: " + valorHora * totalHoraMes);
		
	}

}
