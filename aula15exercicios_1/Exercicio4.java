package curso_java_basico.aula15exercicios_1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com uma letra");
		
		String imput = scan.next();
		
		/*Primeira forma de resolver
		if (imput.equalsIgnoreCase("a") || imput.equalsIgnoreCase("e") || imput.equalsIgnoreCase("i") || imput.equalsIgnoreCase("o") || imput.equalsIgnoreCase("u")) {
			System.out.println("Vogal");
		} else {
			System.out.println("consoante");
		} */
		if (imput.length() > 1) {
			System.out.println("Digite apenas uma letra");
			
		} else 
			switch (imput) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":	
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":System.out.println("Vogal"); break;
			

		default: System.out.println("consoante");
			
		}
		

	}

}
