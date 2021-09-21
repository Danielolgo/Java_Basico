package curso_java_basico.aula13exercicios;

import java.util.Scanner;

public class Exercico6 {

	public static void main(String[] args) {
		Scanner scanEntrada = new Scanner(System.in);
		
		System.out.println("Entre com o valor do raio: ");
		Double raio = scanEntrada.nextDouble();
		
		// System.out.println("A área do circulo é : " + 3.14 * (raio*raio));
		
		Double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do circulo é: " + area);

	}

}
