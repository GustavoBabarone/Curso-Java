package exercicios04;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog(null, "Qual o nome do produto?");
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor do produto?"));
		double forma = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a forma de pagamento? 1-� vista  2-� prazo"));
	
		if((valor >= 500) && (forma == 1)) {
		
		String mensagem = "Voc� comprou: "+nome;
			   mensagem+= "\nDesconto de 10%, total de R$ "+valor*0.9;
			   mensagem+= "\nForma de pagamento: "+forma;
	   
		JOptionPane.showMessageDialog(null, mensagem);
		}else if(valor < 400) {
			
		String mensagem2 = "Voc� comprou: "+nome;
			   mensagem2+= "\nSem desconto, total de R$ "+valor;
			   mensagem2+= "\nForma de pagamento: "+forma;
				   
		JOptionPane.showMessageDialog(null,  mensagem2);
		}
	}
}
