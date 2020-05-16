package exemplo03;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Hoje ? ter�a-feira");
		JOptionPane.showMessageDialog(null, "Erro", "T?T�tulo", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "Perigo", "T?T�tulo", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Tudo bem?", "T?T�tulo", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Isso � Java", "T�tulo", JOptionPane.INFORMATION_MESSAGE);

		String nome = JOptionPane.showInputDialog("Informe seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe usa altura"));

		String mensagem = "Nome: "+nome;
			   mensagem+= "\nIdade: "+idade;
			   mensagem+= "\nAltura: "+altura;

		JOptionPane.showMessageDialog(null, mensagem);

		int resposta = JOptionPane.showConfirmDialog(null, "Gostando de Java?");

		switch(resposta) {
			case 0:
				JOptionPane.showMessageDialog(null, "Que legal!");
			break;

			case 1:
				JOptionPane.showMessageDialog(null, "Que pena");
			break;

			case 2:
				JOptionPane.showMessageDialog(null, "Voce cancelou");
			break;

			default:
				JOptionPane.showMessageDialog(null, "Voce finalizou");
		}

	}

}
