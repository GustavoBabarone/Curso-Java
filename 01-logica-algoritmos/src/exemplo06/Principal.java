package exemplo06;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
		
		if(idade >= 18) {
			JOptionPane.showMessageDialog(null, "Maior de idade");
		}else {
			JOptionPane.showMessageDialog(null, "Menor de idade");
		}
	}
}
