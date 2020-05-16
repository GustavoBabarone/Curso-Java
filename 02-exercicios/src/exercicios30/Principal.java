package exercicios30;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		// Coletando as vari�veis
		
		int hora = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe valor ganho por hora:"));
		int trab = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de horas trabalhadas normalmente:"));
		int extra = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de horas trabalhadas com 100% de acr�cimo:"));
		int salario = (hora*trab) + (extra*trab*2);
				
		// Executando as vari�veis
		
		JOptionPane.showMessageDialog(null,  "Sal�rio bruto:"+salario);
	}

}
