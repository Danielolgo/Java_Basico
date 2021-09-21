package curso_java_basico.aula17exercicios;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		double media;
		int soma =0;
		
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Digite um numero");
			num = scan.nextInt();
			
			soma += num;
		}
		media = soma  / 5;
		
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + media);

	}

}
