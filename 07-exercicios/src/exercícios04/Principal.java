package exercícios04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String[] respostas = new String [10];
		boolean opcao = true;
		
		for(int i=0; i<10; i++) {
			respostas[i] = JOptionPane.showInputDialog(null, "Gabarito da questão "+(i+1));
		}
		
		do {
			
			int i=0;
				
			if((!respostas[i].equals("a")) || (!respostas[i].equals("b")) || (!respostas[i].equals("c")) || (!respostas[i].equals("d"))) {
				JOptionPane.showMessageDialog(null,  "ERRO SEU BURRO! GABARITO SÓ VAI ATÉ A LETRA D");
				opcao = false;
			}
		
		}while(opcao  == true);
		
	}

}
