package exercicios12;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		int maxima = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a velocidade m?xima permitida?"));
		int velocidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a velocidade do seu ve?culo?"));

		if(maxima >= velocidade) {
			JOptionPane.showMessageDialog(null, "Parab?ns! Bom motorista");
		}else if((velocidade > maxima) && (velocidade <= (maxima + 10))) {
			JOptionPane.showMessageDialog(null,  "Que pena! Multa de R$50");
		}else if((velocidade >= (maxima + 11) && (velocidade <= (maxima + 30)))) {
			JOptionPane.showMessageDialog(null,  "Que pena! Multa de R$100");
		}else if(velocidade > (maxima + 30)) {
			JOptionPane.showMessageDialog(null,  "DEVAGAR CARAIO! Multa de R$200");
		}
		
	}

}
