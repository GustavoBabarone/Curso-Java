package exercicio10;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int matriz [][] = new int [5][5];
		int l4=0,c2=0,dp=0,ds=0,soma=0;

		//Pergunta
		for(int linha=0; linha<5; linha++) {
			for(int coluna=0; coluna<5; coluna++) {
	 matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Insirir numero!"));
			}
		}
		

		//Matriz 5x5
		for(int linha=0; linha <5; linha++) {
			 
			 for(int coluna=0; coluna <5; coluna++) {
				 matriz [linha] [coluna] = matriz[linha][coluna]; 
			 }	 
		 }

		
		//Exibir estrutura 5x5
		
		for(int linha=0; linha<5; linha++) {
			for(int coluna=0; coluna<5; coluna++) {
				System.out.print(matriz[linha][coluna]+" ");
			}
			System.out.println();
	 }
		
		//Soma dos numeros da 4 linha
		for(int linha=3; linha<5; linha++ ) {
			l4= matriz[3][0]+matriz[3][1]+matriz[3][2]+matriz[3][3]+matriz[3][4];
		}
		
		//Soma dos numeros da 2 coluna
		for(int coluna=1; coluna<2; coluna++) {
			c2 = matriz[0][1]+matriz[1][1]+matriz[2][1]+matriz[3][1]+matriz[4][1];
		}
		
		//Soma da diagonal principal
		for(int linha=0; linha<5; linha++) {
			for(int coluna=0; coluna<5; coluna++) {
				dp = matriz[0][0]+matriz[1][1]+matriz[2][2]+matriz[3][3]+matriz[4][4];
			}
		}
		
		//Soma da diagonal secundaria
		for(int linha=0; linha<5; linha++) {
			for(int coluna=0; coluna<5; coluna++) {
				ds = matriz[4][4]+matriz[3][3]+matriz[2][2]+matriz[1][1]+matriz[0][0];
			}
		}
		
		//Soma de todos os elementos da matriz
		for(int linha=0; linha<5; linha++) {
			for(int coluna=0; coluna<5; coluna++) {
				soma = matriz[0][0]+matriz[0][1]+matriz[0][2]+matriz[0][3]+matriz[0][4]+
						matriz[1][0]+matriz[1][1]+matriz[1][2]+matriz[1][3]+matriz[1][4]+
						 matriz[2][0]+matriz[2][1]+matriz[2][2]+matriz[2][3]+matriz[2][4]+
						  matriz[3][0]+matriz[3][1]+matriz[3][2]+matriz[3][3]+matriz[3][4]+
						   matriz[4][0]+matriz[4][1]+matriz[4][2]+matriz[4][3]+matriz[4][4];
				
			}
		}
		
		
		String exibir = "Tabelinha toptop";
		exibir+= "\nSoma dos numeros da linha 4: "+l4;
		exibir+= "\nSoma dos numeros da coluna 2: "+c2;
		exibir+= "\nSoma da diagonal principal: "+dp;
		exibir+= "\nSoma da diagonal secundaria: "+ds;
		exibir+= "\nSoma de todos os numeros da matriz: "+soma;
		
		JOptionPane.showMessageDialog(null, exibir);
		
		
	}

}
