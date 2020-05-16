package exercicios09;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o 1� n�mero desejado?"));
		double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o 2� n�mero desejado?"));
		double numero3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o 3� n�mero desejado?"));
		
		if((numero1 < numero2) && (numero1 < numero3)) {
			JOptionPane.showMessageDialog(null, "O menor n�mero � "+numero1);
		}
		if((numero2 < numero1) && (numero2 < numero3)) {
			JOptionPane.showMessageDialog(null, "O menor n�mero � "+numero2);
		}
		if((numero3 < numero1) && (numero3 < numero1)) {
			JOptionPane.showMessageDialog(null, "O menor n�mero � "+numero3);
		}
	}
}
