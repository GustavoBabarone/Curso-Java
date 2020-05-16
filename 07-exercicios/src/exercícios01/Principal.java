package exercícios01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int[][] numeros = new int [10][2];
		Object[] operacoes = {"Soma", "Subtração", "Multiplicação", "Divisão"}; 
		int operacao=0;
				
		numeros[0][0]= Integer.parseInt(JOptionPane.showInputDialog(null, "1º número"));
		numeros[1][0]= Integer.parseInt(JOptionPane.showInputDialog(null, "2º número"));
		numeros[2][0]= Integer.parseInt(JOptionPane.showInputDialog(null, "3º número"));
		numeros[3][0]= Integer.parseInt(JOptionPane.showInputDialog(null, "4º número"));
		numeros[4][0]= Integer.parseInt(JOptionPane.showInputDialog(null, "5º número"));
		numeros[5][0]= Integer.parseInt(JOptionPane.showInputDialog(null, "6º número"));
		numeros[6][0]= Integer.parseInt(JOptionPane.showInputDialog(null, "7º número"));
		numeros[7][0]= Integer.parseInt(JOptionPane.showInputDialog(null, "8º número"));
		numeros[8][0]= Integer.parseInt(JOptionPane.showInputDialog(null, "9º número"));
		numeros[9][0]= Integer.parseInt(JOptionPane.showInputDialog(null, "10º número"));
		
		numeros[0][1]= Integer.parseInt(JOptionPane.showInputDialog(null, "1º número"));
		numeros[1][1]= Integer.parseInt(JOptionPane.showInputDialog(null, "2º número"));
		numeros[2][1]= Integer.parseInt(JOptionPane.showInputDialog(null, "3º número"));
		numeros[3][1]= Integer.parseInt(JOptionPane.showInputDialog(null, "4º número"));
		numeros[4][1]= Integer.parseInt(JOptionPane.showInputDialog(null, "5º número"));
		numeros[5][1]= Integer.parseInt(JOptionPane.showInputDialog(null, "6º número"));
		numeros[6][1]= Integer.parseInt(JOptionPane.showInputDialog(null, "7º número"));
		numeros[7][1]= Integer.parseInt(JOptionPane.showInputDialog(null, "8º número"));
		numeros[8][1]= Integer.parseInt(JOptionPane.showInputDialog(null, "9º número"));
		numeros[9][1]= Integer.parseInt(JOptionPane.showInputDialog(null, "10º número"));
		
		operacao = JOptionPane.showOptionDialog(null, "Tipo de Operação:", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, operacoes, 0);
		
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