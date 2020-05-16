package exercicios05;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Qual dia deseja pesquisar?"));
		
		if ((dia == 2) || (dia == 3) || (dia == 9) || (dia == 10) || (dia == 16) || (dia == 17) || (dia == 23) || (dia == 24)) {
			JOptionPane.showMessageDialog(null, "O dia "+dia +" � final de semana");
		}else if ((dia < 1) || (dia > 28)) {
			JOptionPane.showMessageDialog(null, "Erro, data inv�lida!");
		}else {
		    JOptionPane.showMessageDialog(null, "O dia "+dia +" � dia de semana");
		}
	}
}

