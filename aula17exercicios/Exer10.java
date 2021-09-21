package curso_java_basico.aula17exercicios;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 =0;
		int num2 =0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		num1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero");
		num2 = scan.nextInt();
		
		for (int i = num1; i <= num2; i++) {
			
			System.out.println(i);
			
		}
		
		
		
		
		
		
		

	}

}
