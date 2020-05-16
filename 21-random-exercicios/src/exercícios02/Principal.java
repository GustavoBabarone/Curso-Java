package exercícios02;

import java.util.Random;

public class Principal {
	
	public static void main(String[] args) {
		
		int matriz [][] = new int [5][30];		
		
		Random gerador = new Random();
				
		// ADICIONANDO DADOS EM CADA POSIÇÃO
		for(int linha=0; linha <5; linha ++) {
			
			for (int coluna=0; coluna<30; coluna++) {
				int resultado = gerador.nextInt(10);
				matriz [linha] [coluna] = resultado;

			}			
		}
		
		// EXIBIR ESTRUTURA EM MATRIZ
		for(int linha=0; linha<5; linha++) {
			for(int coluna=0; coluna<30; coluna++) {
				System.out.print(matriz[linha][coluna]+" ");
			}
			System.out.println();		
		}						
	
	}
}
