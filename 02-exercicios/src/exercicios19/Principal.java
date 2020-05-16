package exercicios19;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		double espaco = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o espa�o percorrido? Em Km "));
		double tempo = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o tempo gasto? Em horas "));
		double media = (espaco / tempo);
		
		JOptionPane.showMessageDialog(null, "Sua velocidade m�dia � de "+media +" Km/h!");
	}

}
