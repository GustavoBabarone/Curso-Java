package exercicios15;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Ol�, qual op��o desaja? \n1-Apto Simples \n2-Apto Duplo \n3-Su�te luxo"));
		int diaria = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos dias pretende se hospedar?"));
		
	    if(opcao == 1) {
	    	JOptionPane.showMessageDialog(null, "O total ser� de R$"+diaria*45);
	    }else if(opcao == 2) {
	    	JOptionPane.showMessageDialog(null, "O total ser� de R$"+diaria*65);
	    }else if(opcao == 3) {
	    	JOptionPane.showMessageDialog(null, "O total ser� de R$"+diaria*110);
	    }
	}
}
