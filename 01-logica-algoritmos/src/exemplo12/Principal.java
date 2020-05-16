package exemplo12;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner armazenar = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome?");

		String nome = armazenar.nextLine();
		
		System.out.println("Boa tarde "+nome);
		
	}

}
