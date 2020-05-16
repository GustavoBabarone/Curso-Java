package exercicios02;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do seu produto?"));
		
		JOptionPane.showMessageDialog(null, "Desconto de 10%, total R$"+valor*0.9);
		JOptionPane.showMessageDialog(null, "Obrigado e volte sempre!");
	}

}
