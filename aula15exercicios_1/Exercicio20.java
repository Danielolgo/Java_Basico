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
		}else if (resposta1.equalsIgnoreCase("não")) {
			classificacao = classificacao;   
			
			
		} else {
			System.out.println("Digite sim ou não!");
			
		}
		
		//System.out.println(classificacao);
		System.out.println("Você esteve no local do crime? ");
		String resposta2 = scan.next();
		if (resposta2.equalsIgnoreCase("sim")) {
			classificacao ++; 
		}else if (resposta2.equalsIgnoreCase("não")) {
			classificacao = classificacao;   
			
			
		} else {
			System.out.println("Digite sim ou não!");
			
		}
		//System.out.println(classificacao);
		System.out.println("Você mora perto da vitima? ");
		String resposta3 = scan.next();
		if (resposta3.equalsIgnoreCase("sim")) {
			classificacao ++; 
		}else if (resposta3.equalsIgnoreCase("não")) {
			classificacao = classificacao;   
			
			
		} else {
			System.out.println("Digite sim ou não!");
			
		}
		//System.out.println(classificacao);
		System.out.println("Você estava devendo dinheiro para a vitima? ");
		String resposta4 = scan.next();
		if (resposta4.equalsIgnoreCase("sim")) {
			classificacao ++; 
		}else if (resposta4.equalsIgnoreCase("não")) {
			classificacao =classificacao;   
			
			
		} else {
			System.out.println("Digite sim ou não!");
			
		}
		//System.out.println(classificacao);
		System.out.println("Você trabalhou ou estudou com a vitima? ");
		String resposta5 = scan.next();
		if (resposta5.equalsIgnoreCase("sim")) {
			classificacao ++; 
		}else if (resposta5.equalsIgnoreCase("não")) {
			classificacao = classificacao;   
			
			
		} else {
			System.out.println("Digite sim ou não!");
			
		}
		
		if (classificacao == 2) {
			System.out.println("Você é suspeito do crime!!!");
			
		} else if (classificacao >= 3 && classificacao <= 4) {
			System.out.println("Você é Cúmplice do crime!!!");
			
		} else if (classificacao == 5 ) {
			System.out.println("Você é o provável assassino!!!");
			
		}else {
			System.out.println("Você é inocente");
		}	
			
		//System.out.println(classificacao);

	}

}
