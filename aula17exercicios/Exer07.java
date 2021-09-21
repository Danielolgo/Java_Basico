package curso_java_basico.aula17exercicios;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		int num;
		int maior = Integer.MIN_VALUE;
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Entre com o um número");
			num = scan.nextInt();
			
			if (num > maior) {
				maior = num;
				System.out.println("O numero maior mudou" + maior);
				
			}
			
		}
		System.out.println("O maior numero digitado foi " + maior);

	}
	
	

}
