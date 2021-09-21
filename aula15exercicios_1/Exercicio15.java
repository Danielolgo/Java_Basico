package curso_java_basico.aula15exercicios_1;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor do 1 lado: ");
		double lado1 = scan.nextDouble();
		
		System.out.println("Entre com o valor do 2 lado: ");
		double lado2 = scan.nextDouble();
		
		System.out.println("Entre com o valor do 3 lado: ");
		double lado3 = scan.nextDouble();
		
		if (((lado1 +lado2) > lado3) || ((lado1 +lado3) > lado2) || ((lado2 +lado3) > lado1)) {
			
			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("Triangulo Equilátero");
				
			} else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
				System.out.println("Triangulo Escaleno");
			
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Triangulo Isóceles");
			
		} else {
			System.out.println("nao é triangulo");
		}
		

	}

}
}
