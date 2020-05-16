package exercicios08;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual seu 1� n�mero?"));
		double calculo = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual sua opera��o? 1-Soma 2-Subtra��o 3-Multiplica��o 4-Divis�o"));
		double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual seu 2� n�mero?"));
		
		if(calculo == 1) 
			JOptionPane.showMessageDialog(null, "Resultado: "+(numero1 + numero2));
		if(calculo == 2)
			JOptionPane.showMessageDialog(null, "resultado: "+(numero1 - numero2));
		if(calculo == 3)
			JOptionPane.showMessageDialog(null, "Resultado: "+(numero1*numero2));
		if(calculo == 4)
			JOptionPane.showMessageDialog(null, "Resultado: "+(numero1 / numero2));
	}

}
