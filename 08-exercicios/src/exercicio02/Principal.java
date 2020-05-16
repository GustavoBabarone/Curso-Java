package exercicio02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		/* 
		 int numeros [] = new int [10];
		
		
		numeros [0] = Integer.parseInt(JOptionPane.showInputDialog("1º numero"));
		numeros [1] = Integer.parseInt(JOptionPane.showInputDialog("2º numero"));
		numeros [2] = Integer.parseInt(JOptionPane.showInputDialog("3º numero"));
		numeros [3] = Integer.parseInt(JOptionPane.showInputDialog("4º numero"));
		numeros [4] = Integer.parseInt(JOptionPane.showInputDialog("5º numero"));
		numeros [5] = Integer.parseInt(JOptionPane.showInputDialog("6º numero"));
		numeros [6] = Integer.parseInt(JOptionPane.showInputDialog("7º numero"));
		numeros [7] = Integer.parseInt(JOptionPane.showInputDialog("8º numero"));
		numeros [8] = Integer.parseInt(JOptionPane.showInputDialog("9º numero"));
		numeros [9] = Integer.parseInt(JOptionPane.showInputDialog("10º numero"));
		
		String cabessulinha = "Pudim";
		
		cabessulinha = "\n"+numeros[9]+"\n"+numeros[8]+"\n"+numeros[7]
				+"\n"+numeros[6]
						+"\n"+numeros[5]
								+"\n"+numeros[4]
										+"\n"+numeros[3]
												+"\n"+numeros[2]
														+"\n"+numeros[1]
																+"\n"+numeros[0];
																*/
		
		int [] numeros = new int [10];
			
			for(int i=0 ; i<10; i++) {
				numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(i+1+"º número"));	
			}
			
			String bigode = "Número na ordem inversa";
			
		for (int i=9; i>-1 ;i--) {
			bigode+= "\n"+numeros[i];
		}
		
			JOptionPane.showMessageDialog(null, bigode);	
	}

}
