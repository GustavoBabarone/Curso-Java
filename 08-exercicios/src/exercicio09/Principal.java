package exercicio09;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int matriz [][] = new int [2][3];
		
		//Pergunta
		for(int linha=0; linha<2; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
	 matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Insirir numero!"));
			}
		}
		
		//Matriz 3x2
		for(int linha=0; linha <2; linha++) {
			 
			 for(int coluna=0; coluna <3; coluna++) {
				 matriz [linha] [coluna] = matriz[linha][coluna]; 
			 }	 
		 }

		
		//Exibir estrutura 3x2
		
		for(int linha=0; linha<2; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				System.out.print(matriz[linha][coluna]+" ");
			}
			System.out.println();
	 }
		
		
		
		
		//int matriz1 [][] = new int [3][2];
		//matriz = matriz1;
		
		//Matrix 2x3
		for(int linha=0; linha <3; linha++) {
			 for(int coluna=0; coluna <2; coluna++) {
				 matriz [coluna] [linha] = matriz[coluna][linha]; 
				 
			 }
		}
		
		System.out.println("\n");
		
	    //Estrutura matrix 3x2
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0; coluna<2; coluna++) {
				System.out.print(matriz[coluna][linha]+" ");
			}
			System.out.println();
	 }
		
		
		
	}

}
