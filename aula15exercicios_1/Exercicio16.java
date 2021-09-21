package curso_java_basico.aula15exercicios_1;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculando uma equação do 2° grau !");
		System.out.println("Entre com o valor de A: ");
		int valorA = scan.nextInt();
		
		
		if (valorA == 0) {
			System.out.println("O valor de A sendo igual a zero não forma uma equação do 2° grau! ");
		} else {
			System.out.println("Entre com o valor de B: ");
			int valorB = scan.nextInt();
			System.out.println("Entre com o valor de C: ");
			int valorC = scan.nextInt();
			
			double delta = (valorB*valorB )- (4*valorA*valorC);
			
			if (delta < 0) {
				System.out.println("Delta negativo");
				
			} else {
				
				System.out.println("Delta: " + delta);
				double x1 = ((-valorB) + Math.sqrt(delta)) / (2*valorA);
				double x2 = ((-valorB) - Math.sqrt(delta)) / (2*valorA);
				System.out.println("X1 = " + x1);
				System.out.println("X2 = " + x2);
				
				
				
			}
						
		}
	}
}
		
		
			
			
	
		
		
		
		
		
		
	
