package exercicios10;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		double moeda1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantidade de moedas de R$0.01"));
		double moeda2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantidade de moedas de R$0.05"));
		double moeda3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantidade de moedas de R$0.10"));
		double moeda4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantidade de moedas de R$0.25"));
		double moeda5 = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantidade de moedas de R$0.50"));
		double moeda6 = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantidade de moedas de R$1.00"));
		double soma = ((moeda1*0.01) + (moeda2*0.05) + (moeda3*0.10) + (moeda4*0.25) + (moeda5*0.50) + (moeda6*1.00));
		
		JOptionPane.showMessageDialog(null, "Seu total � de: "+soma);
	}

}
