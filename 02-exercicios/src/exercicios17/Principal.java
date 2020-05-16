package exercicios17;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual seu dividendo?"));
		double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual seu divisor?"));
		double resultado = (numero1 / numero2);
		
		JOptionPane.showMessageDialog(null, "O resultado �: "+resultado);
		
		
	}

}
