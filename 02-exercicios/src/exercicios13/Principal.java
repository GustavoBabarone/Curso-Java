package exercicios13;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual seu n�mero?"));
		int sucessor = (numero + 1);
		int antecessor = (numero - 1);
		
		String mensagem = "Sucessor: "+sucessor;
			   mensagem+= "\nAntecessor: "+antecessor;
			   
		JOptionPane.showMessageDialog(null,  mensagem);

	}

}
