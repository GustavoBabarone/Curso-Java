package exercicios16;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		int pedido = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem vindo ao Caf�Loko! O que deseja? \n1-Hamb�rguer + Suco de Laranja - R$ 5,00  \n2-Sandu�che natural + Suco de Uva - R$ 4,50 "
		+"\n3-Prato do dia - R$ 8,00  \n4-Pizza - R$12,00 \n5-Lasanha - R$ 16,50 \n6-P�o de queijo - R$ 1,00 \n7-Bolo - R$ 2,50 "));
		double pagamento = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a quantia de pagamento?"));
		
		if(pedido == 1) {
			JOptionPane.showMessageDialog(null,  "Seu troco ser� de R$ "+(pagamento - 5));
		}else if(pedido == 2) {
			JOptionPane.showMessageDialog(null, "Seu troco ser� de R$ "+(pagamento - 4.50));
		}else if(pedido == 3) {
			JOptionPane.showMessageDialog(null, "Seu troco ser� de R$ "+(pagamento - 8.00));
		}else if(pedido == 4) {
			JOptionPane.showMessageDialog(null, "Seu troco ser� de R$ "+(pagamento - 12.00));
		}else if(pedido == 5) {
			JOptionPane.showMessageDialog(null, "Seu troco ser� de R$ "+(pagamento - 16.50));
		}else if(pedido == 6) {
			JOptionPane.showMessageDialog(null, "Seu troco ser� de R$ "+(pagamento - 1.00));
		}else if(pedido == 7) {
			JOptionPane.showMessageDialog(null, "Seu troco ser� de R$ "+(pagamento - 2.50));
		}
		
	}

}
