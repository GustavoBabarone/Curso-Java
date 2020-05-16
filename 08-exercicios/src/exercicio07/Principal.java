package exercicio07;

import java.util.Random;


public class Principal {

	public static void main(String[] args) {
		
		//Variáveis
		int numeros [] = new int [5];
		boolean existe = false;
		int numero;
		int indice = 0;
		//Random
		Random gerar = new Random ();
		
		//Laço
		
		while(indice < 5){
			
			//Gerar um número
			numero = gerar.nextInt(10);
			
			//Verificar se o número existe
			existe=false;
			
			for(int i=0; i<5; i++){
				if(numero == numeros[i]) {
					existe = true;
				}
			}
			
			//Condicional
			if(existe == false) {
				numeros[indice] = numero;
				indice++;
			}
		}
		
		for(int n:numeros) {
			System.out.println(n);
		}
		
	}
}


