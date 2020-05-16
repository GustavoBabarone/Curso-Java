package exercicios22;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o comprimento?"));
		double l = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a largura?"));
		double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a alura?"));
		
		if((c == l && c == a) || (l == c && l == a) || (a == l && a == c)) {
			JOptionPane.showMessageDialog(null, "O objeto é um quadrado");
		}else {
			JOptionPane.showMessageDialog(null, "O objeto não é um quadrado!");
		}
	}

}
