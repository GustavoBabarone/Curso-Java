package exercicios11;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Sua 1� nota"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Sua 2� nota"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Sua 3� nota"));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Sua 4� nota"));
		int  falta = Integer.parseInt(JOptionPane.showInputDialog(null, "Seu n�mero de faltas"));
		double media = ((nota1 + nota2 + nota3 + nota4) / 4);
		
		if(falta > 15) {
			JOptionPane.showMessageDialog(null, "Reprovado! Sua quantidade de faltas � "+falta);
		}else if((media == 10)) {
			JOptionPane.showMessageDialog(null,  "Parab�ns! Sua m�dia � "+media);
		}else if((media >= 9) && (media <= 9.9)) {
			JOptionPane.showMessageDialog(null, "�timo! Sua m�dia � "+media);
	    }else if((media >= 7) && (media <= 8.9)) {
			JOptionPane.showMessageDialog(null,  "Bom! Sua m�dia � "+media);
		}else if((media >= 5.1) && (media <= 6.9)) {
			JOptionPane.showMessageDialog(null,  "Em exame! Sua m�dia � "+media);
		}else if((media >= 5) && (media <= 1)) {
			JOptionPane.showMessageDialog(null, "Reprovado! Sua m�dia � "+media);
		}
		
	}

}
