package curso_java_basico.aula15exercicios_1;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int classificacao = 0;
		
		System.out.println("Telefonou para a vitima? ");
		String resposta1 = scan.next();
		if (resposta1.equalsIgnoreCase("sim")) {
			classificacao ++; 
		}else if (resposta1.equalsIgnoreCase("n�o")) {
			classificacao = classificacao;   
			
			
		} else {
			System.out.println("Digite sim ou n�o!");
			
		}
		
		//System.out.println(classificacao);
		System.out.println("Voc� esteve no local do crime? ");
		String resposta2 = scan.next();
		if (resposta2.equalsIgnoreCase("sim")) {
			classificacao ++; 
		}else if (resposta2.equalsIgnoreCase("n�o")) {
			classificacao = classificacao;   
			
			
		} else {
			System.out.println("Digite sim ou n�o!");
			
		}
		//System.out.println(classificacao);
		System.out.println("Voc� mora perto da vitima? ");
		String resposta3 = scan.next();
		if (resposta3.equalsIgnoreCase("sim")) {
			classificacao ++; 
		}else if (resposta3.equalsIgnoreCase("n�o")) {
			classificacao = classificacao;   
			
			
		} else {
			System.out.println("Digite sim ou n�o!");
			
		}
		//System.out.println(classificacao);
		System.out.println("Voc� estava devendo dinheiro para a vitima? ");
		String resposta4 = scan.next();
		if (resposta4.equalsIgnoreCase("sim")) {
			classificacao ++; 
		}else if (resposta4.equalsIgnoreCase("n�o")) {
			classificacao =classificacao;   
			
			
		} else {
			System.out.println("Digite sim ou n�o!");
			
		}
		//System.out.println(classificacao);
		System.out.println("Voc� trabalhou ou estudou com a vitima? ");
		String resposta5 = scan.next();
		if (resposta5.equalsIgnoreCase("sim")) {
			classificacao ++; 
		}else if (resposta5.equalsIgnoreCase("n�o")) {
			classificacao = classificacao;   
			
			
		} else {
			System.out.println("Digite sim ou n�o!");
			
		}
		
		if (classificacao == 2) {
			System.out.println("Voc� � suspeito do crime!!!");
			
		} else if (classificacao >= 3 && classificacao <= 4) {
			System.out.println("Voc� � C�mplice do crime!!!");
			
		} else if (classificacao == 5 ) {
			System.out.println("Voc� � o prov�vel assassino!!!");
			
		}else {
			System.out.println("Voc� � inocente");
		}	
			
		//System.out.println(classificacao);

	}

}
