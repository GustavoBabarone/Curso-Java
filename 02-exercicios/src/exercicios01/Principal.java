package exercicios01;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		//Obter dados
		
		String nome = JOptionPane.showInputDialog(null, "Olá, por favor ensira seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Agora ensira sua idade"));
		String cidade = JOptionPane.showInputDialog(null, "Para finalizar, ensira a cidade onde mora");
		
		String mensagem = "Olá "+nome +",";
			   mensagem+= "\nVocê tem "+idade +"anos";
			   mensagem+= "\ne mora em "+cidade;
			
		JOptionPane.showMessageDialog(null, mensagem);
		
	}

}
