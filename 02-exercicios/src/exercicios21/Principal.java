package exercicios21;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		Object[] produto = {"Cal�a", "Camisa", "Casaco", "Meias", "Palet�"};
		Object[] forma = {"� vista", "A prazo 1x", "A prazo 2x"};
		
		int produtos = JOptionPane.showOptionDialog(null, "Qual o produto deseja?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, produto, 0);
		int formas;
		
		switch (produtos) {
		case 0:
			formas = JOptionPane.showOptionDialog(null,  "Qual sua forma de pagamento?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, forma, 0);
		
			switch (formas) {
			case 0:
				JOptionPane.showMessageDialog(null, "Seu produto �: Cal�a, com R$ 150");
			break;
			
			case 1:
				JOptionPane.showMessageDialog(null, "Seu produto �: Cal�a, com R$ 165");
			break;
			
			case 2:
				JOptionPane.showMessageDialog(null, "Seu produto �: Cal�a, com R$ 180");
			break;
			}
		break;
		}
		
		switch (produtos) {
		case 1:
			formas = JOptionPane.showOptionDialog(null, "Qual sua forma de pagamento?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, forma, 0);
			
			switch (formas) {
			case 0:
				JOptionPane.showMessageDialog(null, "Seu produto �: Camisa, com R$ 300");
			break;
			
			case 1:
				JOptionPane.showMessageDialog(null, "Seu produto �: Camisa, com R$ 330");
			break;
			
			case 2:
				JOptionPane.showMessageDialog(null,  "Seu produto �: Camisa, com R$ 360");
			break;
			}
		break;
		}
		
		switch (produtos) {
		case 2:
			formas = JOptionPane.showOptionDialog(null, "Qual sua forma de pagamento?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, forma, 0);
			
			switch (formas) {
			case 0:
				JOptionPane.showMessageDialog(null, "Seu produto �: Casaco, com R$ 250");
			break;
			
			case 1:
				JOptionPane.showMessageDialog(null, "Seu produto �: Casaco, com R$ 275");
			break;
			
			case 2:
				JOptionPane.showMessageDialog(null, "Seu produto �: Casaco, com R$ 300");
			break;
			}
		break;
		}
		
		switch (produtos) {
		case 3:
			formas = JOptionPane.showOptionDialog(null, "Qual sua forma de pagamento?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, forma, 0);
			
			switch (formas) {
			case 0:
				JOptionPane.showMessageDialog(null, "Seu produto �: Meia, com R$ 30");
			break;
			
			case 1:
				JOptionPane.showMessageDialog(null, "Seu produto �: Meia, com R$ 33");
			break;
			
			case 2:
				JOptionPane.showMessageDialog(null, "Seu produto �: Meia, com R$ 36");
			break;
			}
		break;
		}
		switch (produtos) {
		case 4:
			formas = JOptionPane.showOptionDialog(null, "Qual sua forma de pagamento?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, forma, 0);
			
			switch (formas) {
			case 0:
				JOptionPane.showMessageDialog(null, "Seu produto �: Palet�, com R$ 450");
			break;
			
			case 1:
				JOptionPane.showMessageDialog(null, "Seu produto �: Palet�, com R$ 495");
			break;
			
			case 2:
				JOptionPane.showMessageDialog(null, "Seu produto �: Palet�, com R$ 540");
			break;
			}
		break;
		}
	}
}
