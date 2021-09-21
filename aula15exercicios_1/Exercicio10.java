package curso_java_basico.aula15exercicios_1;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		System.out.println("Digite M-Matutino, V-Vespertino e N-Noturno");
		Scanner scan = new Scanner(System.in);
		
		String turno = scan.next();
		
		String pergunta  = "y";
		
		if (pergunta.equalsIgnoreCase("y")) {
			  
		switch (turno) {
		case "M":
		case "m": System.out.println("Bom dia!"); break;
		case "V":
		case "v":System.out.println("Boa tarde!");break;
		case "N":
		case "n":System.out.println("Boa Noite!");break;		

		default: System.out.println("Entre com uma opçao válida");
			break;
			
		}
		
		System.out.println("tentar novamente? Y-Sim N-Não ");
		pergunta = scan.next();
		
		} else if (pergunta.equalsIgnoreCase("n")) {
			System.out.println("Fim do programa. Obrigado!");
			
		} else System.out.println("Digite uma opçao valida");{
		
		}

	}

}
