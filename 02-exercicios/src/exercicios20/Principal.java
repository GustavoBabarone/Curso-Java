package exercicios20;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		Object[] estados = {"Santa Catarina", "Paran�", "Rio Grande do Sul"};
		Object[] cidade1 = {"Blumenau", "Pomerode", "Florian�polis"};
		Object[] cidade2 = {"Curitiba", "Foz do Igua�u", "Capanema"};
		Object[] cidade3 = {"Porto Alegre", "Gramado", "Canela"};
		
		int estado = JOptionPane.showOptionDialog(null, "Qual seu estado?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, estados, 0);
		int cidade;
		
		switch (estado) {
		case 0:
			cidade = JOptionPane.showOptionDialog(null,  "Qual sua cidade?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, cidade1, 0);
			
			switch (cidade) {
			case 0:
				JOptionPane.showMessageDialog(null, "Popula��o: 352,4 mil habitantes \nIDH: 0.855");
			break;
			
			case 1:
				JOptionPane.showMessageDialog(null, "Popula��o: 25,000 mil habitantes \nIDH: 0.789");
			break;
			
			case 2:
				JOptionPane.showMessageDialog(null, "Popula��o: 477,798 mil habitantes \nIDH: 0.847");
			break;
			}
		break;
		}
		
		switch (estado) {
		case 1:
			cidade = JOptionPane.showOptionDialog(null, "Qual sua cidade?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, cidade2, 0);
			
			switch (cidade) {
			case 0:
				JOptionPane.showMessageDialog(null, "Popula��o: 1,765 milh�es habitantes \nIDH: 0.823");
			break;
			
			case 1:
				JOptionPane.showMessageDialog(null, "Popula��o: 253,962 mil habitantes \nIDH: 0.751");
			break;
			
			case 2:
				JOptionPane.showMessageDialog(null,  "Popul��o: 18,512 mil habitantes \nIDH: 0.655");
			break;
			}
		break;
		}
		
		switch (estado) {
		case 2:
			cidade = JOptionPane.showOptionDialog(null, "Qual sua cidade?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, cidade3, 0);
			
			switch (cidade) {
			case 0:
				JOptionPane.showMessageDialog(null,  "Popula��o: 1,409 milh�o habitantes \nIDH:0.805");
			break;
			
			case 1:
				JOptionPane.showMessageDialog(null,  "Popula��o: 31,655 mil habitantes \nIDH: 0.764");
			break;
			
			case 2:
				JOptionPane.showMessageDialog(null, "Popula��o: 42,746 mil habitantes \nIDH: 0.748");
			break;
			}
		break;
		}
	}
}
