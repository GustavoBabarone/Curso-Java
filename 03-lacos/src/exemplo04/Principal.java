package exemplo04;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		boolean continuar = true;
		
		do {
			
			try {
			int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade"));
			continuar = false;
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null, "Falha!");
		}
		
		}while(continuar == true);

	}

}
