package curso_java_basico.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & verdadeiro;
		boolean resultado2 = falso && verdadeiro;
		// curto circuito && ele nao verifica auqndo uma das condi�oes j� � atendida
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		int resultado = 1 + 1 - 1 + 1 * 1 / 1;
		System.out.println(resultado);
		

	}

}
