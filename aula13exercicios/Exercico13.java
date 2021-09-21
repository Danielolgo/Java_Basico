package curso_java_basico.aula13exercicios;

import java.util.Scanner;

public class Exercico13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor da hora trabalhada");
		Double valorHora = scan.nextDouble();
		
		System.out.println("Informe o total de horas trabalhadas no mês");
		Integer totalHoraMes = scan.nextInt();
		
		double salarioBruto = valorHora * totalHoraMes;
		double inss = (salarioBruto/100)*8;
		double sind = (salarioBruto / 100) * 5;
		double ir = (salarioBruto/100)*11;
		double totalDesconto = inss + sind +ir;
		double salarioLiq = salarioBruto - totalDesconto;
		
				
				
		System.out.println("O salario bruto é de: " + salarioBruto);
		System.out.println("O INSS é de: " + inss);
		System.out.println("O sindicato é de: " + sind);
		System.out.println("O IR é de: " + ir);
		System.out.println("O desconto é de: " + totalDesconto);
		System.out.println("O salario liq é de: " + salarioLiq);
		// System.out.println("O total do seu salário Horas Trabalhas x valor da Hora é de: " + valorHora * totalHoraMes);
		
		
		

	}

}
