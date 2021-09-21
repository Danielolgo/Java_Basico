package curso_java_basico.aula15exercicios_1;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("entre com o valor * hora:");
		double valorHora =scan.nextDouble();
		
		System.out.println("Entre com as horas trabalhadas no m�s");
		double qtdHoras = scan.nextDouble();
		
		double salarioBruto = valorHora*qtdHoras;
		
		int percentualIR = 0;
		if (salarioBruto <= 900) {
			percentualIR = 0;
			
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentualIR = 5;
			
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIR = 10;
			
		} else if (salarioBruto > 2500 ) {
			percentualIR = 20;
			
		}
		
		double ir = (salarioBruto / 100)* percentualIR;
		double inss = (salarioBruto / 100)*10;
		double fgts = (salarioBruto / 100)*11;
		double totalDesconto = ir + inss;
		double salarioLiquido = salarioBruto - totalDesconto;
		
		System.out.println("Salario bruto: (" + valorHora + "*" + qtdHoras + "):" + salarioBruto) ;
		System.out.println(" (-) IR (" + 5 + "%)" + ir) ;
		System.out.println("(-) INSS (10%): " + inss) ;
		System.out.println("FGTS (11%): " + fgts) ;
		System.out.println("Total de descontos" + totalDesconto) ;
		System.out.println("Salario Liquido: " + salarioLiquido) ;
	}

}
