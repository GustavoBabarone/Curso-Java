package exercícios03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	
		Object[] codigos = {"1", "2", "3", "4", "5", "6", "7"};
		
		int continuar=0, quantia1=0, quantia2=0, quantia3=0, quantia4=0, quantia5=0, quantia6=0, quantia7=0;
		int quantia=0, continua=0;
		
		do {
		
		int codigo = JOptionPane.showOptionDialog(null, "Qual seu pedido?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, codigos, 0);
		int quantias = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a quantidade desse produto?"));
		
		switch(codigo) {
		case 0:
			quantia1++;
		break;
		
		case 1:
			quantia2++;
		break;
		
		case 2:
			quantia3++;
		break;
		
		case 3:
			quantia4++;
		break;
		
		case 4:
			quantia5++;
		break;
		
		case 5:
			quantia6++;
		break;
		
		case 6:
			quantia7++;
		break;
		}
			
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		}while(continuar == 0);
			
		double total = ((quantia1*5) + (quantia2*4.50) + (quantia3*8) + (quantia4*12) + (quantia5*16.5) + (quantia6*1) + (quantia7*2.50));
		
		JOptionPane.showMessageDialog(null, total);
		
		double dinheiro=0;
		
		do {
		
		dinheiro = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o pagamento"));
			
		}while(dinheiro < total);
		
		JOptionPane.showMessageDialog(null, "Seu troco será de R$ "+(dinheiro - total));
		
		}
		
	}
		
	

