package exemplo13;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		try {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("idade"));
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null, "Falha ao obter a idade: "+erro.getMessage());
		}finally {
			JOptionPane.showMessageDialog(null, "Sistema finalizado");
		}
	}

}
