package exerc�cios01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int[][] numeros = new int [10][2];
		Object[] operacoes = {"Soma", "Subtra��o", "Multiplica��o", "Divis�o"}; 
		int operacao=0;
				
		numeros[0][0]= Integer.parseInt(JOptionPane.showInputDialog(null, "1� n�mero"));
		numeros[1][0]= Integer.parseInt(JOptionPane.showInputDialog(null, "2� n�mero"));
		numeros[2][0]= Integer.parseInt(JOptionPane.showInputDialog(null, "3� n�mero"));
		numeros[3][0]= Integer.parseInt(JOptionPane.showInputDialog(null, "4� n�mero"));
		numeros[4][0]= Integer.parseInt(JOptionPane.showInputDialog(null, "5� n�mero"));
		numeros[5][0]= Integer.parseInt(JOptionPane.showInputDialog(null, "6� n�mero"));
		numeros[6][0]= Integer.parseInt(JOptionPane.showInputDialog(null, "7� n�mero"));
		numeros[7][0]= Integer.parseInt(JOptionPane.showInputDialog(null, "8� n�mero"));
		numeros[8][0]= Integer.parseInt(JOptionPane.showInputDialog(null, "9� n�mero"));
		numeros[9][0]= Integer.parseInt(JOptionPane.showInputDialog(null, "10� n�mero"));
		
		numeros[0][1]= Integer.parseInt(JOptionPane.showInputDialog(null, "1� n�mero"));
		numeros[1][1]= Integer.parseInt(JOptionPane.showInputDialog(null, "2� n�mero"));
		numeros[2][1]= Integer.parseInt(JOptionPane.showInputDialog(null, "3� n�mero"));
		numeros[3][1]= Integer.parseInt(JOptionPane.showInputDialog(null, "4� n�mero"));
		numeros[4][1]= Integer.parseInt(JOptionPane.showInputDialog(null, "5� n�mero"));
		numeros[5][1]= Integer.parseInt(JOptionPane.showInputDialog(null, "6� n�mero"));
		numeros[6][1]= Integer.parseInt(JOptionPane.showInputDialog(null, "7� n�mero"));
		numeros[7][1]= Integer.parseInt(JOptionPane.showInputDialog(null, "8� n�mero"));
		numeros[8][1]= Integer.parseInt(JOptionPane.showInputDialog(null, "9� n�mero"));
		numeros[9][1]= Integer.parseInt(JOptionPane.showInputDialog(null, "10� n�mero"));
		
		operacao = JOptionPane.showOptionDialog(null, "Tipo de Opera��o:", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, operacoes, 0);
		
		int i=0;
		String menu = "Ta Bela:\n";

		if(operacao == 0) {
			
		for(i = 0; i < numeros.length; i++) {
			menu+= "\n" +numeros[i][0] +" + " +numeros[i][1] +" = " +(numeros[i][0] + numeros[i][1]);
			
		}
			
		}else if(operacao == 1) {
			
			for(i = 0; i < numeros.length; i++) {
				menu+= "\n" +numeros[i][0] +" - " +numeros[i][1] +" = " +(numeros[i][0] - numeros[i][1]);
		}
			
		}else if(operacao == 2) {
			
			for(i = 0; i < 10; i++) {
				menu+= "\n" +numeros[i][0] +" X " +numeros[i][1] +" = " +(numeros[i][0] * numeros[i][1]);
		}
			
		}else if(operacao == 3) {
		
			for(i = 0; i < 10; i++) {
				menu+= "\n" +numeros[i][0] +" / " +numeros[i][1] +" = " +(numeros[i][0] + numeros[i][1]);
		}
		
		}
		JOptionPane.showMessageDialog(null, menu);
	}
}