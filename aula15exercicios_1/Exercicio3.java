package curso_java_basico.aula15exercicios_1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com uma letra");
		
		String imput = scan.next();
		
		if (imput.equalsIgnoreCase("F")) {
			System.out.println("Feminino");
		} else if (imput.equalsIgnoreCase("M")) {
			System.out.println("Masculino");
		} else {
			System.out.println("Informe um sexo valido");
		}
		

	}

}
