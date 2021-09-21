package curso_java_basico.aula13exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scanEntrada = new Scanner(System.in);
		
		System.out.println("Informe a medida em metros:");
		Double  entraMetros = scanEntrada.nextDouble();
		
		System.out.println("A medida informada em centimetros é: " + (entraMetros * 1000) + " Centimetros");
		
		
		

	}

}
