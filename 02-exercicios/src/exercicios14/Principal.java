package exercicios14;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o valor do ve�culo?"));
		
		if(valor <= 12000) {
			JOptionPane.showMessageDialog(null, "O valor do carro sem % do distribuidor e Imposto � de R$ "+(valor - (valor*0.05)));
			JOptionPane.showMessageDialog(null, "O valor do % do distribuidor � de R$"+valor*0.05 +"\nEste carro n�o apresenta imposto!");
		}else if((valor > 12000) && (valor <= 25000)) {
			JOptionPane.showMessageDialog(null,  "O valor sem % do distribuidor e Imposto � de R$ "+(valor - (valor*0.10) - (valor*0.15)));
			JOptionPane.showMessageDialog(null, "O valor do % do distribuidor � de R$"+valor*0.10 +"O valor de imposto � de R$ "+valor*0.15);
		}else if(valor > 25000) {
			JOptionPane.showMessageDialog(null, "O valor sem % do distribuidor e Imposto � de R$ "+(valor - (valor*0.15) - (valor*0.20)));
			JOptionPane.showMessageDialog(null, "O valor do % do distribuidor� de R$"+valor*0.15 +"O valor de imposto � de R$ "+valor*0.20);
		}
		
	}

}
