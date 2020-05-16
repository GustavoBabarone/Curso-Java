package exercicios32;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o orçamento:"));
		
		String total = "Tabela do orçamento:";
			   total+= "\n5% - 30 dias: R$ " +valor*1.05;
			   total+= "\n10% - 60 dias: R$ " +valor*1.10;
			   total+= "\n20% - 90 dias: R$ " +valor*1.20;
			   total+= "\n30% - 120 dias: R$ " +valor*1.30;
			   total+= "\n40% - 180 dias: R$ " +valor*1.40;
			   total+= "\n50% - 270 dias: R$ " +valor*1.50;
		
		JOptionPane.showMessageDialog(null,  total);
	}
}
