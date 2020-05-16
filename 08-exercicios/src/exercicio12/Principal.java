package exercicio12;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int matriz [][] = new int [3][3];
		int j1,j2;
		
		
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog(" "));
			}
	      }
		//Matriz 3x3
				for(int linha=0; linha <3; linha++) {
					 
					 for(int coluna=0; coluna <3; coluna++) {
						 matriz [linha] [coluna] = matriz[linha][coluna]; 
					 }
				}
				 
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				System.out.print(matriz[linha][coluna] +" ");
			}
			System.out.println();
	 }
		
		  /*  "\n   |  |   "
			+ "\n---|--|---"
			+ "\n   |  |   "
			+ "\n---|--|---"
			+ "\n   |  |   "
		*/
		
}
}