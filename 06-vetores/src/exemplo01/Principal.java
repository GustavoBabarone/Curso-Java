package exemplo01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String[] nomes = new String[3];
		
		nomes[0] = JOptionPane.showInputDialog(null, "1º nome");
		nomes[1] = JOptionPane.showInputDialog(null, "2º nome");
		nomes[2] = JOptionPane.showInputDialog(null, "3º nome");
		
		JOptionPane.showMessageDialog(null, nomes[0]);
		JOptionPane.showMessageDialog(null, nomes[1]);
		JOptionPane.showMessageDialog(null, nomes[2]);

	}

}
