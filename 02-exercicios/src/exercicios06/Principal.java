package exercicios06;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu n�mero 1"));
		double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu n�mero 2"));
		
		if(numero1 == numero2) {
			JOptionPane.showMessageDialog(null, "A soma � "+(numero1 + numero2));
		}else if(numero1 != numero2) {
			JOptionPane.showMessageDialog(null,"A multiplica��o � "+numero1*numero2);
		}
	}

}
