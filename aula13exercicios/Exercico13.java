package curso_java_basico.aula13exercicios;

import java.util.Scanner;

public class Exercico13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor da hora trabalhada");
		Double valorHora = scan.nextDouble();
		
		System.out.println("Informe o total de horas trabalhadas no m�s");
		Integer totalHoraMes = scan.nextInt();
		
		double salarioBruto = valorHora * totalHoraMes;
		double inss = (salarioBruto/100)*8;
		double sind = (salarioBruto / 100) * 5;
		double ir = (salarioBruto/100)*11;
		double totalDesconto = inss + sind +ir;
		double salarioLiq = salarioBruto - totalDesconto;
		
				
				
		System.out.println("O salario bruto � de: " + salarioBruto);
		System.out.println("O INSS � de: " + inss);
		System.out.println("O sindicato � de: " + sind);
		System.out.println("O IR � de: " + ir);
		System.out.println("O desconto � de: " + totalDesconto);
		System.out.println("O salario liq � de: " + salarioLiq);
		// System.out.println("O total do seu sal�rio Horas Trabalhas x valor da Hora � de: " + valorHora * totalHoraMes);
		
		
		

	}

}
