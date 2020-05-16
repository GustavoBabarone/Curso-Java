package exercicio04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String [] respostas = new String [10];
		boolean op = true;
		for(int i=0; i<10; i++) {
			respostas [i] = JOptionPane.showInputDialog("Gabarito da questão: "+(i+1));
		}

		do {
			int i=0;
			
			
			
			if ((!respostas[i].equals("a")) && (!respostas[i].equals("b")) && (!respostas[i].equals("c")) && (!respostas[i].equals("d"))) {
				JOptionPane.showMessageDialog(null, "ERRO SEU TANSO NÃO SABE O ALFANALBETO?");
				op = true;
			}
			
		}while (op == true);
		
	}

}
