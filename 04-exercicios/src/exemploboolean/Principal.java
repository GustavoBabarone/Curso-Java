package exemploboolean;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		boolean continuar = true;
		
		do {
			
			int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:"));
			if(numero == 0) {
				continuar = false;
			}
			
		}while(continuar == true);

	}

}
