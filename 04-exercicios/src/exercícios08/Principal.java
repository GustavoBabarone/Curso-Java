package exercícios08;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:"));
		
		for(int indice = 0; indice <= 10; indice--) {
			
			JOptionPane.showMessageDialog(null, indice);
			
		}

	}

}
